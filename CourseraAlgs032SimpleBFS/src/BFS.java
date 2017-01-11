import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	
	private boolean[] marked;
	private int[] cameFrom;
	private final int s;
	
	public BFS(Graph G, int s){
		
	this.marked = new boolean[G.V()];
	this.cameFrom = new int[G.V()];
	this.s = s;
	
	System.out.println(Arrays.toString(marked));
	bfs(G,s);
	System.out.println(Arrays.toString(marked));
	
	
	}
	
	private void bfs(Graph G, int s){
		
		Queue<Integer> queue = new LinkedList<Integer>();
		marked[s] = true;
		queue.add(s);
		
		while(!queue.isEmpty()){
			
			int v = queue.poll();
			for (int w: G.adj(v)) {
				
				if(!marked[w]){
					
					cameFrom[w] = v;
					marked[w] = true;
					queue.add(w);
				}
							
			}
						
		}
				
	}

	public boolean hasPathTo(int v){ return marked[v];}
	
	public Iterable<Integer> pathTo (int v){
		
		if (!hasPathTo(v)) return null;
		
		LinkedList<Integer> path = new LinkedList<Integer>();
		
		for (int x = v; x!=s; x = cameFrom[x]) {
			path.push(x);
			}
		path.push(s);
		
		return path;
	}
	

}
