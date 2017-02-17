import java.util.LinkedList;

public class PathFinderBFS {
	
	private boolean[] marked;
	private int[] edgeTo;
	private int s; 
	
	public PathFinderBFS(Graph G, int s){
		
		marked = new boolean[G.V()];
		edgeTo = new int[G.V()];
		this.s = s;
		
		bfs(G, s);
		}
		
	private void bfs(Graph G, int s){
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		queue.add(s);
		marked[s] = true;
		
		while(!queue.isEmpty()){
			
			int t = queue.poll();
			
			for(int v: G.adj(t)){
				if(!marked[v]){
					queue.add(v);
					marked[v] = true;
					edgeTo[v] = t;
				}
			}
			
		}
				
	}
	
	public Iterable<Integer> pathTo(int v){
		LinkedList<Integer> path = new LinkedList<Integer>();
		
		for(int i = v; i!=s; i=edgeTo[i]){
			path.push(i);
		}
		
		return path;
		
			
		
	}

}
