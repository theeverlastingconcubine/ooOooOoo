
public class DirEdge {
		
	private int v;
	private int w; 
	
	
	public DirEdge(int v, int w){
		
		this.v = v;
		this.w = w;	
	}
	
	public int other(int i){
		if(i==this.v) return w;
		else if(i==this.w) return v;
		else throw new IllegalArgumentException("are you sure with an input?");
	}
	
	public int from(){
		return v;
	}
	
	public int to(){
		return w;
	}
	
	public String toString(){
		return v + "--->" + w;
	}
	
	
	

}
