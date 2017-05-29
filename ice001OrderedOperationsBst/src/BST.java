import java.util.ArrayList;

public class BST<Key extends Comparable<Key>, Value> {
	
	private Node root;
	
	public class Node{
		private Node left;
		private Node right;
		private Key key;
		private Value value;
		
		private Node(Key key, Value value){
			this.key = key;
			this.value = value;
		}
		
		public String toString(){
			return "(" + key + ", " + value + ")";
		}
		
	}
	
	private Node put(Node x, Key key, Value value){
		
		if(x==null) return new Node(key, value);
		int cmp = key.compareTo(x.key);
		
		if(cmp>0) x.right = put(x.right, key, value);
		else if(cmp<0) x.left = put(x.left, key, value);
		else x.value = value;
		return x;		
	}
	
	public void put(Key key, Value value){
		root = put(root, key, value);
	}
	
	
	public Value search(Key key){
		
		if(root==null) return null;
		Node x = root;
			
		while(x!=null){
			
			int cmp = key.compareTo(x.key);
			if(cmp<0) x = x.left;
			else if(cmp>0) x=x.right;
			else return x.value;
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
	

	
	

}
