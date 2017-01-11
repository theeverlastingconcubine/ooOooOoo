import java.util.LinkedList;

public class Graph {

	private int V;
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

	public Iterable<Integer> adj(int v) {
		return adj[v];
	}

	public void addEdge(int v, int w) {

		adj[v].add(w);
		adj[w].add(v);
		E++;
	}

	public int E() {
		return E;
	}

	public int V() {
		return V;
	}

	public String toString() {

		String s = "Vertex: " + V + " Edges: " + E + "\n";
		for (int v = 0; v < V; v++) {
			s = s + " " + v + ":";
			for (int w : adj[v])
				s = s + " " + w;
			s = s + "\n";
		}

		return s;
	}

}
