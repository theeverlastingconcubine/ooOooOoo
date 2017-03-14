import java.util.Arrays;
import java.util.LinkedList;

public class CycleDetection {
	
	private boolean[] marked;
	private boolean[] workingOn;
	private LinkedList<Integer> cycle;
	private Edge[] edgeTo;
	
	public CycleDetection(Graph G){
		int V = G.V();
		
		marked = new boolean[V];
		workingOn = new boolean[V];
		edgeTo = new Edge[V];
		for(int v=0; v<V; v++){
			if(!marked[v]) dfs(G,v);
		}
		
				
	}
	
	private void dfs(Graph G, int s){

		workingOn[s] = true;
		marked[s] = true;
				
		for(Edge e: G.adj(s)){
			int w = e.to();
			if(cycle!=null) return;
			else if(!marked[w]){
				edgeTo[w] = e;
				dfs(G,w);
			}
			else if(workingOn[w]){
				cycle = new LinkedList<Integer>();
				cycle.push(w);
				/*int x = e.from();
				cycle.push(x);
				x = edgeTo[x].from();
				cycle.push(x);
				x = edgeTo[x].from();
				cycle.push(x);*/
				for (int x = s; x!=w; x = edgeTo[x].from()){
					cycle.push(x);
				}
								
			}
				
		}		
		
		workingOn[s] = false;
	}
	
	public boolean hasCycle(){
		return cycle!=null;
	}
	
	public Iterable<Integer> cycle(){
		return cycle;
	}
	
	

}
