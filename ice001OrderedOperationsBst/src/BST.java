import java.util.ArrayList;

public class BST<Key extends Comparable<Key>, Value> {
	
	private Node root;
	
	public class Node{
		
		private Node left;
		private Node right;
		private Key key;
		private Value value;
		private int size = 1;
		
		private Node(Key key, Value value){
			this.key = key;
			this.value = value;
		}
		
		public String toString(){
			return "(" + key + ", " + value +")" + "("+size+")";
		}
		
	}
	
	private int size(Node x){
		if (x!=null) return x.size;
		else return 0;
	}
	
	private Node put(Node x, Key key, Value value){
		
		if(x==null) return new Node(key, value);
		int cmp = key.compareTo(x.key);
		
		if(cmp>0) x.right = put(x.right, key, value);
		else if(cmp<0) x.left = put(x.left, key, value);
		else x.value = value;
		
		x.size = 1 + size(x.left) + size(x.right);
		
		return x;		
	}
	
	public void put(Key key, Value value){
		root = put(root, key, value);
	}
	
	public Value search(Key key){
		Node x = searchNode(key);
		if(x==null) return null;
		else return x.value;
	}
	
	
	private Node searchNode(Key key){
		
		if(root==null) return null;
		Node x = root;
			
		while(x!=null){
			
			int cmp = key.compareTo(x.key);
			if(cmp<0) x = x.left;
			else if(cmp>0) x=x.right;
			else return x;
		}
		return null;
		
	}
	
	public ArrayList<ArrayList<Node>> levels(){
		
		ArrayList<ArrayList<Node>> result = new ArrayList<ArrayList<Node>>();
		
		ArrayList<Node> currentLevel = new ArrayList<Node>();
		if(root!=null) currentLevel.add(root);
		result.add(currentLevel);
		
		while(true){		
		ArrayList<Node> nextLevel = new ArrayList<Node>();
		for(Node x : currentLevel){
			if(x.left!=null) nextLevel.add(x.left);
			if(x.right!=null) nextLevel.add(x.right);
		}
			if(nextLevel.size()==0) break;
			result.add(nextLevel);
			currentLevel = nextLevel;
		}
		return result;
		
	}
	
	//ceiling is the smallest key which is greater than KEY. 
	
	public Key ceiling(Key key){
		Node x = ceiling(root, key);
		if(x==null) return null;
		return x.key;
	}
	
	
	private Node ceiling(Node x, Key key){
		
		if(x==null) return null;
		
		int cmp = key.compareTo(x.key);
		
		if(cmp==0) return x;
		if(cmp>0) return ceiling(x.right, key);
		
		Node t = ceiling(x.left, key);
		if(t!=null) return t;
		else return x;
		
						
	}
	
	public Key floor(Key key){
		Node x = floor(root, key);
		if(x==null) return null;
		return x.key;
	}
	
	private Node floor(Node x, Key key){
		if(x==null) return null;
		int cmp = key.compareTo(x.key);
		
		if(cmp==0) return x;
		
		//floor is the largest key less then x
		
		if(cmp<0) return floor(x.left, key);
		
		Node t = floor(x.right, key);
		if(t!=null) return t;
		else return x;
		
		
	}
	
	//rank is how much keys are (strictly) less then current
	
	public int rank(Key key){
		return rank(root, key);
			
	}
	
	private int rank(Node x, Key key){
		
		if(x==null) return 0;
		
		int cmp = key.compareTo(x.key);
		
		if(cmp<0) return rank(x.left, key);
		else if(cmp>0) return 1 + size(x.left) + rank(x.right, key);
		else return size(x.left);
		
	}
	
	
	// select returns a key with a given rank
	
	public Key select(int k){
		Node x = select(root, k);
		if(x!=null) return x.key;
		return null;
	}
	
	
	
	private Node select(Node x, int k){
		
		if(x==null) return null;
		
		int t = size(x.left);
		
		if (t>k) return select(x.left, k);
		else if (t<k) return select (x.right, k-(t+1)); // we already have t + current node, so
														// search right to obtain more nodes
		else return x;
		
	}
	
	public int size(){
		return size(root);
	}
	
	
	

	
	

}
