import java.util.Arrays;

public class MSD {
		
	private final static int R = 26;
	
	private static int charAt(String s, int i){
		if(i>s.length()-1) return -1;
		return s.charAt(i) - 'a';
	}
	
	
	private static void sort(String[] words, String[] aux, int lo, int hi, int d){
		
		if(hi<=lo) return;
		
		int[] count = new int[R+2];
		
		
		for(int i = lo; i<=hi; i++){
			
			count[charAt(words[i], d) + 2]++;
		
		}
		
		for(int i = 1; i<count.length; i++){
			count[i] = count[i] + count[i-1];
			
		}
		
		for(int i = lo; i<=hi; i++){
			aux[count[charAt(words[i],d)+1]++] = words[i];
			
		}
		
		for(int i = lo; i<=hi; i++){
			words[i] = aux[i];
		}
		
		for(int r = 0; r<R; r++){
			sort(words, aux, lo + count[r], lo + count[r+1] - 1, d+1);
		}	
		
		
	}
	
	
	public static void sort(String[] a){
		String[] aux = new String[a.length];
		sort(a, aux, 0, a.length-1, 0);
	}
}
