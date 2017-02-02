import java.util.LinkedList;

public class TopSort {

	private boolean[] marked;
	private LinkedList<Integer> reversePost;

	public TopSort(Graph G){
		reversePost = new LinkedList<Integer>();
		marked = new boolean[G.V()];
		
		for(int v = 0; v<G.V(); v++){
			if(!marked[v]) dfs(G,v);
					
		}
		
	}
		
	
	private void dfs (Graph G, int v){
			
			marked[v] = true;
			
			for(int w: G.adj(v))
				if(!marked[w]) dfs(G,w);
			reversePost.push(v);
					
			
		}
	
	public Iterable<Integer> reversePost(){
		return reversePost;
	}
		
		
		
		
		
}

