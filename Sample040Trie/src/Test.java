


public class Test {
	
	public static void main(String[] args){
		
		Trie trie = new Trie();
		trie.insert("moth");
		trie.insert("math");
		trie.insert("match");
		trie.insert("mother");
		
		System.out.println(trie.get("mother"));
		
		System.out.println(trie.allWords());
		
		
		
		
	}

}
