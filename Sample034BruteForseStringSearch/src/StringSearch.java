
public class StringSearch {
	
	public static void main(String[] args){
		
		String text = "what are the chances ask the an i your heart for the Answers";
		String pattern = "he an";
		
		int N = text.length();
		int M = pattern.length();
		int INDICATOR=0;
		
		for(int i = 0; i<=N-M; i++){
			for(int j = 0; j<M; j++){
				if(text.toLowerCase().charAt(i+j) != pattern.toLowerCase().charAt(j)) break;
				if (j==M) INDICATOR = i;
			}
					
		}
		System.out.println(INDICATOR);	
	
		
		
	}
	
	

}
