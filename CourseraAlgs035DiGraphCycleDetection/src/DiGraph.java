import java.util.LinkedList;

public class DiGraph {

	private final int V;
	private int E;
	private LinkedList<Integer>[] adj;

	public DiGraph(int V) {
		this.V = V;
		this.E = 0;
		this.adj = (LinkedList<Integer>[]) new LinkedList[V];

		for (int i = 0; i < V; i++) {
			adj[i] = new LinkedList<Integer>();
		}

	}

	public void addEdge(int u, int v) {

		adj[u].add(v);
		E++;

	}

	public Iterable<Integer> adj(int i) {
		return adj[i];
	}

	public int V() {
		return V;
	}

	public int E() {
		return E;
	}
	
	public String toString(){
		
		String s = "Edge: " + E + "  Vert: " + V + "\n";
		
		for (int i=0; i<V; i++){
			s = s + i + ": ";
			for (int k: adj[i]) s = s + k + " ";
			s = s + "\n";
		}
		
		return s;
		
	}

}
