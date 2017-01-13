import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
	
	
	
	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner sc = new Scanner(new File("test.txt"));
		
		DiGraph d = new DiGraph(sc.nextInt());
		
		while (sc.hasNextInt()){
			
			d.addEdge(sc.nextInt(), sc.nextInt());
		}
		
		sc.close();
		
		System.out.println(d);
		
		System.out.println("Indegree 4 is " + d.inDegree(4));
		System.out.println("Outdegree 10 is " + d.outDegree(10));
	}

	
	
	
	
}
