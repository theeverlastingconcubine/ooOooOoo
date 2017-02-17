
public class AVL<Key extends Comparable<Key>, Value> {
	
	private Node root;
	
	private class Node{
		
		Node left;
		Node right;
		int height;
		Key key;
		Value value;
		
		Node(Key key, Value value, int height){
			this.key= key;
			this.value = value;
			this.height = height;
		}
		
		public String toString(){
			return "["+key + ", " + value + "]" + "(" + height + ")  ";
			}
	}
	
	private int height(Node x){
		if (x==null) return -1;
		else return x.height;
	}
	
	public void put(Key key, Value value){
		root = put(root, key, value);
	}
	
	private Node put(Node x, Key key, Value value){
		
		if (x==null) return new Node(key, value, 0);
		int cmp = key.compareTo(x.key);
		
		if(cmp>0) {
				
			x.right = put(x.right, key, value);
			
			if(Math.abs(height(x.left) - height(x.right))>=2){
				if(key.compareTo(x.right.key)>0) {
					x = rotateLeft(x);}
				else if(key.compareTo(x.right.key)<0) {
					rotateRight(x.right);
					x = rotateLeft(x);
				}
				
			}
		}
		
		
		
		
		else if(cmp<0) {
			
			x.left = put(x.left, key, value);
			if(Math.abs(height(x.left) - height(x.right))>=2){
			if(key.compareTo(x.left.key)<0){
				x = rotateRight(x);
			}
			else if(key.compareTo(x.left.key)>0){
				rotateLeft(x.left);
				x = rotateRight(x);
			}
		}
			}
		else x.value = value;
		x.height = Math.max(height(x.left), height(x.right)) + 1;
		return x;
				
	}
	
	private Node rotateLeft(Node x){
		
		Node y = x.right;
		x.right = y.left;
		y.left = x;
		x.height = Math.max(height(x.left), height(x.right)) +1;
		y.height = Math.max(height(x), height(y.right));
		return y;
		}
	
	private Node rotateRight(Node y){
		Node x = y.left;
		y.left = x.right;
		x.right = y;
		
		y.height = Math.max(height(y.left), height(y.right)) +1;
		x.height = Math.max(height(y), height(x.left)) +1;
		return x;
		
		
	}
	

	
	
	
	
	
	
	
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		inOrder(root,sb);
		return sb.toString();
	}
	
	private void inOrder(Node x, StringBuilder sb){
		if (x==null) return;
		inOrder(x.left, sb);
		sb.append(x);
		inOrder(x.right,sb);
		
	}
	
	
	

}
