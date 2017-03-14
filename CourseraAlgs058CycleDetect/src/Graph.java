import java.util.LinkedList;

public class Graph {
	
	private int V;
	private LinkedList<Edge>[] adj;
	
	
	public Graph(int V){
		this.V = V;
		adj = (LinkedList<Edge>[]) new LinkedList[V];
		
		for (int v = 0; v<V; v++){
			adj[v] = new LinkedList<Edge>();
		}
		
	}
	
	public void addEdge(Edge e){
		int v = e.from();
		adj[v].add(e);
	}
	
	public int V() {return V;}
	
		
	public Iterable<Edge> adj(int v){ return adj[v];}
	
	public String toString(){
		String s = "vert " + V + "\n";
		for(int v = 0; v<V; v++){
			s = s + v + " : ";
			for(Edge e: adj[v]) s = s + e + " | ";
			s = s + "\n";
		}
		return s;
	}

}
