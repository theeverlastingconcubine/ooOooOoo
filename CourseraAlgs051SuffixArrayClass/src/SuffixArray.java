
public class SuffixArray {
	
	
	private final String[] suffix;
	private final int N;
	
	public SuffixArray(String s){
		
		N = s.length();
		suffix = new String[N];
		
		for(int i = 0; i<N; i++){
			suffix[i] = s.substring(i);
		}
		
		StringSort.sort(suffix);
		
		
	}
	
	
	public int length() {return N;}
	
	public String select(int i){return suffix[i];}
	
	public int index(int i) {return N - suffix[i].length();}
	
	private int lcp(String s, String f){
		int K = Math.min(s.length(), f.length());
		for(int i = 0; i<N; i++) if(f.charAt(i)!=s.charAt(i)) return i;
		return K;
	}
	
	
	public int lcp(int i){
		return lcp(suffix[i], suffix[i-1]);
	}
	
	
	public int rank(String key){
		int lo = 0;
		int hi = N-1;
		
		while(lo<=hi){
			int k = lo + (hi-lo)/2;
			int cmp = key.compareTo(suffix[k]);
			
			if(cmp<0) hi = k-1;
			else if(cmp>0) lo = k+1;
			else return k;
		}
		
		return lo;
		
	}
	
	
	
	

}
