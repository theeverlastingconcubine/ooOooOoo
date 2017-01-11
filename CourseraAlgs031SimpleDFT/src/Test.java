import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("testGraph.txt"));

		Graph G = new Graph(sc.nextInt());

		while (sc.hasNextInt()) {
			G.addEdge(sc.nextInt(), sc.nextInt());
			}
		sc.close();

		
		/*for(int v=0; v<G.V(); v++){
			for(int w : G.adj(v)){
				System.out.println(v + " --- " + w);
			}
			
		}*/
		
		System.out.println(G.toString());
		System.out.println("degree of 9 is "+degree(G,9));
		System.out.println("maxdegree " + maxDegree(G));
		System.out.println("selfloops "+numberOfSelfLoops(G));
		
		
		
		DFS pathFinder = new DFS(G, 0);
		
		for (int v = 0; v<G.V(); v++){
			if (pathFinder.hasPathTo(v)) System.out.print(v + " ");
		}
		
		System.out.println();
		
		for (int i: pathFinder.pathTo(3)) System.out.print(i + "-->");;
		
			
	}
	
	public static int degree(Graph G, int v){
		
		int degree = 0;
		for(int w: G.adj(v)) degree++;
		return degree;
	}
	
	public static int maxDegree(Graph G){
		int max = 0;
		for(int v=0; v<G.V(); v++){
			if (degree(G,v)>max) max = degree(G,v);
		}
		return max;
		
	}
	
	public static int numberOfSelfLoops(Graph G){
		
		int count = 0;
		for(int v=0; v<G.V(); v++){
			for(int w: G.adj(v)){
				if(v==w) count++;
			}
				
		}
		return count/2;
	}
	
	
	
	public static int avgDegree(Graph G){
		
		return 2* G.E()/G.V();
		
	}
	
	
	

}
