import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args){
		
		MyBST<Integer, String> bst = new MyBST<Integer, String>();
		
		bst.put(-5, "hi");
		bst.put(7, "hi");
		bst.put(0, "hi");
		bst.put(2, "hi");
		bst.put(10, "hi");
		bst.put(5, "hi");
		
	/*	for(int i: bst.inOrder()) System.out.println(i);
		
		ArrayList<ArrayList<Integer>> levels = bst.levels();
		for(int i = 0; i<levels.size(); i++){
			System.out.println(levels.get(i));
		}*/
		
		
		Integer[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		MyBST<Integer, String> bst1 = new MyBST<Integer, String>(a);
		
		ArrayList<ArrayList<Integer>> levels1 = bst1.levels();
		for(int i = 0; i<levels1.size(); i++){
			System.out.println(levels1.get(i));
		}
		
		
		
	}

}
