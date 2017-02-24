
public class Edge implements Comparable<Edge>{
	
	private int v; 
	private int w;
	private double weight; 
	
	public Edge(int v, int w, double weigth){
		this.v = v;
		this.w = w;
		this.weight = weight;
	}
	
	public int either(){
		return v;
	}
	
	public int other(int v){
		if(v==this.v) return w;
		else return v;
	}
	
	public double weight(){
		return this.weight;
	}
	
	public String toString(){
		return v+"--"+ weight +"--"+w; 
	}
	
	public int compareTo(Edge that){
		if(this.weight<that.weight) return -1;
		else if (this.weight<that.weight) return 1;
		else return 0;
	}
	

}
