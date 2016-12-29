import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("test.txt"));

		MaxPriorityQueue heap = new MaxPriorityQueue(sc.nextInt());

		while (sc.hasNext()) {
			heap.insert(sc.nextInt());
		}
		
		System.out.println(heap);
		
		

	}
}
