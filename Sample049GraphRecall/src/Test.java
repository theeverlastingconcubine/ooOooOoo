import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
	
	
	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner sc = new Scanner(new File("graph.txt"));
		
		Graph G = new Graph(sc.nextInt());
		while(sc.hasNextInt()){
			G.addEdge(sc.nextInt(), sc.nextInt());
		}
		sc.close();
		
		System.out.println(G);
		
		BFS path1 = new BFS(G,0);
		System.out.println(path1.pathTo(8));
		
		DFS path2 = new DFS(G,0);
		System.out.println(path2.pathTo(8));
		
		CC cc = new CC(G);
		System.out.println(Arrays.toString(cc.cc()));
		System.out.println(cc.numConComp());
		
		
		
		
	
		
		
	}

}
