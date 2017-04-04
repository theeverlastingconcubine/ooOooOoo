import java.util.HashSet;
import java.util.Set;

public class CC {
	
	private boolean[] marked;
	private int[] cc;
	
	public CC(Graph G){
		
		marked = new boolean[G.V()];
		cc = new int[G.V()];
		int c = 0;
		
		for(int v = 0; v<G.V(); v++){
			if(!marked[v]) {
				dfs(G,v,c);
				c++;
				}
			
			
		}
	
	}
	
	private void dfs(Graph G, int s, int c){
		marked[s]= true;
		cc[s]= c;
		for(int v:G.adj(s)){
			if(!marked[v]){
				cc[v]=c;
				dfs(G,v,c);
			}
		}
		
	}
	
	public int[] cc(){return cc;}
	
	public int numConComp(){
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0; i<cc.length; i++){
			set.add(cc[i]);
		}
		return set.size();
	}

}
