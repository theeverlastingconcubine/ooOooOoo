import java.util.ArrayList;

public class BST<Key extends Comparable<Key>, Value> {
	
	private Node root; 
	
	public class Node{
		private Node left;
		private Node right;
		private Value value; 
		private Key key;
		
		public Node(Key key, Value value){
			this.key = key;
			this.value = value;
		}
		
		public String toString(){
			return "[" + key + ", " + value + "]";
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
	
	public ArrayList<ArrayList<Node>> levels(){
		
		if(root==null) return null;
		
		ArrayList<ArrayList<Node>> result = new ArrayList<ArrayList<Node>>();
		ArrayList<Node> currentLevel = new ArrayList<Node>();
		currentLevel.add(root);
		result.add(currentLevel);
		
		ArrayList<Node> parents;
		
		while(true){
		parents = currentLevel;
		currentLevel = new ArrayList<Node>();
		for(Node x: parents){
			if(x.left!=null) currentLevel.add(x.left);
			if(x.right!=null) currentLevel.add(x.right);
		}
		
		if(currentLevel.size()==0) break;
		result.add(currentLevel);
		
		}
		return result;
		
		}
	
	
	
	
	
	public boolean validate1(){
		Key leftKey=null;
		return validate1(root, leftKey);
	}
	
	private boolean validate1(Node x, Key leftKey){
		
		if(x==null) return true;
		if(!validate1(x.left,leftKey)) return false;
		
		if(leftKey!=null && leftKey.compareTo(x.key)>0) return false;
		leftKey = x.key;
				
		if(!validate1(x.right,leftKey)) return false;
		
		return true;
			
	}
	
	public boolean validate2(){
		return validate2(root, null, null);
	}
	
	private boolean validate2(Node x, Key min, Key max){
		
		if(x==null) return true;
		
		
		if(min!=null && min.compareTo(x.key)>=0 || max!=null && max.compareTo(x.key)<0) return false;
		
		if(!validate2(x.left, null, x.key) || !validate2(x.right, x.key, null)) return false;
		
		return true;
		
		
	}
	
	
	
	
	

		
		
		


}