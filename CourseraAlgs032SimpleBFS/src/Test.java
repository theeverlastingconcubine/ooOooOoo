import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner sc = new Scanner(new File("graphTest.txt"));
		
		Graph graph = new Graph(sc.nextInt());
		while(sc.hasNextInt()){graph.addEdge(sc.nextInt(), sc.nextInt());}
		sc.close();
		
		System.out.println(graph);
		
		
		BFS shortestPathFinder = new BFS(graph,0);
		
		for (int i: shortestPathFinder.pathTo(4)) System.out.println(i);;
		
		
		
	}

}
