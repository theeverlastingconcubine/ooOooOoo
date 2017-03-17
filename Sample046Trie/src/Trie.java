import java.util.LinkedList;
import java.util.List;

public class Trie {

	private Node root = new Node();
	private final int R = 26;

	private class Node {

		Node[] next = new Node[R];
		String value;
	}
	
	
	public void put(String s){
		
		Node node = root;
		
		for(int i = 0; i<s.length(); i++){
			int c = s.charAt(i)-'a';
			if(node.next[c]==null) {
				node.next[c] = new Node();
			}
			node = node.next[c];
		}
		
		node.value = s;
	}
	
	public String get(String s){
		Node node = root;
		
		for(int i = 0; i<s.length(); i++){
			int c = s.charAt(i)-'a';
			if(node.next[c]==null) return null;
			else node = node.next[c];
		}
		
		if(node.value!=null) return node.value;
		return null;
		
	}
	
	public LinkedList<String> allTrie(){
		LinkedList<String> list = new LinkedList<String>();
		addStrings(root, list);		
		return list;
	}
	
	private void addStrings(Node node, List<String> list){
		
		if(node==null) return;
		
		for(int i = 0; i<R; i++){
			if(node.next[i]!=null){
				if(node.next[i].value!=null) list.add(node.next[i].value);
				addStrings(node.next[i],list);
			}
		}
		
		
		
		
	}
	

}
