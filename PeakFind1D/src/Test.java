import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("test.txt"));

		NoBorderArray<Integer> nb = new NoBorderArray<Integer>(sc.nextInt());

		int i = 0;
		while (sc.hasNext()) {
			nb.set(sc.nextInt(), i);
			i++;
		}
		
		System.out.println(nb);

	}
}
