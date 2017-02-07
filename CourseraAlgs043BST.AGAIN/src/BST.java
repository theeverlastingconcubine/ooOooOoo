import java.util.ArrayList;

public class BST<Key extends Comparable<Key>, Value> {

	private Node root;
	

	private class Node {

		private Node left;
		private Node right;
		private Key key;
		private Value value;

		private Node(Key key, Value value) {

			this.key = key;
			this.value = value;
		}

	}

	public void insert(Key key, Value value) {

		root = insert(key, value, root);

	}

	private Node insert(Key key, Value value, Node node) {

		if (node == null)
			return new Node(key, value);

		int cmp = key.compareTo(node.key);

		if (cmp < 0)
			node.left = insert(key, value, node.left);
		else if (cmp > 0)
			node.right = insert(key, value, node.right);
		else
			node.value = value;

		return node;

	}

	public Value get(Key key) {

		return get(key, root);

	}

	private Value get(Key key, Node node) {

		if (node == null)
			return null;

		int cmp = key.compareTo(node.key);

		if (cmp < 0)
			return get(key, node.left);
		else if (cmp > 0)
			return get(key, node.right);
		else
			return node.value;

	}
	
	public Iterable<Key> listBST(){
		ArrayList<Key> listBST = new ArrayList<Key>();
		indorder(root, listBST);
		return listBST;
	}
	
	
	private void indorder(Node node, ArrayList<Key> list){
			
		
		if(node == null) return;
		
		indorder(node.left, list);
		list.add(node.key);
		indorder(node.right, list);
			
	}
	
	

	
	
	
	

}
