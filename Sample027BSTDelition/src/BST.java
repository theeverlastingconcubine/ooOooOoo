import java.util.Iterator;
import java.util.LinkedList;

public class BST<Key extends Comparable<Key>, Value> implements Iterable<Key> {
	
	private Node root;
	
	private class Node{
		Node left;
		Node right;
		Value value;
		Key key;
		
		public Node(Key key, Value value){
			this.key = key;
			this.value = value;
		}
			
	}
	
	
	public void put(Key key, Value value){
		root = put(root, key, value);
	}
	
	private Node put(Node x, Key key, Value value){
		
		if(x==null) return new Node(key, value);
		
		int cmp = key.compareTo(x.key);
		if(cmp>0) x.right = put(x.right, key, value);
		else if(cmp<0) x.left = put(x.left, key, value);
		else x.value = value;
		return x;
				
	}
	
	public Value get(Key key){
		Node x = get(root, key);
		if(x!=null) return x.value;
		else return null;
		
		
	}
	
	private Node get(Node x, Key key){
		
		if(x==null) return null;
		int cmp = key.compareTo(x.key);
		if (cmp>0) return get(x.right, key);
		else if (cmp<0) return get(x.left, key);
		else return x;
				
	}
	
	
	public Key max(){
		Node x = root;
		while(x.right!=null) x = x.right;
		return x.key;
	}
	
	
	
	
	
	public void deleteMin(){
		root = deleteMin(root);
		
	}
	
	private Node deleteMin(Node x){
		
		if(x.left==null) return x.right;
		
		else x.left = deleteMin(x.left);
		
		return x;
		
	}
	
	private Node min(Node x){
		if (x.left == null) return x;
		else return min(x.left);
		
	}
	
	public Key min(){
		return min(root).key;
	}
	
	
	private Node delete(Node x, Key key){
		
		if(x==null) return null;
		int cmp = key.compareTo(x.key);
		
		if(cmp>0) x.right = delete(x.right, key);
		else if (cmp<0) x.left = delete(x.left, key);
		
		
		else {
			
			if(x.left == null) return x.right;
			if(x.right == null) return x.left;
			
			Node t = x;
			x = min(t.right);
			x.right = deleteMin(t.right);
			x.left = t.left;
			
		}
		return x;	
		
	}
	
	public void delete(Key key){
		root = delete(root, key);
	}
	
	
	
	//smallest key above given
	public Key ceiling(Key key){
		Node x = ceiling(root, key);
		if(x==null) return null;
		return x.key;
			
	}
	
	private Node ceiling(Node x, Key key){
		
		if(x==null) return null;
		int cmp = key.compareTo(x.key);
		if(cmp==0) return x;
		if(cmp<0) {
			Node t = ceiling(x.left, key);
			if(t!=null) return t;
			else return x;		
		}
		return ceiling(x.right, key);
	
	}
	
	//iterator shit
	
	public Iterator<Key> iterator(){
		return new BSTiterator(root);
		
	}
	
	private class BSTiterator implements Iterator<Key>{
		
		LinkedList<Node> stack;
		
		
		public BSTiterator(Node x){
			stack = new LinkedList<Node>();
			while(x!=null){
				stack.push(x);  //least element of subtree is
				x = x.left;		//on the top
			}
						
		}
			
		public boolean hasNext(){
			return !stack.isEmpty();
				
		}
		
		public Key next(){
			
			Node node = stack.pop();
			Key key = node.key;
			
			if(node.right != null) {
				node = node.right;
				while(node!=null){
					stack.push(node);
					node = node.left;
				}
			}
	
			return key;
		}
		
	}
	

}
