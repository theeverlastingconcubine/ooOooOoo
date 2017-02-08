
public class LSD {
	
	//works only if all strings have equal length
	
	public static void sord(String[] a){
		
		int w = a[0].length();
		int R = 256;
		int N = a.length;
		
		String[] aux = new String[N];
		
		for(int r = w-1; r>=0; r--){
			
			int[] count = new int[R+1];
			
			for(int i = 0; i<N; i++){
				count[a[i].charAt(r)+1]++;
								
			}
			
			for(int i = 1; i<R; i++){
				count[i] = count[i] + count[i-1];
			}
			
			for(int i=0; i<N; i++){
				
				aux[count[a[i].charAt(r)]] = a[i];
				count[a[i].charAt(r)]++;
				
			}
			
			for(int i = 0; i<N; i++){
				a[i] = aux[i];
			}			
			
			
		}
		
		
		
		
		
		
	}
	
	
	

}
