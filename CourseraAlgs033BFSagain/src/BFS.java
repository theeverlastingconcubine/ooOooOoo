import java.util.LinkedList;

public class BFS {

	private boolean[] marked;
	private int[] from;
	private final int s;

	public BFS(Graph g, int s) {

		this.marked = new boolean[g.V()];
		this.from = new int[g.V()];
		this.s = s;
		bfs(g, s);
	}

	private void bfs(Graph g, int v) {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		marked[v] = true;
		queue.add(v);

		while (!queue.isEmpty()) {
			int w = queue.removeFirst();
			for (int u : g.adj(w)) {
				if (!marked[u]) {
					queue.add(u);
					from[u] = w;
					marked[u] = true;
				}
			}

		}

	}

	public boolean hasPath(int v) {
		return marked[v];

	}

	public Iterable<Integer> shortestPath(int v) {

		if (!hasPath(v))
			throw new Error("they are not connected");

		LinkedList<Integer> path = new LinkedList<Integer>();

		for (int x = v; x != s; x = from[x]) {

			path.push(x);
		}

		path.push(s);

		return path;
	}

}
