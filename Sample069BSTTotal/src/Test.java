import java.util.ArrayList;
import java.util.Arrays;


public class Test {
	
	public static void main(String[] args){
		
		/*BST<Integer, String> bst = new BST<Integer, String>();
		bst.put(100, "sto");
		bst.put(150, "stopisyat");
		bst.put(30, "tridzat");
		bst.put(20, "dvadzat");
		bst.put(110, "stodesyat");
		bst.put(10, "desyat");
		bst.put(0, "NOLIK");
		bst.put(15, "pyatnadzat");
		bst.put(10, "dvadzat");
		bst.put(160, "stoshysyat");
		
		bst.put(-200, "minus Dvesti");
		
		System.out.println(bst.search(20));
		System.out.println(bst.search(160));
		System.out.println(bst.search(666));
		System.out.println(bst.search(10));
		System.out.println(bst.search(0));
		
		bst.delete(150);*/
		
			
	//	for(ArrayList<BST<Integer, String>.Pair> level: bst.levels()) System.out.println(level);
		
		BST<Integer, Integer> shortbst = new BST<Integer, Integer>();
		
		Integer[] a = new Integer[31];
		
		for(int i=0; i<a.length; i++){
			a[i] = i;
		}
		
		System.out.println(Arrays.toString(a));
		
		shortbst.shortBST(a, a);
		
		for(ArrayList<BST<Integer, Integer>.Pair> level: shortbst.levels()) System.out.println(level);
		
		
		
		
		
		
		
	}

}
