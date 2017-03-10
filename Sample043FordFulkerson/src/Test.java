import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner sc = new Scanner(new File("littleTest.txt"));
		
		FlowNet net = new FlowNet(sc.nextInt());
		while(sc.hasNext()){
			int v = sc.nextInt();
			int w = sc.nextInt();
			double capacity = sc.nextDouble();
			net.addEdge(new FlowEdge(v,w,capacity));
		}
		sc.close();
		System.out.println(net);
		
		FordFulkerson ff = new FordFulkerson(net,0,3);
		System.out.println(ff.maxflow());
		
	}

}
