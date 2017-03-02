import java.util.ArrayList;

public class Trie {
	
	private TrieNode root = new TrieNode(); 
	private final int R = 26;
		
	private class TrieNode{
		
		String value; 
		TrieNode[] next = new TrieNode[R];
		
	}
	
	public Iterable<String> allWords(){
		ArrayList<String> words = new ArrayList<String>();
		addWords(root, words);
		return words;
	}
	
	private void addWords(TrieNode x, ArrayList<String> words){
		if (x==null) return;
	//	if (x.value!=null) words.add(x.value);
		
		for(int i = 0; i<R; i++){
			if(x.next[i]!=null) {
				if(x.next[i].value!=null) words.add(x.next[i].value);
				addWords(x.next[i], words);
			}
		
		}
		
	}
	
	
	public void insert(String word){
		
		TrieNode node = root;
		
		for(int i = 0; i<word.length(); i++){
			int c = word.charAt(i);
			if(node.next[c-'a']==null) {node.next[c-'a'] = new TrieNode();}
				node = node.next[c-'a'];
												
		}
		node.value = word;
		
		
	}
	
	public String get(String word){
		
		TrieNode x = root;
		
		for(int i = 0; i<word.length(); i++){
			
			int c = word.charAt(i);
			if(x.next[c-'a']==null) return null;
			else x=x.next[c-'a'];
			}
			
			if(x.value!=null) return x.value;
			return null;
			
		}
	
}
