import java.util.Iterator;

//enumeration goes from 1

public class MyLinkedList<T> implements Iterable<T> {

	private Node first = null;
	private int N = 0;

	private class Node {

		private Node next;
		private T value;

		public Node(T value, Node next) {

			this.value = value;
			this.next = next;
		}

	}

	public void add(T item) {

		Node newNode = new Node(item, first);
		first = newNode;
		N++;

	}

	public boolean isEmpty() {
		return N == 0;
	}

	public int size() {
		return N;
	}

	public int searchItem(T value) {

		int i = 1;
		Node currentNode = first;

		while (currentNode.value != value && currentNode.next != null) {
			currentNode = currentNode.next;
			i++;
		}

		if (i == N && currentNode.value == value)
			return i;
		else
			return -1000;

	}
	
	
	

	// iterator shit

	public Iterator<T> iterator() {
		return new ListIterator();
	}

	private class ListIterator implements Iterator<T> {

		Node currentNode = first;

		public boolean hasNext() {

			return currentNode != null;
		}

		public T next() {

			T value = currentNode.value;
			currentNode = currentNode.next;
			return value;

		}

	}

}
