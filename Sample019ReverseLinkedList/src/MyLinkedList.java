import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<T> implements Iterable<T> {

	private Node head;

	private class Node {

		private Node next;
		private T value;

		public Node(T value, Node next) {
			this.value = value;
			this.next = next;
		}

	}

	public void add(T item) {
		head = new Node(item, head);
	}

	// iterator

	public Iterator<T> iterator() {
		return new LinkedListIterator();
	}

	private class LinkedListIterator implements Iterator<T> {

		private Node current = head;

		public boolean hasNext() {
			return current != null;
		}

		public T next() {
			if (current == null)
				throw new NoSuchElementException();
			T next = current.value;
			current = current.next;
			return next;
		}

	}

	// reverse
	public MyLinkedList<T> reverse() {

		Node prev = null;
		Node current = head;
		Node next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		head = prev;
		return this;
	}

	public static void main(String[] args) {

		MyLinkedList<String> list = new MyLinkedList<String>();

		list.add("111ONE");
		list.add("222TWO");
		list.add("333THREE");
		list.add("444FOUR");
		list.add("555FIVE");
		list.add("666SIX");

		for (String s : list)
			System.out.println(s);
		System.out.println("---------------");

		list = list.reverse();
		for (String s : list)
			System.out.println(s);

	}

}
