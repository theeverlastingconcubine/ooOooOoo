
public class BM {
	
	private static final int R = 256;
	private static int[] right;
	
	public static int search(String text, String pattern){
		
		int N = text.length();
		int M = pattern.length();
		int skip;
				
		right = new int[R];
		for(int i=0;i<R; i++) {
			right[i] = -1;
		}
		
		for(int i=0; i<pattern.length(); i++){
			right[pattern.charAt(i)] = i;
		}
		
		for(int i = 0; i<=N-M; i = i+skip){
			skip=0;
			for (int j = M-1; j>=0; j--){
				
				if(pattern.charAt(j)!=text.charAt(i+j)){
					skip = Math.max(1, j-right[text.charAt(j+i)]);
					//if next char is not in the pattern we skip j+1
					//if it is in the pattern we ski
						break;
					
				}
												
			}
			
			if (skip==0) return i;
			
			
		}	
		return -1;
			
		
		
		
		
		
	
	}
	
	
	

}
