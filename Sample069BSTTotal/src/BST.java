import java.util.ArrayList;

public class BST<Key extends Comparable<Key>, Value> {
	
	private Node root;
	
	private class Node{
		
		private Node left;
		private Node right;
		Key key;
		Value value;
		
		private Node(Key key, Value value){
			this.key = key;
			this.value = value;
		}
				
	}
	
	public class Pair{
		Key key;
		Value value;
		
		private Pair(Key key, Value value){
			this.key = key;
			this.value = value;
		}
		
		public String toString(){
			return "[" + key + ", " + value + "]";
		}
	}
	
	private Node put(Node x, Key key, Value value){
		if (x==null) return new Node(key, value);
		
		int cmp = key.compareTo(x.key);
		if(cmp<0) x.left = put(x.left, key, value);
		else if(cmp>0) x.right = put(x.right, key, value);
		else x.value = value;
		return x;
		
	}
	
	public void put(Key key, Value value){
		root = put(root, key, value);
	}
	
	private Node search(Node x, Key key){
		
		if (x==null) return null;
		
		int cmp = key.compareTo(x.key);
		
		if(cmp<0) return search(x.left, key);
		else if(cmp>0) return search(x.right, key);
		else return x;
		
	}
	
	public Value search(Key key){
		Node x = search(root, key);
		if(x==null) return null;
		else return x.value;
	}
	
	
	private void collectLevels(ArrayList<ArrayList<Pair>> levels, Node x, int d){
		
		//Assume Node x is at level d
		if(x==null) return;
		
		if(levels==null || levels.size()<d+1) levels.add(new ArrayList<Pair>());
		
		levels.get(d).add(new Pair(x.key, x.value));
		
		collectLevels(levels,x.left,d+1);
		collectLevels(levels,x.right,d+1);
		
		
	}
	
	public ArrayList<ArrayList<Pair>> levels(){
		ArrayList<ArrayList<Pair>> levels = new ArrayList<ArrayList<Pair>>();
		collectLevels(levels, root, 0);
		return levels;
	}
	
	public Key min(){
		Node x = findMin();
		if(x==null) return null;
		return x.key;
	}
	
	//deletion
	
	private Node findMin(){
		
		Node x = root;
		if(x==null) return null;
		while (x.left!=null){
			x = x.left;
		}
		return x;
		
	}
	
	private Node findMin(Node x){
		
		if(x==null) return null;
		if(x.left==null) return x;
		return findMin(x.left);
		
		
	}
	
	private Node delMin(Node x){
		
		if (x==null) return null;
		if (x.left==null) return x.right;
		x.left = delMin(x.left);
		return x;
		
	}
	
	public void delMin(){
		root = delMin(root);
	}
	
	public void delete(Key key){
		root = delete(root, key);
	}
	
	private Node delete(Node x, Key key){
		
		if (x==null) return x;
		
		int cmp = key.compareTo(x.key);
		
		if(cmp<0) x.left = delete(x.left, key);
		else if (cmp>0) x.right = delete(x.right, key);
		else{ 
			
			if(x.left==null) return x.right;
			if(x.right==null) return x.left;
			
			
			// why order matters
			Node temp = x;
			x = findMin(temp.right);
			x.right = delMin(temp.right);
			x.left = temp.left;
			
					
		}
		
		return x;
	}
	
	// create shortest bst
	
	private Node shortBST(Key[] a, Value[] b, int lo, int hi){
		
		if(hi<lo) return null;
		
		int mid = lo + (hi-lo)/2;
		
		Node x = new Node(a[mid], b[mid]);
		
		x.left = shortBST(a,b,lo,mid-1);
		x.right = shortBST(a,b,mid+1,hi);
		return x;
	}
	
	public void shortBST(Key[] a, Value[] b){
		
		root = shortBST(a,b,0,a.length-1);
		
	}
	
	
	

}
