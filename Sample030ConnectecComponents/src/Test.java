import java.util.Arrays;

public class Test {
	
	
	public static void main(String[] args){
		
		Graph g = new Graph(13);
		
		g.addEdge(0, 5);
		g.addEdge(4, 3);
		g.addEdge(0, 1);
		g.addEdge(9, 12);
		g.addEdge(6, 4);
		g.addEdge(5, 4);
		g.addEdge(0, 2);
		g.addEdge(11, 12);
		g.addEdge(9, 10);
		g.addEdge(0, 6);
		g.addEdge(7, 8);
		g.addEdge(9, 11);
		g.addEdge(5, 1);
		
		
		ConComp cc = new ConComp(g);
		System.out.println(Arrays.toString(cc.components()));
		
		
		
		
	}

}
