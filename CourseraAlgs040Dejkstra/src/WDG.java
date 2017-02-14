import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class WDG {

	private final int V;
	private final LinkedList<DirEdge>[] adj;

	public WDG(int V) {
		this.V = V;
		adj = (LinkedList<DirEdge>[]) new LinkedList[V];

		for (int v = 0; v < V; v++)
			adj[v] = new LinkedList<DirEdge>();

	}

	public void addEdge(DirEdge e) {
		int v = e.from();
		adj[v].add(e);
	}

	public Iterable<DirEdge> adj(int v) {
		return adj[v];
	}

	public int V() {
		return V;
	}

	public int E() {
		Set<DirEdge> edges = new HashSet<DirEdge>();
		for (int v = 0; v < V; v++) {
			for (DirEdge e : adj[v])
				edges.add(e);
		}
		return edges.size();
	}

	public String toString() {
		String s = "Vert " + V + "\n";

		for (int v = 0; v < V; v++) {
			s = s + v + " : ";
			for (DirEdge e : adj[v])
				s = s + e + ", ";
			s = s + "\n";
		}
		return s;
	}

}
