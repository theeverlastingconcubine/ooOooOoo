import java.util.LinkedList;

public class ShortestPathDAG {
	double[] distTo;
	Edge[] edgeTo;
	
	public ShortestPathDAG(Graph G, int s){
		
		distTo = new double[G.V()];
		
		for(int v=0; v<G.V(); v++){
			distTo[v] = Double.POSITIVE_INFINITY;
			
		}
		distTo[s] = 0.0;
		
		edgeTo = new Edge[G.V()];
		
		Topo top = new Topo(G);
		for(int q : top.topoOrder()) relax(G,q);
	}
	
	
	private void relax(Graph G,int s){
		
		for(Edge e: G.adj(s)){
		
		int v = e.from();
		int w = e.to();
		double weight = e.weight();
		
		if(distTo[w] > distTo[v] + weight){
			distTo[w] = distTo[v] + weight;
			edgeTo[w] = e;
		}
		}
			
	}
	
	public Iterable<Edge> pathTo(int v){
		LinkedList<Edge> path = new LinkedList<Edge>();
		for(Edge e = edgeTo[v]; e!=null; e = edgeTo[e.from()]){
			path.push(e);
			}
		return path;
	}
	
	public double cost(int v){
		return distTo[v];
	}

}
