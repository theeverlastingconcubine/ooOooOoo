package ice010bidirecionalBFS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		
		Scanner sc = new Scanner(new File("Graph.txt"));
		
		Graph G = new Graph(sc.nextInt());
		while(sc.hasNext()){
			G.add(sc.nextInt(), sc.nextInt());
		}
		sc.close();
		
		System.out.println(G);
		
		BiBFS pathFinder = new BiBFS(G,0,3);
		System.out.println(pathFinder.getLog());
		
		for(Integer key: pathFinder.from1.keySet()) System.out.println(key + "  " + pathFinder.from1.get(key));
		System.out.println();
		
		for(Integer key: pathFinder.from2.keySet()) System.out.println(key + "  " + pathFinder.from2.get(key));
	}

}
