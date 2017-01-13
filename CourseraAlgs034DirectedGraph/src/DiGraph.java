import java.util.LinkedList;

public class DiGraph {

	private final int V;
	private int E;
	private LinkedList<Integer>[] adj;

	public DiGraph(int V) {

		this.V = V;
		this.E = 0;
		adj = (LinkedList<Integer>[]) new LinkedList[V];
		for (int v = 0; v < V; v++) {

			adj[v] = new LinkedList<Integer>();
		}

	}

	public void addEdge(int v, int u) {

		adj[v].add(u);
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
	
	public int outDegree(int v){
		int count = 0;
		for (int t: adj[v]) count++;
		return count;
		
	}
	
	public int inDegree(int v){
	int count = 0;
	for(int t=0; t<V; t++){
		for(int u:adj[t]) 
			if (u==v) count++;
		
	}
		
		return count;
	}
	
	
	
	public String toString(){
		
		String s = "Edg: " + E + " Vert: " + V + "\n";
		
		for(int v=0; v<V; v++){
			s = s + v;
			for(int w:adj[v]){
				s = s + ": " + w + " ";
			}
			s = s+ "\n";			
		}
		
		
		return s;
	}

}
