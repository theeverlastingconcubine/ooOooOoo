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
		
		String[] stringArray = {"good","morning","worm","your","honor","the","crown","will","plainly","show","the","prisoner"};
	
		Quick3Sort.sort(stringLikeArray); //---- this works
		
		Quick3Sort.sort(stringArray); //-----this not works
		
		
	}

}
