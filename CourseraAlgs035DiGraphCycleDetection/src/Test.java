import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner sc = new Scanner(new File("test.txt"));
		
		int V = 0;
		while(sc.hasNextInt()){
			int t = sc.nextInt();
			if (t>V) V=t;}
		sc.close();
		
		System.out.println(V);
		
		
		DiGraph dg = new DiGraph(V+1);
		Scanner scc = new Scanner(new File("test.txt"));
		while(scc.hasNextInt()){
			
			dg.addEdge(scc.nextInt(), scc.nextInt());
		}
		
		scc.close();
		
		System.out.println(dg);
		
		
	}

}
