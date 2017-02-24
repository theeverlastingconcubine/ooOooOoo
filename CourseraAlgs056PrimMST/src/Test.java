import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner sc = new Scanner(new File("graph.txt"));
		Graph g = new Graph(sc.nextInt());
		
		while(sc.hasNext()){
			g.addEdge(new Edge(sc.nextInt(), sc.nextInt(), sc.nextDouble()));
		}

		sc.close();
		
		System.out.println(g);
		
	
	
	

}
	
}
