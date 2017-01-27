import java.util.Arrays;

public class Test {

	public static void main(String[] args){
		
		int[] a = new int[10];
		System.out.println(Arrays.toString(a));
				
	        String[] strings = { "it", "was", "the", "best", "of", "times", "it", "was", "the", "worst" };

	        IndMinHeap<String> pq = new IndMinHeap<String>(strings.length);
	        for (int i = 0; i < strings.length; i++) {
	            pq.insert(i, strings[i]);
	        }
	        
	        while (!pq.isEmpty()) {
	            int i = pq.delMin();
	            System.out.println(i + " " + strings[i]);
	        }
	        System.out.println();

	        
	        for (int i = 0; i < strings.length; i++) {
	            pq.insert(i, strings[i]);
	        }

	        /*for (int i : pq) {
	            System.out.println(i + " " + strings[i]);
	        }
	        while (!pq.isEmpty()) {
	            pq.delMin();
	        }*/

  }
	
	
}