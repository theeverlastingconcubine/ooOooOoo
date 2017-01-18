import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
	
	
	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner sc = new Scanner(new File("graph.txt"));
		
		/*int V = sc.nextInt();
		System.out.println(V);
		*/
		/*int v = sc.nextInt();
		int w = sc.nextInt();
		double weigth = sc.nextDouble();
		System.out.println(v + "  " + w + "   " + weigth);
*/		
		
		
		WGraph graph = new WGraph(sc.nextInt());
		
		while (sc.hasNextDouble()){
			Edge edge = new Edge(sc.nextInt(), sc.nextInt(), sc.nextDouble());
			graph.addEdge(edge);
			
		}
		
		sc.close();
		
		System.out.println(graph);
		
		for (Edge e: graph.edges()) System.out.println(e);
		
		
		
		MSTKR mst = new MSTKR(graph);
		for(Edge e: mst.edges()) System.out.print(e + ", ");
		
		
		
		
		
		
	}

}
