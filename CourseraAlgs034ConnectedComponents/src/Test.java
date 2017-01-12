import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
	
	//want to answer isConnected(int u, int v) in constant time 

	
	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner sc = new Scanner(new File("graphTest.txt"));
		
		Graph graph = new Graph(sc.nextInt());
		
		while (sc.hasNextInt()){
			graph.addEdge(sc.nextInt(), sc.nextInt());
		}
		
		sc.close();
		
		System.out.println(graph);
		
		CC components = new CC(graph);
		
		components.showComponents();
			
		
		
	}
}
