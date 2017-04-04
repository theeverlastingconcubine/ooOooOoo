import java.util.LinkedList;

public class DFS {
	
	private boolean[] marked;
	private int[] from;
	
	public DFS(Graph G, int s){
		
		marked = new boolean[G.V()];
		from = new int[G.V()];
		
		
		dfs(G,s);
	}
	
	private void dfs(Graph G, int s){
		
		marked[s]= true;
		
		for(int v: G.adj(s)){
			if (!marked[v]){
				dfs(G,v);
				from[v] = s;
			}
		}
		
		
		
	}
	
	
	public Iterable<Integer> pathTo(int v){
		
		if (!marked[v]) return null;   //returns null if v is another connected component
			
		LinkedList<Integer> path = new LinkedList<Integer>();
		
		int i;
		for(i = v; i != from[i]; i = from[i]){
			path.push(i);
		}
		path.push(i);
	
		return path;
	}

}
