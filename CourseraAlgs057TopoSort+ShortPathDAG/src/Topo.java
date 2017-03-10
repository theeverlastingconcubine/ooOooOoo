import java.util.LinkedList;

public class Topo {
	
	private LinkedList<Integer> topo;
	private boolean marked[];
	
	public Topo(Graph G){
		topo = new LinkedList<Integer>();
		marked = new boolean[G.V()];
	
		for(int v = 0; v<G.V(); v++){
			if(!marked[v]) dfs(G,v);
		}
		
	}
	
	private void dfs(Graph G, int s){
		
		marked[s] = true;
		
		for(Edge e: G.adj(s)){
			int a = e.to();
			if(!marked[a]) dfs(G,a);
		}
		topo.push(s);
				
	}
	
	public Iterable<Integer> topoOrder(){
		return topo;
	}
	
	

}
