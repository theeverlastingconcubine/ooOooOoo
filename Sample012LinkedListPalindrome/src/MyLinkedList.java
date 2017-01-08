import java.util.Iterator;

public class MyLinkedList<Value> implements Iterable<Value> {

	private Node first = null;
	private int size = 0;

	private class Node {

		private Node next;
		private Value val;

		public Node(Value val, Node next) {
			this.val = val;
			this.next = next;
		}

		public String toString() {
			return val + " ";
		}

	}

	public void addToTail(Value val) {

		Node weAdd = new Node(val, null);
		Node currentNode = first;

		if (first != null) {
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = weAdd;
		} else
			first = weAdd;
		size++;
	}

	public int size() {
		return size;
	}

	public Node showFirst() {
		return first;
	}

	public String toString() {
		String l = "";

		if (first == null) {
			return "List is empty";
		}

		else {
			for (Node x = first; x != null; x = x.next) {
				l = l + "[ " + x.val + " ]" + "--->";
			}
		}
		return l;
	}

	public MyLinkedList<Value> reverse() {
		MyLinkedList<Value> reversedlist = new MyLinkedList<Value>();

		Node nodeToCopy;

		int s = size;

		while (s > 0) {

			nodeToCopy = first;

			for (int k = 0; k < s - 1; k++) {
				nodeToCopy = nodeToCopy.next;
			}

			reversedlist.addToTail(nodeToCopy.val);
			s--;
		}

		return reversedlist;
	}

	public boolean isEqual(MyLinkedList<Value> list1, int ind1_1, int ind1_2, MyLinkedList<Value> list2, int ind2_1,
			int ind2_2) {

		assert (ind2_2 < list2.size());
		assert (ind1_2 < list1.size());

		int range = ind2_2 - ind2_1;

		if (range != ind1_2 - ind1_1)
			return false;

		Node currentNode1 = list1.first;
		Node currentNode2 = list2.first;

		for (int i1 = 0; i1 < ind1_1; i1++) {
			currentNode1 = currentNode1.next;
		}
		for (int i1 = 0; i1 < ind2_1; i1++) {
			currentNode2 = currentNode2.next;
		}

		for (int i = 0; i < range; i++) {
			if (currentNode1.val != currentNode2.val)
				return false;
			currentNode1 = currentNode1.next;
			currentNode2 = currentNode2.next;
		}
		return true;
	}

	public boolean isPalindrome() {

		int middle = size / 2;

		return isEqual(this, 0, middle, reverse(), 0, middle);

	}

	// iterator stuff

	public Iterator<Value> iterator() {
		return new MyLinkedListIterator();
	}

	private class MyLinkedListIterator implements Iterator<Value> {

		private Node currentNode = first;

		public boolean hasNext() {

			if (currentNode == null)
				return false;
			return currentNode != null;

		}

		public Value next() {

			if (hasNext()) {

				Value val = currentNode.val;
				currentNode = currentNode.next;
				return val;
			}

			else
				return null;

		}

	}

}
