import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("graph.txt"));
		WDG graph = new WDG(sc.nextInt());
		
		while (sc.hasNextDouble()) {
			DirEdge edge = new DirEdge(sc.nextInt(), sc.nextInt(), sc.nextDouble());
			graph.addEdge(edge);
		}
		
		sc.close();
		
		System.out.println(graph);
		System.out.println(graph.E());

		ShortestPath sp = new ShortestPath(0, graph);
		for(int v = 0; v<graph.V(); v++){
			System.out.print(0 + " : " + sp.distTo(v) + " : ");
			for(DirEdge e: sp.pathTo(v)) System.out.print(e + " ");
			System.out.println();
		}
		
	}

}
