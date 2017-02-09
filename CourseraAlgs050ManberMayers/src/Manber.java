
public class Manber {
	
	private int n; 
	private String text; 
	private int[] index;
	private int[] rank; 
	private int[] newrank;
	private int offset;
	
	public Manber(String s){
		n = s.length();
		text = s;
		index = new int[n+1];
		rank = new int[n+1];
		newrank = new int[n+1];
		
		index[n] = n;
		rank[n] = -1;
		
		msd();
		doit();
	}
	
	public int length() {return n;}
	
	private int index(int i){
		return index[i];
	}
	
	
	public String select(int i){
		return text.substring(index[i]);
	}
	
	private void doit(){
		
	}
	
	
	private void msd(){
		final int R = 256;
		
		int[] freq = new int[R];
		for(int i=1; i<n; i++)
			freq[text.charAt(i)]++;
		
		int[] cumm = new int[R];
		for(int i = 1; i<R; i++)
			cumm[i] = cumm[i-1] + freq[i-1];
		
		for(int i=0; i<n; i++)
			rank[i] = cumm[text.charAt(i)];
		
		for(int i = 0; i<n; i++)
			index[cumm[text.charAt(i)]++] = i;
		
	}
	

}
