
public class Test {
		
	public static void main(String[] args){
		
		BST<String, Integer> bst = new BST<String, Integer>();
		
		bst.insert("abduhl", 666);
		bst.insert("jesus", 0);
		bst.insert("reptilian", -10);
		bst.insert("void", Integer.MIN_VALUE);
		bst.insert("mason", 100);
		bst.insert("valnigra", 225);
		bst.insert("pyramidhead", 11);
		bst.insert("reptilian", 225);
		
		System.out.println(bst.get("pyramidhead"));
		
		
		Iterable<String> bstList = bst.listBST();
		
		for(String s: bstList) System.out.println(s);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
