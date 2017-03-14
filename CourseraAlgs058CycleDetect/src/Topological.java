import java.util.LinkedList;

public class Topological {
	
	private boolean[] marked;
	private LinkedList<Integer> order;
	
	
	public Topological(Graph G){
		order = new LinkedList<Integer>();
		int V = G.V();
		marked = new boolean[V];
		
		for(int v = 0; v<V; v++){
			if(!marked[v]) dfs(G,v);
		}
					
	}
	
	private void dfs(Graph G, int s){
		
		marked[s] = true;
		
		for(Edge e: G.adj(s)){
			int w = e.to();
			if(!marked[w])
				dfs(G,w);
		}
		
		order.push(s);	
		
	}
	
	public Iterable<Integer> order(){
		return order;
	}

}
