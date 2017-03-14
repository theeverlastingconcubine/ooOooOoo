import java.util.ArrayList;
import java.util.List;

public class RBBST<Key extends Comparable<Key>, Value> {
	
	private static final boolean RED = true;
	private static final boolean BLACK = false;
	
	private Node root;
	
	private class Node{
		
		Node left; 
		Node right; 
		Value value; 
		Key key;
		boolean color;
		
		private Node(Key key, Value value, boolean color){
			this.key = key; 
			this.value = value;
			this.color = color;
		}
	}
	
	private boolean isRed(Node x){
		if (x==null) return false;
		return x.color==RED;
	}
	
	private Node rotateLeft(Node h){
		Node x = h.right;
		h.right = x.left;
		x.left = h;
		x.color = h.color;
		h.color = RED;
		return x;		
	}
	
	private Node rotateRight(Node h){
		Node x = h.left;
		h.left = x.right;
		x.right = h;
		x.color = h.color;
		h.color = RED;
		
		return x;
	}
	
	private void flipColors(Node h){
		h.color = RED;
		h.left.color = BLACK;
		h.right.color = BLACK;
		
	}
	
	public void put(Key key, Value value){
		root = put(root, key, value);
		root.color = BLACK;
	}
	
	
	private Node put(Node x, Key key, Value value){
		
		if (x==null) return new Node(key, value, RED);
		
		int cmp = key.compareTo(x.key);
		
		if (cmp<0) x.left = put(x.left, key, value);
		else if (cmp>0) x.right = put(x.right, key, value);
		else x.value = value;
		
		if(isRed(x.right) && !isRed(x.left)) x = rotateLeft(x);
		if(isRed(x.left) && isRed(x.left.left)) x = rotateRight(x);
		if(isRed(x.left) && isRed(x.right)) flipColors(x);
		
		return x;
		
		
	}
	
	public Value search(Key key){
		Node x = search(root, key);
		
		if(x==null) return null;
		else return x.value;
	}
	
	private Node search(Node x, Key key){
		
		if (x==null) return null;
		int cmp = key.compareTo(x.key);
		
		if(cmp>0) return search(x.right, key);
		else if(cmp<0) return search(x.left, key);
		else return x;
		
	}
	
	public Value getMin(){
		Node x = getMin(root);
		if (x==null) return null;
		else return x.value;
	}
	
	private Node getMin(Node x){
		
		if (x==null) return null;
		
		if (x.left == null) return x;
		else return getMin(x.left);
	}
	
	public boolean isEmpty(){
		return root==null;
	}
		
	public void delMin(){
		root = delMin(root);	
	}
	
	private Node delMin(Node x){
		
		if(x.left == null) return x.right;
		x.left = delMin(x.left);
		return x;
			
		
	}
	
	private Node delete(Node x, Key key){
		
		if(x==null) return null; 
		
		int cmp = key.compareTo(x.key);
		
		if(cmp>0) x.right = delete(x.right, key);
		else if (cmp<0) x.left = delete(x.left, key);
		else{ 
			if(x.right == null) return x.left;
			if(x.left == null) return x.right;
			
			Node t = x; 
			x = getMin(t.right);
			x.right = delMin(t.right);
			x.left = t.left;
						
		}
		return x;		
		
	}
	
	public void delete(Key key){
		root = delete(root, key);
	}
	
	
	
	
	
	
	public Iterable<Value> inOrder(){
		ArrayList<Value> list = new ArrayList<Value>(11);
		inOrder(root, list);
		return list;
		
	}
	
	
	private void inOrder(Node x, List<Value> list){
		if (x==null) return;
		inOrder(x.left, list);
		list.add(x.value);
		inOrder(x.right, list);
		
	}
	
	//levels are from 0
	
	private void levelByLevel(Node x, ArrayList<ArrayList<Value>> levels, int d){
		
		if(x==null) return;
		
		if (levels.size()>d) {levels.get(d).add(x.value);}
		else if(levels.size()<=d) {
			levels.add(new ArrayList<Value>());
			levels.get(d).add(x.value);
		}
		
		levelByLevel(x.left, levels, d+1);
		levelByLevel(x.right, levels, d+1);
		
		
	}
	
	public ArrayList<ArrayList<Value>> levels(){
		ArrayList<ArrayList<Value>> levels = new ArrayList<ArrayList<Value>>();
		levelByLevel(root, levels, 0);
		return levels;
	}
	
	/*private void spaces(String s, int d){
		for(int k = 1; k<=d; k++) s = s + " ";
		
	}
	
	
	private void spacesList(String s, int d, ArrayList<Value> list){
		for(Value v: list){
			spaces(s, d);
			s = s + v;
			}
			
	}
	
	
	public String toString(){
		
		ArrayList<ArrayList<Value>> levels = levels();
		int d = levels.size()-1; //last level is
		int spacesD = (int) Math.pow(2,d)-1;
		String s = "";
		int i = 0; 
		
		for(ArrayList<Value> levi: levels){
			
			int z = spacesD /((int) Math.pow(2, i+1));
			if (z==0) z=1;
			spacesList(s,z,levi);
			i++;
			s= s + "\n";
		}
			
		return s;
		
		
		
		
	}*/
	
	
	

}
