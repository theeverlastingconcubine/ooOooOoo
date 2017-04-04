import java.util.ArrayList;

public class BST<Key extends Comparable<Key>, Value> {
	
	private Node root;
	
	private class Node{
		
		private Node left;
		private Node right; 
		private Value value;
		private Key key;
		
		public Node(Key key, Value value){
			this.key = key;
			this.value = value;
		}
		
		public String toString(){
			return "[" + key + /*", " + value +*/ "]";
		}
		
	}
	
	public void put(Key key, Value value){
		root = put(root, key, value);
	}
	
	
	private Node put(Node x, Key key, Value value){
		
		if(x==null) return new Node(key, value);
		
		int cmp = key.compareTo(x.key);
		
		if(cmp<0) x.left = put(x.left, key, value);
		else if(cmp>0) x.right = put(x.right, key, value);
		else x.value = value;
		
		return x;
			
	}
	
	public Value get(Key key){
		return get(root, key).value;
	}
	
	private Node get(Node x, Key key){
		
		if(x==null) return null;
		
		int cmp = key.compareTo(x.key);
		
		if(cmp<0) return get(x.left, key);
		else if(cmp>0) return get(x.right, key);
		else return x;
				
	}
	
	
	
	private Node delete(Node x, Key key){
		
		if(x==null) return null;
		int cmp = key.compareTo(x.key);
		
		if(cmp>0) delete(x.right, key);
		else if (cmp<0) delete(x.left, key);
		else{ 
			if(x.left == null) return x.right;
			if(x.right == null) return x.left;
			
			Node t = x; 
			x = getMin(x.right);
			x.right = delMin(t.right);
			x.left = t.left;
		}
		
		return x;
		
		
		
	}
	
	
	
	
	public Value getMin(){
		if (root==null) return null;
		else return getMin(root).value;
	}
	
	
	private Node getMin(Node x){
		
		if(x.left == null) return x;
		return getMin(x.left);
			
	}
	
	private Node delMin(Node x){
	
		if(x.left==null) return x.right;
		x.left = delMin(x.left);
		return x;
		
	}
	
	public void delMin(){
		root = delMin(root);
	}
	
	private Node getMax(Node x){
		
		if(x.right == null) return x;
		return getMax(x.right);
			
	}
	
	
	
	
	//attempt to print bst somehow
	
	
	
	public int leftDepth(){
		return depth(getMin(root));
	}
	public int rightDepth(){
		return depth(getMax(root));
	}
	
	private int depth(Node x){
		return depth(root, x, 1);
	}
	
	private int depth(Node x, Node target, int depthX){
		
		if(target==null) return -1;
		
		int cmp = target.key.compareTo(x.key);
		if(cmp>0) return depth(x.right, target, depthX+1);
		else if(cmp<0) return depth(x.left, target, depthX+1);
		else return depthX;
				
	}
	
	//create list of lists (level by level)
	
	private ArrayList<ArrayList<Node>> levels(){
		ArrayList<ArrayList<Node>> levels = new ArrayList<ArrayList<Node>>();
		collect(root, levels, 0);
		return levels;
	}
		
	private void collect(Node x, ArrayList<ArrayList<Node>> lists, int level){
		if(x==null) return;
		if(level>=lists.size()) lists.add(new ArrayList<Node>());
		lists.get(level).add(x);
		collect(x.left, lists, level+1);
		collect(x.right, lists, level+1);
					
	}
	
	public String levelList(){
		ArrayList<ArrayList<Node>> levels = levels();
		String s = "";
		for(ArrayList<Node> x: levels){
			for(Node node: x) {
				s = s + node;
			}
			s = s + "\n";
		}
		
		return s;
	}
	
	
	
	

}
