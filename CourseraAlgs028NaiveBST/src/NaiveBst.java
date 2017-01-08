import java.util.LinkedList;

public class NaiveBst<Key extends Comparable<Key>, Value> {

	private Node root;

	private class Node {

		private Key key;
		private Value val;
		private Node left;
		private Node rigth;

		public Node(Key key, Value val) {
			this.key = key;
			this.val = val;
		}

	}

	public void put(Key key, Value val) {

		root = put(root, key, val);

	}

	private Node put(Node x, Key key, Value val) {

		if (x == null)
			return new Node(key, val);
		int compare = key.compareTo(x.key);

		if (compare < 0)
			x.left = put(x.left, key, val);
		else if (compare > 0)
			x.rigth = put(x.rigth, key, val);
		else
			x.val = val;
		return x;

	}

	// cost 1+depth(node)
	public Value get(Key key) {

		Node currentNode = root;

		while (currentNode != null) {
			int compare = key.compareTo(currentNode.key);

			if (compare < 0)
				currentNode = currentNode.left;
			else if (compare > 0)
				currentNode = currentNode.rigth;
			else
				return currentNode.val;
		}

		return null;

	}

	public void delete(Key key) {

	}

	public Iterable<Key> keys() {

		return keys(min(), max());

	}

	public Key min() {
		return min(root).key;
	}

	private Node min(Node x){
		if (x.left == null) return x;
		else return min(x.left);
	}
	
	public Key max() {
		return max(root).key;
	}

	private Node max(Node x){
		if (x.rigth ==null) return x;
		else return max(x.rigth);
	}


	public Iterable<Key> keys(Key lo, Key hi) {

		LinkedList<Key> list = new LinkedList<Key>();
		keys(root, list, lo, hi);
		return list;

	}

	private void keys(Node x, LinkedList<Key> list, Key lo, Key hi) {

		if (x == null)
			return;
		int comparelo = lo.compareTo(x.key);
		int comparehi = hi.compareTo(x.key);

		if (comparelo < 0)
			keys(x.left, list, lo, hi);
		if (comparelo <= 0 && comparehi >= 0)
			list.add(x.key);
		if (comparehi > 0)
			keys(x.rigth, list, lo, hi);
	}

}
