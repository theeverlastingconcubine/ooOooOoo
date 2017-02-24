import java.util.Arrays;

public class Test {
	
	public static void main(String[] args){
		
		String[] words = {"fart","blog","jort","tort","aboo","polk","nook","quic","fant","asfr","fzoo","ohou","uala"};
		
		
		System.out.println(Arrays.toString(words));
		
		int l = words[0].length();
		int N = words.length;
		String[] aux = new String[N];
		
		
		for(int d = l-1; d>=0; d--){
			
			int[] count = new int[256+1];
			
			for(int i = 0; i<N; i++){
				count[words[i].charAt(d)+1]++;
			}
			
			for(int i = 1; i<count.length; i++){
				count[i] = count[i] + count[i-1];
			}
			
			for(int i = 0; i<N; i++){
				aux[count[words[i].charAt(d)]] = words[i];
				count[words[i].charAt(d)]++;
							
			}
			
			for(int i = 0; i<N; i++){
				words[i] = aux[i];
			}		
			
		}
		
		System.out.println(Arrays.toString(words));
		
	}
	

}
