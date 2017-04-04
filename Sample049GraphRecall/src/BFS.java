import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	
	private boolean[] marked;
	private int[] from;
	
	
	public BFS(Graph G, int s){
		marked= new boolean[G.V()];
		from = new int[G.V()];
		bfs(G,s);
				
	}
	
	private void bfs(Graph G, int s){
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		marked[s] = true;
		queue.add(s);
		from[s] = s;
		
		while(!queue.isEmpty()){
			int v = queue.poll();
			for(int w: G.adj(v)){
				if(!marked[w]){
					queue.add(w);
					marked[w] = true;
					from[w] = v;
				}
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
