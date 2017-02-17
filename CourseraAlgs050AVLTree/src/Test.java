
public class Test {
	
	public static void main(String[] args){
		
		AVL<Integer, String> tree = new AVL<Integer, String>();
		
		tree.put(14, "fourteen");
		tree.put(4, "four");
		tree.put(25, "twentyfive");
		tree.put(30, "thirty");
		tree.put(40, "fourty");
		
		System.out.println(tree);
		
	}

}
