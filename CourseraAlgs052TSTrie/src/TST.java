import java.util.LinkedList;

public class TST<Value> {
	
	private Node root; 
	
	private class Node{
				 
		private Value value; 
		private char c;
		private Node left;
		private Node right;
		private Node equal;
			
	}
	
	public void put(String key, Value value){
		root = put(root, key, value, 0);
	}
	
	private Node put(Node x, String key, Value val, int d){	
		
		char c =key.charAt(d);
		
		if(x==null) {x = new Node(); x.c = c;}
		
		if(c>x.c) {x.right = put(x.right, key, val,d);}
		else if(c<x.c) {x.left = put(x.left, key, val,d);}
		else if (d<key.length()-1) {x.equal = put(x.equal, key, val, d+1);}
		else x.value = val;
		
		return x; 
	}
	
	public Value get(String key){
		
		Node x = get(root, key, 0);
		if(x==null) return null;
		else return x.value;
		
	}
	
	
	private Node get(Node x, String key, int d){
		
		if(x == null) return null;
		
		int c = key.charAt(d);
		if (c>x.c) return get(x.right, key, d);
		else if (c<x.c) return get(x.left, key, d);
		else if (d<key.length()-1) return get(x.equal, key, d+1);
		return x;
			
	}
	
	//trie traversal
	
	public Iterable<String> keys(){
		LinkedList<String> list = new LinkedList<String>();
		collect(root, new StringBuilder(), list);	
		return list;
	}
	
	
	private void collect(Node x, StringBuilder prefix, LinkedList<String> list){
		
		if(x==null) return;
		collect(x.left, prefix, list);
		
		if(x.value!=null) list.addLast(prefix.toString() + x.c);
		collect(x.equal, prefix.append(x.c), list);
		
		prefix.deleteCharAt(prefix.length()-1);
		collect(x.right, prefix, list);
		

		
	}
	

}
