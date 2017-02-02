import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("graph.txt"));

		Graph g = new Graph(sc.nextInt());
		while (sc.hasNext())
			g.addEdge(sc.nextInt(), sc.nextInt());
		sc.close();
		
		DFS dfs = new DFS(g,0);
		
		TopSort top = new TopSort(g);
		
		for(int e: top.reversePost()) System.out.println(e);
		
		
		
		

	}

}
