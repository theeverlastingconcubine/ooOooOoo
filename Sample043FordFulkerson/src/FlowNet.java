import java.util.LinkedList;

public class FlowNet {

	private final int V;
	private LinkedList<FlowEdge>[] adj;
	
	public FlowNet(int V){
		this.V = V;
		adj = (LinkedList<FlowEdge>[]) new LinkedList[V];
		for(int v = 0; v<V; v++){
			adj[v] = new LinkedList<FlowEdge>();
		}
		
	}
	
	/*flowNet is kinda directed but FF searches for undirected passes
	  only changing in flows takes care on direction on edge 
	*/
	
	public void addEdge(FlowEdge e){
	int v = e.from();
	int w = e.to();
	adj[v].add(e);
	adj[w].add(e); 
	}
	
	public Iterable<FlowEdge> adj(int v){
		return adj[v];
	}
	
	public int V(){ return V;}
	
	public String toString(){
		String s = "Vert: " + V + "\n";
		for(int v =0; v<V; v++){
			s = s + v + ": ";
			for(FlowEdge e:adj[v]) s = s + e + "  ";
			s = s + "\n";
		}
		return s;
	}
}