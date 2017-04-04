import java.util.LinkedList;

public class Graph {
		
	private int V;
	private LinkedList<Integer>[] adj;
	
	public Graph(int V){
		this.V=V;
		adj = (LinkedList<Integer>[]) new LinkedList[V];
		
		for(int v = 0; v<V; v++){
			adj[v] = new LinkedList<Integer>();
		}
	}
	
	
	public int V() {return V;}
	
	public void addEdge(int v, int w){
		adj[v].add(w);
		adj[w].add(v);
	}
	
	public Iterable<Integer> adj(int v){
		return adj[v];
		
	}
	
	public String toString(){
		String s = "vert: "+ V + "\n";
		
		for(int v=0; v<V; v++){
			s = s + v + ": ";
			for(int w:adj[v]){
				s = s + w + ", ";
			}
			s = s + "\n";
		}
		
		return s;
		
	}
	

}
