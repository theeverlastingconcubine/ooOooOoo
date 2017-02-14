
public class KMP {
	
	private final int R = 256;
	private int[][] dfa;
	private String pattern;
	
	
	public KMP(String pattern){
		this.pattern = pattern;
		int M = pattern.length();
		dfa = new int[R][M];
		dfa[pattern.charAt(0)][0] = 1;
		
		/*we can easy fill right sequence of states for our
		dfa: 
		state0->state1: dfa[pattern.charAt(0)][0] = 1;
		state1->state2: dfa[pattern(charAt(1)][1] = 2;
		state2->state3: dfa[pattern.charAt(2)][2] = 3;
		statei->statei+1: dfa[pattern.charAt(i)][i] = i+1;
		
		
		*/
		
		int X = 0;
		
		for(int j = 1; j<M; j++){
			for(int c = 0; c<R; c++){
				
				dfa[c][j] = dfa[c][X];
				dfa[pattern.charAt(j)][j] = j+1;
				X = dfa[pattern.charAt(j)][X];
			}
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	public int search(String text, String pattern){
		int i;
		int j = 0;
		int N = text.length();
		int M = pattern.length();
		
		for(i=0; i<N; i++){
			j = dfa[text.charAt(i)][j];
			if (j == M) return i-M;
			}
		return N;
	}
	
	
	
	
	
	
}
