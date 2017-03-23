import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		/*String[] txt = {"over","my","skin","something","never","happend","if","only","all"};
		Quick3Sort(txt);*/
		
		/*
		Scanner sc = new Scanner(new File("text.txt")).useDelimiter("\\Z");
		String text = sc.next();
		System.out.println(text);
		sc.close();
		
		int n=text.length();
		
		SuffixArray sa = new SuffixArray(text);
		
		int context= 11;
		String query = "There";
		
		for(int i = sa.rank(query); i<n; i++){
			int from1 = sa.index(i);
			int to1 = Math.min(n, from1 + query.length());
			if (!query.equals(text.substring(from1, to1))) break;
			int from2 = Math.max(0, sa.index(i) - context);
			int to2 = Math.min(n, sa.index(i) + context + query.length());
			System.out.println(text.substring(from2,to2));
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*String text1 = "I've been the witness, and the"
				+ "seal of death lingers in the molten wax that is my head";
		InContext searcher = new InContext(text1);
		String[] suffix = searcher.suffixArray();
		
		int i = 0;
		for (String s: suffix) {
			System.out.println(i + " " + s);
			i++;
		}
		
		System.out.println(searcher.binSearch(suffix, "is my head")); //works
		System.out.println(suffix[5]);*/
		
		
	}

}
