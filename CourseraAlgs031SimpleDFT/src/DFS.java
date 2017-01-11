import java.util.Arrays;
import java.util.LinkedList;

public class DFS {

	// s means SOURCE vertex

	private int s;
	private int[] edgeTo; // vertex we came from
	private boolean[] marked;

	public DFS(Graph G, int s) {
		this.s = s;
		this.edgeTo = new int[G.V()];
		this.marked = new boolean[G.V()];

		// for(int i=0; i<marked.length; i++) marked[i] = false;
		dfs(G, s);

		System.out.println(Arrays.toString(marked));

	}

	private void dfs(Graph G, int v) {

		marked[v] = true;

		for (int w : G.adj(v)) {

			if (!marked[w]) {
				dfs(G, w);
				edgeTo[w] = v;
			}
		}

	}

	public boolean hasPathTo(int v) {

		return marked[v];

	}

	public Iterable<Integer> pathTo(int v) {

		if (!hasPathTo(v))
			return null;
		LinkedList<Integer> path = new LinkedList<Integer>();
		for (int x = v; x != s; x = edgeTo[x]) {
			path.push(x);
		}
		path.push(s);
		return path;
	}

}
