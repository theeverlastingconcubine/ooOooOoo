import java.util.Arrays;

public class SuffixArray {
	
	//  idea: suffix is just a pointer in text
	//  only compare suffixes could be tricky
	
	
	private Suffix[] suffixes;
	
	public SuffixArray(String text){
		int N=text.length();
		this.suffixes=new Suffix[N];
		
		for(int i= 0; i<N; i++){
			suffixes[i] = new Suffix(text,i);
			Quick3Sort.sort(suffixes);
		}
	}
	
	private static class Suffix implements Comparable<Suffix>, StringLike{
		
		private final String text;
		private final int index;
		
		private Suffix(String text, int index){
			this.text = text;
			this.index= index;
		}
		
		public int length(){  //i=0 -> len=N
			return text.length()-index;
		}
		
		public int charAt(int i){
			return text.charAt(index+i);
		}
		
		public int compareTo(Suffix that){
			if(this==that) return 0;
			int n=Math.min(this.length(), that.length());
			for(int i=0; i<n; i++){
				if (this.charAt(i)<that.charAt(i)) return -1;
				if (this.charAt(i)>that.charAt(i)) return 1;
			}
			return this.length() - that.length(); //shorter goes first
			
		}
		
		public String toString() {
			return text.substring(index);
		}
		
	}
	
	public int length() { return suffixes.length;}
	
	
	// returns index of ith (sorted!) suffix
	public int index(int i) { 
		if(i<0 || i>=suffixes.length) throw new IndexOutOfBoundsException();
		
		return suffixes[i].index;
	}
	
	
	public int lcp(int i){
		if(i<1 || i>= suffixes.length) throw new IndexOutOfBoundsException();
		
		return lcp(suffixes[i], suffixes[i-1]);
		
	}
	
	private static int lcp(Suffix s, Suffix t){
		
		int n= Math.min(s.length(), t.length());
		
		for(int i=0; i<n; i++){
			if(s.charAt(i)!=t.charAt(i)) return i;
		}
		return n;
	}
	
	
	public String select(int i){
		return suffixes[i].toString();
	}
	
	public int rank(String query){
		int lo =0;
		int hi = suffixes.length - 1;
		
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			
			int cmp = compare(query, suffixes[mid]);
			
			if(cmp<0) hi = mid-1;
			else if (cmp>0) lo = mid+1;
			else return mid;
		}
		return lo;
	}
	
	private static int compare(String query, Suffix suffix){
		int n = Math.min(query.length(), suffix.length());
		
		for(int i=0; i<n; i++){
			if(query.charAt(i)<suffix.charAt(i)) return -1;
			if(query.charAt(i)>suffix.charAt(i)) return 1;
		}
		return query.length()-suffix.length();
		
	}
	
	
	
	
	
	
	

}
