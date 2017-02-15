
public class Test {
	
public static void main(String[] args){
		
		BST<Integer, String> bst = new BST<Integer, String>();
		
		bst.put(-5, "hi");
		bst.put(7, "hi");
		bst.put(0, "hi");
		bst.put(2, "hi");
		bst.put(10, "hi");
		bst.put(5, "hi");
		bst.put(100, "hi");
		bst.put(-100, "hi");
		
		for(Integer i: bst) System.out.print(i + ", ");
		System.out.println();
		
		System.out.println(bst.min());
		System.out.println(bst.ceiling(1));
		bst.delete(5);
		
		for(Integer i: bst) System.out.print(i + ", ");
		

}

}
