import java.util.LinkedList;

public class SSST<Key, Value> {

	private int n;
	private Node first;

	private class Node {

		private Key key;
		private Value val;
		private Node next;

		public Node(Key key, Value val, Node next) {

			this.key = key;
			this.val = val;
			this.next = next;

		}

	}

	/*
	 * public SSST(){
	 * 
	 * }
	 */

	public int size() {
		return n;
	}

	public boolean isEmpty() {

		return size() == 0;
	}

	public boolean contains(Key key) {

		if (key == null)
			throw new IllegalArgumentException("Argument is null. WRONG.");
		for (Node x = first; x != null; x = x.next) {
			if (x.key.equals(key))
				return true;
		}
		return false;

	}

	public Value get(Key key) {

		if (key == null)
			throw new IllegalArgumentException("You've entered null");
		for (Node x = first; x != null; x = x.next) {
			if (key.equals(x.key)) {
				return x.val;
			}

		}

		return null;

	}

	public void put(Key key, Value val) {

		if (key == null)
			throw new IllegalArgumentException("your key is null");
		if (val == null) {
			delete(key);
			return;
		}

		for (Node x = first; x != null; x = x.next) {
			if (key.equals(x.key)) {
				x.val = val;
				return;
			}
		}

		Node newfirst = new Node(key, val, first);
		newfirst.next = first;
		first = newfirst;
		n++;

	}

	public void delete(Key key) {
		if (key == null)
			throw new IllegalArgumentException("your key is null");
		
		first = delete(first, key);
		
		

	}

	private Node delete(Node x, Key key) {

		if (x == null)
			return null;
		if (key.equals(x.key)) {
			n--;
			return x.next;
		}
		x.next = delete(x.next, key);
		return x;
	}
	
	
	public Iterable<Key> keys(){
		
		LinkedList<Key> queuee = new LinkedList<Key>();
		
		for (Node x=first; x!=null; x=x.next)
			queuee.add(x.key);
		return queuee;		
	}
	
	

}
