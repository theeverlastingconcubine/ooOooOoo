import java.util.HashSet;
import java.util.Set;

public class Graph {

	private int V;
	private Set<Edge>[] adj;

	public Graph(int V) {
		this.V = V;
		adj = (HashSet<Edge>[]) new HashSet[V];

		for (int v = 0; v < V; v++) {
			adj[v] = new HashSet<Edge>();
		}
	}

	public void addEdge(Edge e) {

		int v = e.from();
		adj[v].add(e);

	}

	public Iterable<Edge> adj(int v) {
		return adj[v];
	}

	public int V() {
		return V;
	}

	public String toString() {
		String s = V + " vert" + "\n";

		for (int v = 0; v < V; v++) {
			s = s + v + ": ";
			for (Edge e : adj[v])
				s = s + e + ", ";
			s = s + "\n";
		}

		return s;
	}

}
