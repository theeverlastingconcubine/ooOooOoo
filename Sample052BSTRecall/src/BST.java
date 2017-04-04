import java.util.ArrayList;

public class BST<Key extends Comparable<Key>, Value> {
	
	
	private Node root;
	
	private class Node{
		
		Value value;
		Key key;
		Node left;
		Node right;
		
		private Node(Key key, Value value){
			this.key=key;
			this.value=value;
		}
		
		public String toString(){
			return "["+ key + ", " + value + "]";
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
	
	public Value get(Key key){
	
		Node x = get(root, key);
		if(x==null) return null;
		else return x.value;
	
	}
	
	private Node get(Node x, Key key){
		
		if(x==null) return null;
		int cmp = key.compareTo(x.key);
		if (cmp<0) return get(x.left,key);
		else if (cmp>0) return get(x.right,key);
		else return x;
		
	}
	
	
	private Node findMin(Node x){
		
		if(x==null) return null;
		if(x.left==null) return x;
		return findMin(x.left);
	}
	
	public Value getMin(){
		Node min = findMin(root);
		if (min==null) return null;
		return min.value;
	}
	
	
	private Node delMin(Node x){
		
		if(x.left==null) return x.right;
		x.left = delMin(x.left);
		return x;
		
	}
	
	public void delMin() {
		root = delMin(root);
	}
	
	public void delete(Key key){
		root = delete(root, key);
	}
	
	private Node delete(Node x, Key key){
	
	if(x==null) return null;
	int cmp = key.compareTo(x.key);
	
	if (cmp>0) delete(x.right, key);
	else if (cmp<0) delete(x.left, key);
	else{
		
		if(x.left==null) return x.right;
		if(x.right==null) return x.left;
		
			Node temp = x;
			x = findMin(temp.right);
			x.left = temp.left;
			x.right = delMin(temp.right);
				
	}
	
	return x;
	}
	
	
	private void collect(Node x, ArrayList<ArrayList<Node>> lists, int level){
		
		if (x==null) return;
		if (level>=lists.size()) lists.add(new ArrayList<Node>());
		lists.get(level).add(x);
		collect(x.left, lists, level+1);
		collect(x.right, lists, level+1);
		
	}
	
	private ArrayList<ArrayList<Node>> levels(){
		ArrayList<ArrayList<Node>> levels = new ArrayList<ArrayList<Node>>();
		collect(root, levels, 0);
		return levels;
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
