import java.util.LinkedList;

public class Graph {

	private final int V;
	private int E;
	private LinkedList<Integer>[] adj;

	public Graph(int V) {
		this.V = V;
		this.E = 0;

		adj = (LinkedList<Integer>[]) new LinkedList[V];

		for (int v = 0; v < V; v++) {
			adj[v] = new LinkedList<Integer>();
		}

	}

	public void addEdge(int v, int w) {
		adj[v].add(w);
		adj[w].add(v);
		E++;
	}

	public Iterable<Integer> adj(int v) {
		return adj[v];
	}

	public int V() {
		return V;
	}

	public int E() {
		return E;
	}

	public String toString() {
		String s = "Vert: " + V + " Edg: " + E + "\n";
		for (int v = 0; v < V; v++) {
			s = s + v + ": ";
			for (int w : adj[v]) {
				s = s + " " + w + " ";
			}
			s = s + "\n";
		}

		return s;
	}

}
