import java.util.ArrayList;
import java.util.List;

public class SearchGrid {
	
	static ArrayList<String> result = new ArrayList<String>();
	
	public static void hasWords(char[][] grid, String[] words){
			
		Trie trie = new Trie();
		for(String w: words) trie.insert(w);
		
		int m = grid.length;
		int n = grid[0].length;
		
		boolean[][] marked = new boolean[m][n];
		
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				
				dfs(grid, marked, trie, i, j, "");
				
			}
		}
	
	}
	
	public static void dfs(char[][] grid, boolean[][] marked, Trie trie, int i, int j, String seq){
				
		 int m = grid.length;
	     int n = grid[0].length;
	     
	     if (i<0 || j<0 || i>=m || j>=n) return;
	     if (marked[i][j]) return;
	     
	     seq = seq + grid[i][j];
	     if(!trie.hasPrefix(seq)) return;
	     if(trie.hasWord(seq)) result.add(seq);
	     
	     marked[i][j] = true;
	     dfs(grid, marked, trie, i+1, j, seq);
	     dfs(grid, marked, trie, i-1, j, seq);
	     dfs(grid, marked, trie, i, j+1, seq);
	     dfs(grid, marked, trie, i, j-1, seq);
	     marked[i][j] = false;
	     	
	}
	
	
	public static void main(String[] args){
		
		//test trie
		
		Trie trie = new Trie();
		
		trie.insert("sobaka");
		trie.insert("sobakevich");
		trie.insert("sobyanin");
		trie.insert("abdulov");
		trie.insert("sorokin");
		trie.insert("golovolomka");
		trie.insert("golovastik");
		trie.insert("abduhl");
		trie.insert("barsuk");
		trie.insert("biblioteka");
		trie.insert("adbu");
		
		for(String s: trie.wordList()) System.out.println(s);
		
		System.out.println(trie.hasPrefix("biblo"));
		System.out.println(trie.hasWord("sorokin"));
		System.out.println(trie.hasWord("soroka"));
		System.out.println(trie.hasWord("sor"));
		System.out.println(trie.hasPrefix("sor"));
		
		/////////////////////////////////////////////	
		
		char[][] grid = {{'o','a','a','n'}, 
						 {'e','t','a','e'}, 
						 {'i','h','k','r'}, 
						 {'i','f','l','v'}};
		String[] words = {"oath","pea","eat","rain", "nerv"};
		hasWords(grid, words);
		
		System.out.println("--------------------------------");
		for (String s: result) {System.out.println(s);}
		System.out.println("--------------------------------");
		
		
				
	}

}
