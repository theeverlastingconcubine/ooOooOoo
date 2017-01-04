import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {

		MyLinkedList<String> mylist = new MyLinkedList<String>();

		mylist.add("bottle 9");
		mylist.add("bottle 8");
		mylist.add("bottle 7");
		mylist.add("bottle 6");
		mylist.add("bottle 5");
		mylist.add("bottle 4");
		mylist.add("bottle 3");
		mylist.add("bottle 2");
		mylist.add("bottle 1");

		System.out.println("list size is  " + mylist.size());
		System.out.println();

		for (String s : mylist) {
			System.out.print("[" + s + "]--->");
		}

		System.out.println();
		System.out.println();

		int where = mylist.searchItem("bottle 4");

		System.out.println(where);
		System.out.println();

		mylist.addAtPosition("bottle 4.5", 5);

		for (String s : mylist) {
			System.out.print("[" + s + "]--->");
		}

		mylist.addAfter("666", "bottle 7");

		System.out.println();
		System.out.println();

		for (String s : mylist) {

			System.out.print("[" + s + "]--->");
		}

		Scanner sc = new Scanner(new File("input.txt"));

		ST<String, Integer> st = new ST<String, Integer>();

		int i = 0;
		while (sc.hasNext()) {
			st.put(sc.next(), i);
			i++;
		}
		
		for (String s: st.keys()){
			System.out.println(s + "  " st.get(s));
		}

	}

}
