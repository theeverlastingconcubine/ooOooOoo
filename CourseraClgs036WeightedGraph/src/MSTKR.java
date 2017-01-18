import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MSTKR {
	
	private Queue<Edge> mst = new LinkedList<Edge>();
	
	public MSTKR(WGraph g){
		
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>(g.edges());
		
		UF uf = new UF(g.V());
		while(!pq.isEmpty() && mst.size()<g.V()-1){
			
			
			Edge e = pq.delMin();
			int v = e.either(), w = e.other(v);
			if(!uf.connected(v,w)){
				uf.union(v, w);
				mst.add(e);						
			}
			
			
			
		}
		
		
	}
	
	
	public Iterable<Edge> edges(){
		return mst;
		
	}
	
	//public double weigth(){
		
	//}

}
