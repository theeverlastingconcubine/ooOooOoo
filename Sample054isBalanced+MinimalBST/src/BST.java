import java.util.ArrayList;

public class BST<Key extends Comparable<Key>, Value> {
	
	private Node root;
	
	private class Node{
		Key key;
		Value value;
		Node left;
		Node right;
		
		private Node(Key key, Value value){
			this.key = key;
			this.value=value;
		}
		
		public String toString(){
			return "[" + key + ", " + value + "]";
		}
		
		
	}
	
	
	private Node put(Node x, Key key, Value value){
		
		if (x==null) return new Node(key, value);
		int cmp = key.compareTo(x.key);
		if (cmp < 0) x.left = put(x.left, key, value);
		else if (cmp > 0) x.right = put(x.right, key, value);
		else x.value= value;
		return x;
		
	}
	
	public void put(Key key, Value value){
		root = put(root,key,value);
	}
	
	private Node search(Node x, Key key){
		
		if(x==null) return null;
		int cmp = key.compareTo(x.key);
		
		if(cmp>0) return search(x.right,key);
		else if(cmp<0) return search(x.left,key);
		else return x;
		}
	
	public Value search(Key key){
		
		Node x = search(root, key);
		if(x!=null) return x.value;
		return null;
	}
	
	private ArrayList<ArrayList<Node>> levels(){
		
		ArrayList<ArrayList<Node>> levels = new ArrayList<ArrayList<Node>>();
		ArrayList<Node> current = new ArrayList<Node>();
		
		if (root!=null) current.add(root);
		else return null;
		
		while(!current.isEmpty()){
		ArrayList<Node> up = current;
		levels.add(up);
		current = new ArrayList<Node>();
		for(Node x:up) {
			if(x.left!=null) current.add(x.left);
			if(x.right!=null) current.add(x.right);
			
		}
		
			
		}
		
		return levels;
					
	}
	
	public String toString(){
		ArrayList<ArrayList<Node>> levels = levels();
		String s = "";
		int i = 0;
		for(ArrayList<Node> level: levels) {
			s = s + i +" : " + level + "\n";
			i++;
		}
		
		return s;
		
	}
	
	private Node delMin(Node x){
		if(x==null) return null;
		if(x.left==null) return x.right;
		x.left = delMin(x.left);
		return x;
	}
	
	public void delMin(){
		root = delMin(root);
	}
	
	
	private Node findMin(Node x){
		
		if(x==null) return null;
		if(x.left==null) return x;
		else return findMin(x.left);
	}
	
	public Value min(){
		Node x = findMin(root);
		if(x!=null) return x.value;
		return null;
	}
	
	public void delete(Key key){
		root = delete(root,key);
	}
	
	private Node delete(Node x, Key key){
		
		if(x==null) return null;
		int cmp = key.compareTo(x.key);
		
		if(cmp>0) x.right = delete(x.right,key);
		else if(cmp<0) x.left = delete(x.left,key);
		else {
				if(x.left==null) return x.right;
				if(x.right==null) return x.left;
				
				Node temp = x;
				x = findMin(temp.right);
				x.left = temp.left;
				x.right = delMin(temp.right);
				
			
		}
		
		return x;
		
		
	}
	
	private int height(Node x){
		if(x==null) return -1;
		else return Math.max(height(x.left), height(x.right))+1;
	}
	
	public int height(Key key){
		return height(search(root,key));
	}
	
	private int checkHt(Node x){
		
		if (x==null) return -1;
		
		int leftHt = checkHt(x.left);
		if (leftHt == -100) return -100;
		
		int rightHt = checkHt(x.right);
		if (rightHt == -100) return -100;
		
		int diff= leftHt-rightHt;
		
		if(Math.abs(diff)>1){return -100;}
		else return Math.max(leftHt,rightHt) + 1;
	}
	
	
	public boolean isBalanced(){
		return checkHt(root)!=-100;
	}
		
		
	
	
	
	
	
}






