import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner sc = new Scanner(new File("graphTest.txt"));
		
		Graph graph = new Graph(sc.nextInt());
		
		while (sc.hasNextInt()){
			graph.addEdge(sc.nextInt(), sc.nextInt());
		}
		
		sc.close();
		
		System.out.println(graph);
		
		
		BFS shortestPath = new BFS(graph,0);
		for (int v: shortestPath.shortestPath(8)){
			System.out.print(v + "->");
		}
		
		System.out.println("\n" + shortestPath.hasPath(8));
		
		
	}
}
