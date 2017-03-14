import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner sc = new Scanner(new File("graph2.txt"));
		Graph g = new Graph(sc.nextInt());
		
		while (sc.hasNext()){
			int v = sc.nextInt();
			int w = sc.nextInt();
			double weight = sc.nextDouble();
			g.addEdge(new Edge(v,w,weight));
		}
		sc.close();
		System.out.println(g);
		/*		
		CycleDetection cd = new CycleDetection(g);
		System.out.println(cd.hasCycle());
		for(int v:cd.cycle()) System.out.print(v + " ---> ");
		System.out.println();
		System.out.println("++++++++++");
		System.out.println("++++++++++");
		System.out.println("++++++++++");*/
		
		SPTOP p = new SPTOP(g, 0);
		System.out.println(p.pathTo(5));
		
		
		
				
	
		
		
		
	}

}
