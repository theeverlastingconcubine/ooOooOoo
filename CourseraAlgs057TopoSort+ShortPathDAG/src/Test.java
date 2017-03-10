import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(new File("graph.txt"));
		Graph g = new Graph(sc.nextInt());
		
		while (sc.hasNext()){
			int v = sc.nextInt();
			int w = sc.nextInt();
			Double weight = sc.nextDouble();
		//	System.out.println(v + ":" + w + ":" + weight);
			g.addEdge(new Edge(v,w,weight));			
		}
		sc.close();
		
		System.out.println(g);
		
		Topo topo = new Topo(g);
		for(int s: topo.topoOrder()) System.out.print(s + " --> ");
		System.out.println();
		
		ShortestPathDAG sp = new ShortestPathDAG(g,0);
		for(Edge e: sp.pathTo(4)) System.out.println(e);
		System.out.println(sp.cost(4));
		
		
		
	}
	
}
