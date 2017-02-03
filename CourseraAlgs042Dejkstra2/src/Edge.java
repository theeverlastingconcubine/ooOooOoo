
public class Edge {
	
	private int v;
	private int w;
	private double cost; 
	
	public Edge(int v, int w, double cost){
		this.v = v;
		this.w = w;
		this.cost = cost;
	
		}
	
	public int to() {return w;}
	public int from() {return v;}
	public double cost() {return cost;}
	
	public String toString(){
		return v + " -(" + cost + ")-> " + w;
	}
	
	

}
