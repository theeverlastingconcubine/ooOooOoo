
public class Edge {
	
	private int v;
	private int w;
	private Double weight; 
	
	public Edge(int v, int w, Double weight){
		this.v = v;
		this.w = w;
		this.weight = weight;
	}
	
	public int from(){return v;}
	public int to(){return w;}
	public Double weight(){return weight;}
	
	public String toString(){
	 return v + "--" + weight + "->" + w;}
	
	

}
