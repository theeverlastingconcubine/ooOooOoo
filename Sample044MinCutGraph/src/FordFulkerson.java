import java.util.LinkedList;
import java.util.Queue;

public class FordFulkerson {
	
	private boolean[] marked; //is reachable in residual net
	private FlowEdge[] edgeTo; 
	private double maxflow;
			
	public FordFulkerson(FlowNet G, int s, int t){
		maxflow = 0.0;
		while(hasAugmentingPath(G,s,t)){
			double bottle = Double.POSITIVE_INFINITY;
			
			for(int v = t; v!=s; v = edgeTo[v].other(v)){
				bottle = Math.min(bottle, edgeTo[v].residualCapacityTo(v));
			}
			
			for(int v = t; v!=s; v = edgeTo[v].other(v)){
				edgeTo[v].addResidualFlowTo(v, bottle);
				
			}
			maxflow = bottle + maxflow;
		}
		
		
	}
	
	//we use a BFS/ShortestPath to search for undir path from s to t
	
	private boolean hasAugmentingPath(FlowNet G, int s, int t){
		marked = new boolean[G.V()];
		edgeTo = new FlowEdge[G.V()];
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(s);
		marked[s] = true;
		
		while(!queue.isEmpty()){
			int v = queue.remove();
			
			for(FlowEdge e: G.adj(v)){
				
				int w = e.other(v);
				
				if(e.residualCapacityTo(w)>0 && !marked[w]){ 
					edgeTo[w] = e;
					marked[w] = true;
					queue.add(w);
				}
			}
		}
		return marked[t]; //if we can still reach t - we have a way to improve
	}
	
	public double maxflow() {return maxflow;}
	
	public boolean isReachable(int v){
		return marked[v];
	}
	
	
	
	
	

}
