import java.util.ArrayList;
import java.util.Random;

public class NotBST<Key> {
	
	//we add randomly some data to a binary tree
	
	private Node root;
	
	private class Node{
		
		Key key;
		Node left;
		Node right;
		
		private Node(Key key){
			this.key = key;
		}
		
		
	}
	
	public void put(Key key){
		
		root = put(root, key);
	}
	
	
	private Node put(Node x, Key key){
		
		if(x==null) return new Node(key);
		
		Random rnd = new Random();
		int leftright = rnd.nextInt(2);
		if(leftright==0) x.left = put(x.left,key);
		else x.right = put(x.right, key);
		return x;
			
	}
	
	public Iterable<ArrayList<Key>> levels(){
		
		ArrayList<ArrayList<Key>> levels = new ArrayList<ArrayList<Key>>();
		levels.add(new ArrayList<Key>());
		collectLevels(levels, root, 0);
		return levels;
	}
	
	private void collectLevels(ArrayList<ArrayList<Key>> levels, Node x, int d){
		
		if(x==null) return;
		
		if(levels.size()>d) levels.get(d).add(x.key);
		else {levels.add(new ArrayList<Key>());
		levels.get(d).add(x.key);
		}
		
		collectLevels(levels, x.left,d+1);
		collectLevels(levels, x.right,d+1);
		
	}
	
	public String toString(){
		String s = "";
		for(ArrayList<Key> level: levels()){
			for(Key key: level){
				s = s + key + ", " ;
			}
			s = s + "\n";
		}
		return s;
	}

}
