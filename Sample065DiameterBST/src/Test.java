import java.util.Random;

public class Test {
	
	public static void main(String[] args){
		
		
		NotBST<Integer> tree = new NotBST<Integer>();
		
		Random rnd = new Random();
		
		for(int i = 0; i<rnd.nextInt(100); i++){
			tree.put(rnd.nextInt(100));
		}
		
		System.out.println(tree);
	}

}
