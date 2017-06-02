import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args){
		
		
BST<Integer, String> bst = new BST<Integer, String>();
		
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
		
		
		for (ArrayList<BST<Integer, String>.Node> level: bst.levels()) System.out.println(level);
		
		ArrayList<ArrayList<BST<Integer, String>.Node>> levels = bst.levels();
		
		BST<Integer, String>.Node node = levels.get(3).get(0);
		
		System.out.println();
		
		System.out.println(node);
		
		
		/*System.out.println(bst.validate1());
		System.out.println(bst.validate2());*/
	}

}
