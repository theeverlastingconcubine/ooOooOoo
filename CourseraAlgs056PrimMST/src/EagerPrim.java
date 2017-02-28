import java.util.ArrayList;

public class EagerPrim {
	
	ArrayList<Edge> tree;
	boolean[] marked;
	Double[] distTo;
	Edge[] edgeTo;
	IndexedMinHeap<Integer, Double> pq;
	
	
	public EagerPrim(Graph G){
		
		tree = new ArrayList<Edge>();
		marked = new boolean[G.V()];
		pq = new IndexedMinHeap<Integer, Double>();
		edgeTo = new Edge[G.E()];
		distTo = new Double[G.V()];
		
		for(int v = 0; v<G.V(); v++) distTo[v] = Double.POSITIVE_INFINITY;
		
		for(int v = 0; v<G.V(); v++)
			if(!marked[v]) prim(G,v);
			
	}
	
	private void prim(Graph G, int s){
		distTo[s] = 0.0;
		pq.insert(s, distTo[s] );
		while(!pq.isEmpty()){
			int v = pq.getMin();
			visit(G,v);
		}
	}
	
	
	
	
	
	
	
	
	private void visit(Graph G, int v){
		
		marked[v] = true;
		for(Edge e: G.adj(v)){
			int w = e.other(v);
			double ewt = e.weight();
			if(marked[w]) continue;
			if(ewt<distTo[w]){
				distTo[w] = ewt;
				edgeTo[w] = e;
				if(pq.hasElement(w)) pq.decreasePriority(w, distTo[w]);
				else pq.insert(w, distTo[w]);
			}
						
			
			
		}
		
	}
	
	public Iterable<Edge> tree(){
		return tree;
	}

}
