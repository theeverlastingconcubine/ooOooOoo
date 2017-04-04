import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws FileNotFoundException{
	
/*	Scanner sc = new Scanner(new File("text.txt")).useDelimiter("\\Z");
	String text = sc.next();
	System.out.println(text);
	sc.close();*/
		
		
		String txt = "Freundschaftsbezeigungenstadtverordnetenversammlungenfamilieneigenthuemlichkeiten";
				
		Suffix[] stringLikeArray= new Suffix[txt.length()];
		for(int i = 0; i<txt.length(); i++){
			stringLikeArray[i] = new Suffix(txt,i); 
		}
		
		StringLikeString[] stringArray = {
				new StringLikeString("good"),
				new StringLikeString("morning"),
				new StringLikeString("worm"),
				new StringLikeString("your"),
				new StringLikeString("honor"),
				new StringLikeString("the"),
				new StringLikeString("crown"),
				new StringLikeString("will"),
				new StringLikeString("plainly"),
				new StringLikeString("show"),
				new StringLikeString("the"),
				new StringLikeString("prisoner")};
	
		Quick3Sort.sort(stringLikeArray); //---- this works
		
		Quick3Sort.sort(stringArray); //-----this not works
		for(StringLikeString s: stringArray) System.out.println(s);
		
		
	}

}
