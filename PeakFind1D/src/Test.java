import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("test.txt"));
		NoBorderArray<Integer> nb = new NoBorderArray<Integer>(sc.nextInt());

//read from file to NoBoderArray nb
		
		int i = 0;
		while (sc.hasNext()) {
			nb.set(sc.nextInt(), i);
			i++;
		}
		sc.close();
		System.out.println(nb + " size: " + nb.length());
		
		System.out.println();
		
		printPeaks(nb);

	
	}
	
	
// i want to do this as ..d printPeaks(NoBorderArray<Comparable> a), but it does not work
// it says nb is not of the type NoBorderArray<Comparable> when call printPeaks(nb)
// but nb is of type NoBorderArray<Integer> which should be the specification of NoBorderArray<Comparable>
	
	
	private static void printPeaks(NoBorderArray<Integer> a) {

		for (int i = 0; i < a.length(); i++) {
			if (a.value(i).compareTo(a.value(i + 1)) >= 0 && a.value(i).compareTo(a.value(i - 1)) >= 0) {
				System.out.println(a.value(i));
			}

		}

	}

}
