import java.util.LinkedList;

public class DiGraph {
	
	private int V;
	private LinkedList<DirEdge>[] adj;
	private UF connected;
	
	public DiGraph(int V){
		this.V = V;
		adj = (LinkedList<DirEdge>[]) new LinkedList[V];
		for(int i = 0; i<V; i++){
			adj[i] = new LinkedList<DirEdge>();
		}
		connected = new UF(V);
		
	}
	
	public void addEdge(DirEdge e){
		int v = e.from();
		adj[v].add(e);
		connected.add(e.from(), e.to() );
				
	}
	
	public Iterable<DirEdge> adj(int v){
		return adj[v];
	}
	
	public String toString(){
		String s = "Vertex " + V + "\n";
		for(int v=0; v<V; v++){
			s = s + v +" : ";
					for(DirEdge e: adj[v]) s = s + " " + e;
					s = s + "\n";
		}
		
		return s;
	}
	
	//bfs
	
	public boolean hasRouteBFS(int v, int w){
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		boolean[] marked = new boolean[V];
		
		queue.addLast(v);
		
		while(!queue.isEmpty()){
		int a = queue.removeFirst();
		for(DirEdge x: adj[a]){
			int Q = x.to();
			if(marked[Q] == false){
				if (Q==w) return true;
				else { 
					marked[Q] = true;
					queue.addLast(Q);
				
					}
				}				
			
		}
		}
		return marked[w];
		}
	
	public boolean isConnected(int p, int q){
		return connected.isConnected(p, q);
	}
	
	

}
