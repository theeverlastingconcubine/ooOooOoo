import java.util.LinkedList;

public class ShortestPath {

	private final int s;
	private double[] distTo;
	private DirEdge[] edgeTo;

	public ShortestPath(int s, WDG graph) {
		this.s = s;
		distTo = new double[graph.V()];
		edgeTo = new DirEdge[graph.V()];

	}

	private void relax(DirEdge e) {

		int v = e.from();
		int w = e.to();

		if (distTo[w] > distTo[v] + e.weigth()) {
			distTo[w] = distTo[v] + e.weigth();
			edgeTo[w] = e;
		}

	}

	public double distTo(int v) {
		return distTo[v];
	}

	public Iterable<DirEdge> pathTo(int v) {

		LinkedList<DirEdge> path = new LinkedList<DirEdge>();

		for (DirEdge e = edgeTo[v]; e != null; e = edgeTo[e.from()]) {
			path.push(e);

		}
		return path;
	}

}
