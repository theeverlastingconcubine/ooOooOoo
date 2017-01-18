import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class WGraph {

	private final int V;
	private final LinkedList<Edge>[] adj;
	private ArrayList<Edge> edges;

	public WGraph(int V) {

		this.V = V;
		edges = new ArrayList<Edge>();

		adj = (LinkedList<Edge>[]) new LinkedList[V];
		for (int v = 0; v < V; v++) {
			adj[v] = new LinkedList<Edge>();
		}
	}

	public void addEdge(Edge e) {
				
		int v = e.either();
		int w = e.other(v);
		
		adj[v].add(e);
		adj[w].add(e);
		
		edges.add(e);
	}

	public Iterable<Edge> adj(int v) {
		return adj[v];
	}
	
	public Iterable<Edge> edges(){
		
		return edges;
		}
		
		

	public int V() {
		return V;
	}

	public String toString() {
		
		String s = "Vert: " + V + "\n";

		for (int v = 0; v < V; v++) {
			
			s = s + v + ": ";
			for (Edge e : adj[v]) {
				s = s + e + " ; ";
			}
			s = s + "\n";
		}

		return s;
	}

}
