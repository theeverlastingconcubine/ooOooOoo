import java.util.ArrayList;

public class MyBST<Key extends Comparable<Key>, Value> {
	
	
	private Node root;
	
	private class Node{
		
		Node left;
		Node right;
		Key key;
		Value value;
		
		public Node(Key key, Value value){
			this.key = key;
			this.value = value;
		}
	
	}
	
	public MyBST(){}
	
	public MyBST(Key[] array){
		root = createFromArray(array, 0, array.length-1);
		}
	
	private Node createFromArray(Key[] array, int start, int end){
		
		if(start>end) return null;
		
		int mid = start + (end-start)/2;
		
		Node x = new Node(array[mid], null);
		x.left = createFromArray(array, start, mid-1);
		x.right = createFromArray(array, mid+1, end);	
		return x;
	}
	
	
	
	
	
	
	public void put(Key key, Value value){
		root = put(root, key, value);
		
	}
	
	private Node put(Node x, Key key, Value value){
		
		if(x==null) return new Node(key, value);
		int t = key.compareTo(x.key);
		
		if(t<0) x.left = put(x.left, key, value);
		else if(t>0) x.right = put(x.right, key, value);
		else x.value = value;
		return x;
				
	}
	
	public Value get(Key key){
		return get(root, key);
	}
			
	private Value get(Node x, Key key){
		
		if (x==null) return null;
		
		int t = key.compareTo(x.key);
		
		if(t<0) return get(x.left, key);
		else if (t>0) return get(x.right, key);
		else return x.value;
				
	}
	
	public Iterable<Key> inOrder(){
		ArrayList<Key> list = new ArrayList<Key>();
		inOrder(root, list);
		return list;
	}
	
	private void inOrder(Node x, ArrayList<Key> list){
		
		if (x==null) return;
		inOrder(x.left, list);
		list.add(x.key);
		inOrder(x.right, list);
	
	}
	
	public ArrayList<ArrayList<Key>> levels(){
		ArrayList<ArrayList<Key>> levels = new ArrayList<ArrayList<Key>>();
		levels(root, levels, 0);
		return levels;
	}
	
	private void levels(Node x, ArrayList<ArrayList<Key>> levels, int d){
		
		if (x==null) return;
		ArrayList<Key> level = null;
		if (levels.size()==d) {level = new ArrayList<Key>(); levels.add(level);}
		else level = levels.get(d);
		
		level.add(x.key);
		
		levels(x.left, levels, d+1);
		levels(x.right, levels, d+1);
			
	}
	
	
	
	
	
	

}
