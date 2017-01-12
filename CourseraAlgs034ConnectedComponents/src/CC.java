import java.util.Arrays;

public class CC {

	private int id[];
	private boolean visited[];
	private int count;

	public CC(Graph g) {

		id = new int[g.V()];
		visited = new boolean[g.V()];
		count = 0;

	for(int v=0; v<g.V(); v++){
		if(!visited[v]) {dfs(g, v); count++;}
	}
	

	}

	private void dfs(Graph g, int s) {

		visited[s] = true;
		id[s] = count;
		for (int w : g.adj(s))
			if (!visited[w]) {
				dfs(g, w);
			}

	}
	
	public void showComponents(){
		System.out.println(Arrays.toString(id));
	}
	
	public int count(){return count;}
	
}
