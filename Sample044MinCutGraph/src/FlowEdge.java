
public class FlowEdge {
	
	private final int v;
	private final int w;
	private final double capacity;
	private double flow; //not final as we want to fill those
	private int other;
	
	
	public FlowEdge(int v, int w, double capacity){
		
		this.v = v;
		this.w = w;
		this.capacity = capacity;
		
		
	}
	public int from() {return v;}
	public int to() {return w;}
	public double capacity() {return capacity;}
	public double flow() {return flow;}
	
	public int other(int vertex) {
		if (vertex==v) return w;
		else if (vertex==w) return v;
		else throw new IllegalArgumentException("no such vertex");
		
	}
	
	//how much can we put more through this vertex
	
	public double residualCapacityTo(int vertex){
		if(vertex==v) return flow;
		else if(vertex==w) return capacity-flow;
		else throw new IllegalArgumentException();
	}
	
	public void addResidualFlowTo(int vertex, double alpha){
		if(vertex==v) flow = flow - alpha;
		else if(vertex==w) flow = flow = flow + alpha;
		else throw new IllegalArgumentException();
	}
	
	public String toString(){
		return v + "--" + flow + "/" + capacity + "-->" + w;
	}

}
