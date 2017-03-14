import java.util.Arrays;
import java.util.LinkedList;

public class SPTOP {
	
	private Edge[] edgeTo;
	private double[] distTo;
	int s;
	
	public SPTOP(Graph G, int s){
		this.s = s;
		int V = G.V();
		edgeTo = new Edge[V];
		distTo = new double[V];
		for(int v=0; v<V; v++){
			distTo[v] = Double.POSITIVE_INFINITY;
		}
		distTo[s] = 0.0;
		
		CycleDetection cd = new CycleDetection(G);
		
		if(!cd.hasCycle()){
			
			Topological topo = new Topological(G);
			for(int v: topo.order()) relax(G, v);
			}
		else throw new Error("Graph has cycle. Can Not Do.");
		
	}
	
	
	private void relax(Graph G, int s){
		
		for(Edge e: G.adj(s)) {
			int v = e.from();
			int w = e.to();
			
			if(distTo[w] > distTo[v] + e.weight()){
				distTo[w] = distTo[v] + e.weight();
				edgeTo[w] = e;
			}
				
		}
		
		
		
		
	}
	
	public Iterable<Integer> pathTo(int v){
		
		LinkedList<Integer> path = new LinkedList<Integer>();
		
		System.out.println(Arrays.toString(edgeTo));
		
		for(int x = v; x!=s; x = edgeTo[x].from()){
			path.push(x);
		}
		path.push(s);
		return path;
		
		
	}
	

}
