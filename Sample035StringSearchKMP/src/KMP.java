
public class KMP {
	
	private final int R = 256;
	private int[][] dfa;
	private int M;
	
	public KMP(String pattern){
		M = pattern.length();
		dfa = new int[R][M];
		dfa[pattern.charAt(0)][0] = 1;
		int X = 0; 		
			for(int i = 0; i<R; i++){
			for(int j = 1; j<M; j++){
				dfa[i][j] = dfa[i][X];
				dfa[pattern.charAt(j)][j] = j+1;
				X = dfa[pattern.charAt(j)][X];
				
			}
		}
		
	}
	
	public int search(String text){
		
		int j = 0; 
		
		for(int i = 0; i<text.length() && j<M; i++){
			
			j = dfa[text.charAt(i)][j];
		
			if(j==M) return i-M; 
		}
		
		return -666;
		
		
		
		
		
	}

}
