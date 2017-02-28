import java.util.ArrayList;
import java.util.List;

public class MST {
	
	//KRUSKAL MST. add everything to minPQ, grow one by one avoid cycles
	//till V-1
	
	IndexedMinHeap<Edge, Double> pq;
	boolean[] marked;
	List<Edge> tree;
	
	public MST(Graph G){
		
		pq = new IndexedMinHeap<Edge, Double>();
		marked = new boolean[G.V()];
		tree = new ArrayList<Edge>();
		
		for(int v = 0; v<G.V(); v++){
			for(Edge e: G.adj(v)){
				pq.insert(e, e.weight());
			}
		}
		
		/*while(!pq.isEmpty()){
			Edge e = pq.getMin();
			int v = e.either();
			int w = e.other(v);
			if(!(marked[v] && marked[w])){
				tree.add(e);
				marked[v] = true;
				marked[w] = true;
			}
			
		}*/
		
		
		
		UF uf = new UF(G.V());
		while(!pq.isEmpty() && tree.size()<G.V()-1){
		
		Edge e = pq.getMin();
		int v = e.either();
		int w = e.other(v);
		if(!uf.isConnected(v,w)){
			uf.add(v, w);
			tree.add(e);
		}
		}
				
	}
	
	public Iterable<Edge> tree(){
		return tree;
	}
	
	

}
