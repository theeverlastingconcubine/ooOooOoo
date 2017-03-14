import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(new File("text.txt"));
		RBBST<String, String> bst = new RBBST<String, String>();
		while (sc.hasNext()){
			String word = sc.next().toLowerCase();
			bst.put(word,  word);
		}
		sc.close();
		
		RBBST<Integer, Integer> bst1 = new RBBST<Integer, Integer>();
		Random rnd = new Random();
		int k = 7;
		while(k>0){
			int i = rnd.nextInt(100);
			bst1.put(i,i);
			k--;
		}
	
		ArrayList<ArrayList<Integer>> list = bst1.levels();
		for(ArrayList<Integer> level: list) System.out.println(level);
		
		
							
	}

}
