import java.util.Iterator;
import java.util.LinkedList;

public class Trie implements Iterable<String>{
	
	private TrieNode root = new TrieNode();
	private LinkedList<String> words = new LinkedList<String>();

	
	private class TrieNode{
		
		TrieNode[] children = new TrieNode[26];
		String value;
						
	}
	
	
	public void insert(String word){
		TrieNode node = root; 
	
		for(char i: word.toCharArray()){
				if(node.children[i-'a'] == null) {node.children[i-'a'] = new TrieNode();}
				node = node.children[i-'a'];			
		}
		
		node.value = word;	
		
		
	}
	
	public boolean hasWord(String word){
		TrieNode node = root;
		for(char i: word.toCharArray()){
			if (node.children[i-'a'] == null) {return false;}
			node = node.children[i-'a'];
		}
		
		if  (node.value!=null) return node.value.equals(word);
		
		return false;
	}
	
	public boolean hasPrefix(String prefix){
		TrieNode node = root;
		
		for(char i: prefix.toCharArray()){
			if(node.children[i-'a'] == null) return false; 
			node = node.children[i-'a'];
		}
		
		return node!=null;
		
	}
	
	public Iterable<String> wordList(){ 
		addWords(root);		
		return words;}
	
	
	private void addWords(TrieNode node){
		for(int i = 0; i<26; i++) {
			if( node.children[i]!=null ){
				if (node.children[i].value!=null) {words.add(node.children[i].value);}
				addWords(node.children[i]);				
			}
		}
				
	
	}
	
	//ITERATOR IS NOT COMPLETE
	//AND, PROBABLE WE DO NOT NEED IT
	
	
	public Iterator<String> iterator(){
		return new TrieIterator();
	}
	
	private class TrieIterator implements Iterator<String>{
		
		TrieNode node = root;
		
		public String next(){ return"";}
		public boolean hasNext(){return false;}
		
		
		
		
	}
	
	
	

}
