import java.util.Arrays;

public class KIndCount {
	
	public static void sort(int[] a, int rad){
		
		int N = a.length;
		int[] count = new int[rad+1];
		int[] aux = new int[N];
		
		for(int i = 0; i<N; i++){
			count[a[i]+1]++;
		}
		
		for(int i=0; i<rad-1; i++){
			count[i+1] = count[i+1] + count[i];
			}
			
		for(int i = 0; i<N; i++){
			aux[count[a[i]]] = a[i];
			count[a[i]]++;
			
		}
		
		for(int i = 0; i<N; i++){
			a[i] = aux[i];
		}
				
			
		}
	
	public static void sortLSD(String[] a, int R){
		
		int l = a[0].length();
		int N = a.length;
		String[] aux = new String[N];
		
		
		for(int j = l-1; j>=0; j--){
			
			int[] count = new int[R];	
			
			for(int i = 0; i<N; i++){
				count[a[i].charAt(j)+1]++;
			}
			
			for(int i = 0; i<R-1; i++){
				count[i+1] = count[i+1] + count[i];
			}
			
			for(int i = 0; i<N; i++){
				aux[count[a[i].charAt(j)]++] = a[i];
			}
			
			for(int i = 0; i<N; i++){
				a[i] = aux[i];
			}
			
		}
	
			
		
		
		
		
		
		
	}

}
