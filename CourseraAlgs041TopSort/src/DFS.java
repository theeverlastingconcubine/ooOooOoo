
public class DFS {
	
	private boolean[] marked;
	private int[] edgeTo;
	private int s;
	
	public DFS(Graph g, int s){
		marked = new boolean[g.V()];
		edgeTo = new int[g.V()];
		this.s = s;
		dfs(g,s);
	}
	
	private void dfs(Graph g, int v){
	
		marked[v] = true;
		
		for(int w: g.adj(v))
			
			if(!marked[w]){
				dfs(g,w);
				edgeTo[w] = v;
			}
		
	}

}
