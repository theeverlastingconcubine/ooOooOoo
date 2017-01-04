import java.util.HashSet;

public class Test {

	public static void main(String[] args) {

		int[] a = { 0, 1, 6, 3, 78, 5456, 89, 32, 7, 9546, 2 };
		
		boolean b = hasDuplicates(a);
		System.out.println(b);

	}

	public static boolean hasDuplicates(int[] a) {

		if (a.length == 0 || a == null)
			return false;

		HashSet<Integer> hs = new HashSet<Integer>();

		for (int i : a) {
			if (!hs.add(i))
				return true;
		}
		return false;

	}

}
