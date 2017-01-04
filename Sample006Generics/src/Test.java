import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		
		Pair<String, Integer> testpair = new Pair<String, Integer>("rooster", 14);

		System.out.println(testpair);

		LinkedList<Pair<String, Integer>> testlist = new LinkedList<Pair<String, Integer>>();

		
		testlist.add(new Pair<String, Integer>("hi", 6));
		testlist.add(new Pair<String, Integer>("ho", 1));
		testlist.add(new Pair<String, Integer>("hiii", 644));

		for (Pair<String, Integer> pair1 : testlist) {
			System.out.println(pair1);
		}
		System.out.println();
		// block above works fine, but for some reason with
		// Prokladka class it ends up with java.lang.NullPointerException
		// when you add the first item
		
		// solved: constructor which creates (empty)list in Prokladka helped.
		
		
		System.out.println();
		
		Prokladka<String, Integer> fakelist = new Prokladka<String, Integer>();
		
		fakelist.add("ass", 3);
		fakelist.add("fog", 88);
		fakelist.add("concubine", 4483);

		for (Pair<String, Integer> pair : fakelist.getList()) {
			System.out.println(pair);
		}

	}

}
