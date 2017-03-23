public class Suffix implements Comparable<Suffix>, StringLike{
	
	private final String text;
	private final int index;
	
	public Suffix(String text, int index){
		this.text = text;
		this.index= index;
	}
	
	public int length(){  //i=0 -> len=N
		return text.length()-index;
	}
	
	public int charAt(int i){
		return text.charAt(index+i);
	}
	
	//just in case
	
	
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
