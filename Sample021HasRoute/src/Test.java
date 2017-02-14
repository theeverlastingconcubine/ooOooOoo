
public class Test {
	
	public static void main(String[] args){
		
		DiGraph graph = new DiGraph(9);
		graph.addEdge(new DirEdge(0,1));
		graph.addEdge(new DirEdge(0,2));
		graph.addEdge(new DirEdge(1,2));
		graph.addEdge(new DirEdge(1,5));
		graph.addEdge(new DirEdge(2,3));
		graph.addEdge(new DirEdge(3,4));
		graph.addEdge(new DirEdge(4,2));
		graph.addEdge(new DirEdge(4,0));
		graph.addEdge(new DirEdge(5,2));
		graph.addEdge(new DirEdge(5,3));
		graph.addEdge(new DirEdge(6,7));
		graph.addEdge(new DirEdge(6,8));
		graph.addEdge(new DirEdge(8,7));
		
		System.out.println(graph);
		
		System.out.println(graph.hasRouteBFS(4, 5));
			
		System.out.println(graph.isConnected(4, 7));
	}

}
