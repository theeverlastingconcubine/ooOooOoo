
public class Test {
	
public static void main(String[] args){
		
		
		BST<Integer, String> bst = new BST<Integer, String>();
		
		bst.put(5, "five");
		bst.put(2, "two");
		bst.put(10, "ten");
		bst.put(1, "one");
		bst.put(0, "zero");
		bst.put(20, "twenty");
		bst.put(-4, "NEGATIVE");
		bst.put(15, "fifteen");
		bst.put(666, "beast");
		bst.put(-1, "negativeone");
		
		
		System.out.println(bst.get(666));
		System.out.println(bst.get(66));
		System.out.println(bst.getMin());
		System.out.println(bst.levelList());
		
		bst.delete(15);
		
		System.out.println(bst.levelList());
		
}

}
