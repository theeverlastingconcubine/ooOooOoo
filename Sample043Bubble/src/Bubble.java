import java.util.Arrays;
import java.util.Random;

public class Bubble {

	private static void swap(Comparable[] a, int i, int j) {
		Comparable tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	private static boolean less(Comparable[] a, int i, int j) {
		return a[i].compareTo(a[j]) < 0;
	}
	
	private static boolean isSorted(Comparable[] a){
		boolean flag = true;
		for(int i = 1; i<a.length; i++){
			if(less(a,i,i-1)) flag = false;
		}
		return flag;
		
	}

	private static void bubble(Comparable[] a) {
		int N = a.length;
		boolean flag;

		for (int i = 0; i < N; i++) {
			flag = false;
			for (int j = 1; j < N - i; j++) {
				if (less(a, j, j - 1)) {
					swap(a, j, j - 1);
					flag = true;
				}
			}
			if (flag==false) break;
		}

	}

	public static void main(String[] args) {
		
		Random rnd = new Random();
		Integer[] a = new Integer[rnd.nextInt(21)];
		for(int i = 0; i<a.length; i++){
			a[i] = rnd.nextInt(21);
		}
		System.out.println(Arrays.toString(a));
		bubble(a);
		System.out.println(Arrays.toString(a));
		System.out.println(isSorted(a));

	}

}
