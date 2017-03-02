import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class WordGrid {
	
	
	public static List<String> findWords(char[][] grid, String[] words) {
		
		LinkedList<String> result = new LinkedList<String>();
		
		int m = grid.length;
		int n = grid[0].length;
		
		for(String word: words) {
			boolean flag = false; 
				for (int i = 0; i<m; i++){
					for(int j = 0; j<n; j++){
						
						char[][] newGrid = new char[m][n];
						for(int ii = 0; ii<m; ii++){
							for (int jj=0; jj<n; jj++){
								newGrid[ii][jj] = grid[i][j];
							}
						}
						
						if (dfs(newGrid, word, i,j,0)) { flag = true;}
												
					}
				}
				
			
		if (flag) {result.add(word);}	
		}
		
				
		return result;
	}
	
	
	public static boolean dfs(char[][] grid, String word, int i, int j, int k){
		
		int m = grid.length;
		int n = grid[0].length;
		
		if(i<0 || j<0 || i>=m || j>=n || k>word.length()-1) {return false;}
		
		if(grid[i][j] == word.charAt(k)) {
			
			char temp = grid[i][j]; grid[i][j] = '?';
		
			if (k == word.length() - 1) { return true;}
			else if (  dfs(grid, word, i-1,j,k+1) 
					|| dfs(grid, word, i+1,j,k+1)
					|| dfs(grid, word, i,j+1,k+1)
					|| dfs(grid, word, i,j-1,k+1)) {grid[i][j] = temp; 
					
					return true;}
				
		}
		
		else {return false;}
		
		return false;
		
		
	}
	
	public static void main(String[] args){
		
		char[][] grid = {{'o','a','a','n'}, {'e','t','a','e'}, {'i','h','k','r'}, {'i','f','l','v'}};
		
		String[] words = {"oath","pea","eat","rain"};
		
		List<String> res = findWords(grid, words);
		
		System.out.println(Arrays.toString(grid));
		System.out.println(Arrays.toString(words));
		
		for(String w: res) System.out.println(w);
		
	}
	
	
	
	
	
	
	
	
	

}
