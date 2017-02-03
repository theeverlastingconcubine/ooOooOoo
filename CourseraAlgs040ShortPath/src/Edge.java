
public class Edge {
	
	private final int v; 
	private final int w;
	private final double cost; 
	
	public Edge(int v, int w, double cost){
		this.v = v;
		this.w = w;
		this.cost = cost;
		
	}
	
	
	public int from() {return v;}
	public int to() {return w;}
	public double cost() {return cost;}
	
	public String toString(){
		
		return v + " -(" + cost + ")-> " + w;
			}
	
	
	

}
