import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
	
	
	//actually 
	
	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner sc = new Scanner(new File("graph.txt"));
		Graph g = new Graph(sc.nextInt());
		
		while(sc.hasNext()){
			g.addEdge(new Edge(sc.nextInt(), sc.nextInt(), sc.nextDouble()));
		}

		sc.close();
		
		System.out.println(g);
		
		MST mst = new MST(g);
		for(Edge e: mst.tree()) System.out.println(e);
		
		EagerPrim mstt = new EagerPrim(g);
		
		for(Edge e: mstt.tree()) System.out.println(e);
	
	
	

}
	
}
