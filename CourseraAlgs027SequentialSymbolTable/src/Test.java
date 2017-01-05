import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner sc = new Scanner(new File("input.txt"));

		SSST<String, Integer> st = new SSST<String, Integer>();

		int i = 0;
		while (sc.hasNext()) {
			st.put(sc.next(), i);
			i++;
		}
		
		for (String s: st.keys()){
			System.out.println(s + "  " + st.get(s));
		}
	}

}
