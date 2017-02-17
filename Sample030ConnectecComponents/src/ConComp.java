
public class ConComp {
	
	private int[] id;
	private boolean[] marked;
	private int count;
	
	public ConComp(Graph G){
		
		id = new int[G.V()];
		marked = new boolean[G.V()];
		count = 1; 
		
		for(int v = 0; v<G.V(); v++){
			if (!marked[v]) {
				bfs(G,v);
				count++;
			}
		}
		
	}
	
	
	private void bfs(Graph G, int s){
		
		marked[s] = true;
		id[s] = count;
		
		for(int v:G.adj(s)){
			if(!marked[v]){
				bfs(G,v);
			}
		}
		
		
	}
	
	public int[] components(){return id;}

}
