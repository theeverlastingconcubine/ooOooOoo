import java.util.LinkedList;

public class PathFinder {

	private Edge[] edgeTo;
	private IndexedMinHeap<Integer, Double> pq;
	private double[] distTo;

	public PathFinder(Graph G, int s) {

		edgeTo = new Edge[G.V()];
		pq = new IndexedMinHeap<Integer, Double>();
		distTo = new double[G.V()];

		for (int v = 0; v < G.V(); v++) {
			distTo[v] = Double.POSITIVE_INFINITY;
		}

		distTo[s] = 0.0;
		pq.insert(s, 0.0);

		while (!pq.isEmpty()) {

			int v = pq.getMin();
			for(Edge e: G.adj(v)) relax(e);

		}

	}

	private void relax(Edge e) {

		int v = e.from();
		int w = e.to();

		if (distTo[w] > distTo[v] + e.cost()) {
			distTo[w] = distTo[v] + e.cost();
			edgeTo[w] = e;
			if (pq.hasElement(w))
				pq.decreasePriority(w, distTo[w]);
			else
				pq.insert(w, distTo[w]);

		}

	}
	
	public Iterable<Edge> pathTo(int k){
		
		LinkedList<Edge> path = new LinkedList<Edge>();
		
		for(Edge e = edgeTo[k]; e!=null; e = edgeTo[e.from()]){
			path.push(e);
		}
		
	return path;	
	}

	
}
