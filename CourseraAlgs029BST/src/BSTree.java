import java.util.LinkedList;

public class BSTree<Key extends Comparable<Key>, Value> {

	private Node root;

	private class Node {

		private Key key;
		private Value value;
		private Node leftt;
		private Node right;
		private int N; // amount of nodes in the tree rooter here

		public Node(Key key, Value value, int N) {
			this.key = key;
			this.value = value;
			this.N = N;

		}
	}

	private int size(Node x) {
		if (x == null)
			return 0;
		else
			return x.N;

	}

	private int size() {
		return size(root);
	}

	public Value get(Key key) {
		return get(root, key);

	}

	// taking a node x there is a tree rooted at x
	// we want to return value with a certain KEY in that tree
	// if there is no such key, return null

	private Value get(Node x, Key key) {

		if (x == null)
			return null;
		int cmp = key.compareTo(x.key);
		if (cmp > 0)
			return get(x.right, key);
		else if (cmp < 0)
			return get(x.leftt, key);
		else
			return x.value;

	}

	public void put(Key key, Value value) {
		root = put(root, key, value);
	}

	private Node put(Node x, Key key, Value value) {

		if (x == null)
			return new Node(key, value, 1);

		int cmp = key.compareTo(x.key);

		if (cmp < 0)
			x.leftt = put(x.leftt, key, value);
		else if (cmp > 0)
			x.right = put(x.right, key, value);
		else
			x.value = value;

		x.N = size(x.leftt) + size(x.right) + 1;
		return x;

	}

	public Key min() {
		return min(root).key;
	}

	private Node min(Node x) {
		if (x.leftt == null) return x;
		else return min(x.leftt);
	}

	public Key max() {
		return max(root).key;

	}

	private Node max(Node x) {

		if (x.right == null) return x;
		else return max(x.right);

	}

	public Iterable<Key> keys() {
		return keys(min(), max());

	}

	public Iterable<Key> keys(Key lo, Key hi) {
		LinkedList<Key> list = new LinkedList<Key>();
		keys(root, list, lo, hi);
		return list;
	}

	private void keys(Node x, LinkedList<Key> list, Key lo, Key hi) {

		if (x == null)
			return;
		int cmplo = lo.compareTo(x.key);
		int cmphi = hi.compareTo(x.key);
		if (cmplo < 0)
			keys(x.leftt, list, lo, hi);
		if (cmplo <= 0 && cmphi >= 0)
			list.addFirst(x.key);
		if (cmphi > 0)
			keys(x.right, list, lo, hi);

	}
	
	
	public Key floor(Key key){
		Node x = floor(root, key);
		if (x==null) return null;
		else return x.key;
	}
	
	private Node floor(Node x, Key key){
		if(x==null) return null;
		int cmp = key.compareTo(x.key);
		if(cmp==0) return x;
		if(cmp<0) return floor(x.leftt, key);
		
		Node t = floor(x.right, key);
		if (t!=null) return t;
		else return x;
			
	}
	
	public void deleteMin(){
		root = deleteMin(root);
	}
	
	
	private Node deleteMin(Node x){
		
		if (x.leftt ==null) return x.right;
		x.leftt = deleteMin(x.leftt);
		x.N = size(x.leftt) + size(x.right) + 1;
		return x;
		
	}
	
	
	public void delete(Key key){
		root = delete(root, key);
	}
	
	private Node delete(Node x, Key key){
		if (x==null) return null;
		int cmp = key.compareTo(x.key);
		if (cmp<0) x.leftt = delete(x.leftt, key);
		else if(cmp>0) x.right = delete(x.right, key);
		else{
			if(x.right ==null ) return x.leftt;
			if (x.leftt == null) return x.right;
			Node t=x;
			x = min(t.right);
			x.right = deleteMin(t.right);
			x.leftt = t.leftt;
		}
		
		x.N = size(x.leftt) + size(x.right) +1;
		return x;
	}

}
