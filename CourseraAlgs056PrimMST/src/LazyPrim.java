import java.util.ArrayList;

public class LazyPrim {
	
	ArrayList<Edge> tree;
	boolean[] marked;
	IndexedMinHeap<Edge, Double> pq;
	
	public LazyPrim(Graph G){
		tree = new ArrayList<Edge>();
		pq = new IndexedMinHeap<Edge, Double>();
		marked = new boolean[G.V()];
					
		while(!pq.isEmpty()){
			
			Edge e = pq.getMin();
			int v = e.either();
			int w = e.other(v);
			if(marked[v] && marked[w]) continue;
			tree.add(e);
			if(!marked[v]) visit(G,v);
			if(!marked[w]) visit(G,w);
			
				
						
			
		}
		
			
		
		
	}
	
	private void visit(Graph G, int v){
		marked[v] = true;
		for(Edge e: G.adj(v)){
			if(!marked[e.other(v)]) pq.insert(e, e.weight());
		}
		
	}
	
	

}
