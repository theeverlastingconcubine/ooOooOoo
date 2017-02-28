import java.util.ArrayList;

public class Graph {
	
	private int V,E;
	private ArrayList<Edge>[] adj;
	
	public Graph(int V){
		this.V = V;
		E=0;
		adj = (ArrayList<Edge>[]) new ArrayList[V];
		for(int v = 0; v<V; v++){
			adj[v] = new ArrayList<Edge>();
		}
	}
	
	public int E(){
		return E;
	}
	
	
	public void addEdge(Edge e){
		int v = e.either();
		int w = e.other(v);
		
		E++;
		
		adj[v].add(e);
		adj[w].add(e);
	}
	
	public int V(){return V;}
	
	public Iterable<Edge> adj(int v){
		return adj[v];
	}
	
	public String toString(){
		String s = "vert " + V + "\n";
		for(int v = 0; v<V; v++){
			s = s + v + ": ";
			for(Edge e: adj[v]) s = s + e + ", ";
			s = s + "\n";
		}
		
		return s;
	}
	
	

}
