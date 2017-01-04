import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

	Node first = null;

	private class Node {

		private Node next;
		private T value;

		private Node(T value, Node next) {

			this.next = next;
			this.value = value;

		}

		public String toString(){
			if (next!=null)	return value + "  " + next.value;
			else return (String) value;
		}
	}

	public Iterator<T> iterator() {

		return new ListIterator();

	}

	private class ListIterator implements Iterator<T> {

		private Node current = first;

		public boolean hasNext() {

			return current != null;
		}

		public T next() {
			if (hasNext() == true) {
				T val = current.value;
				current = current.next;
				return val;
			} else
				return null;
		}

	}

	public void add(T value) {
		Node iAmTheNewNode = new Node(value, first);
		first = iAmTheNewNode;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public int find(T vallue) {

		int cnt = 1;
		Node ccurrent = first;

		while (ccurrent.value != vallue) {
			System.out.println(ccurrent.value + "   " + ccurrent.next);
			ccurrent = ccurrent.next;
			cnt++;
		}

		return cnt;

	}

}
