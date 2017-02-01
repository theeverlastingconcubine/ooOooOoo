import java.util.LinkedList;

public class PathFinder {
	
	private double[] distTo;
	private Edge[] edgeTo;
	private IndexedMinHeap<Double> pq;
	
	public PathFinder(Graph g, int s){
		edgeTo = new Edge[g.V()];
		distTo = new double[g.V()];
		pq = new IndexedMinHeap<Double>();
		
		for (int v = 0; v<g.V(); v++)
			distTo[v] = Double.POSITIVE_INFINITY;
		distTo[s] = 0.0;
		
		pq.insert(s, 0.0);
	
		while(!pq.isEmpty()){
			int v = pq.getMin();
			for(Edge e: g.adj(v)) relax(e);
					
		}
					
	}
	
	private void relax(Edge e){
		
		int v = e.from();
		int w = e.to();
		
		if (distTo[w] > distTo[v] + e.cost()) {
			distTo[w] = distTo[v] + e.cost();
			edgeTo[w] = e;
			if(pq.hasElement(w)) pq.update(w, distTo[w]);
			else 				 pq.insert(w, distTo[w]);
		
		
		}	
	}
	
	
	public Iterable<Edge> pathTo(int vert){
		
		//Stack<Edge> path = new Stack<Edge>();
		  LinkedList<Edge> path = new LinkedList<Edge>(); 
		
		for(Edge e = edgeTo[vert]; e!=null; e = edgeTo[e.from()])
			path.push(e);
		
		return path;
	}
	
	

}
