import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {

		//////////////// test IndexedMinHeap //////////////////////////
		IndexedMinHeap<String> heap = new IndexedMinHeap<String>(5);

		//19 elements here, add in decreasing order
		
		String[] keys = { "b", "e", "x", "mis", "l", "idn", "yr", "face", "cire", "rule", "your", "life", "candy", "mo",
				"arc", "goo", "cow", "beetle", "kwak" };
		for (int i = keys.length-1; i >=0; i--) {
				heap.insert(i, keys[i]);
		}
		int k = 0;
		while (!heap.isEmpty()) {
			//heap.getMin();
			System.out.println(k + ": " + heap.minKey() + "  " + heap.getMin());
			k++;
		}
		System.out.println("------------------------");
					
		//23 elements in keys1, add in increasing order
		String[] keys1 = { "b", "e", "x", "mis", "l", "idn", "yr", "face", "cire", "rule", "your", "life", "candy", "mo",
				"arc", "goo", "cow", "beetle", "kwak", "z", "as", "boka", "zhoka" };
		for(int i=0; i<keys1.length; i++){
			heap.insert(i, keys1[i]);
		}
		int a = 0;
		while (!heap.isEmpty()) {
			//heap.getMin();
			System.out.println(a + ": " + heap.minKey() + "  " + heap.getMin());
			a++;
		}
		System.out.println("------------------------");
		
		//add in random order
		Random rnd = new Random();
			
			for(int i = keys1.length-1; i>0; i--){
				int c = rnd.nextInt(i);
				int b = rnd.nextInt(i);
			heap.insert(c, keys1[b]);
				
			}
			
			int q = 0;
			while (!heap.isEmpty()) {
				System.out.println(q + ": " + heap.minKey() + "  " + heap.getMin());
				q++;
			}
			System.out.println("------------------------");
								
			/////////////////////////////////////////
			/////////////////////////////////////////
			/////////////////////////////////////////
			
			
			Scanner sc = new Scanner(new File("graph.txt"));
			Graph graph = new Graph(sc.nextInt());
			
			while(sc.hasNext()){ 
				graph.addEdge(new Edge(sc.nextInt(), sc.nextInt(), sc.nextDouble()));
					}
			sc.close();
			
			System.out.println(graph);
			
			PathFinder pathfinder = new PathFinder(graph, 0);
			
			for(Edge e: pathfinder.pathTo(6)) System.out.println(e);
			
			
			/////////////////////////
			
			Edge e1 = new Edge(1,2,3.0);
			Edge e2 = new Edge(2,8,9.0);
			Edge e3 = new Edge(1,2,3.0);
			
			Set<Edge> set = new HashSet<Edge>();
			set.add(e1);
			set.add(e2);
			set.add(e3);
			
			for(Edge e: set) System.out.println(e);
			
			
		

	}
}