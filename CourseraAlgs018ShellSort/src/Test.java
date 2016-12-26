import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("test.txt"));
		
		Integer[] a = new Integer[sc.nextInt()];
		int i = 0;
		
		while (sc.hasNext()){
			
			a[i] = sc.nextInt();
			i++;
			
		}
		sc.close();
		
		System.out.println(Arrays.toString(a));
		System.out.println();
		
		ShellSort.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		
		
		

	}

}
