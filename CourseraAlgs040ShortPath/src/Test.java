import java.util.Random;

public class Test {

	public static void main(String[] args) {

		// test IndexedMinHeap
		IndexedMinHeap<String> heap = new IndexedMinHeap<String>(10);

		//19 elements here
		String[] keys = { "b", "e", "x", "mis", "l", "idn", "yr", "face", "cire", "rule", "your", "life", "candy", "mo",
				"arc", "goo", "cow", "beetle", "kwak" };
		
					
		for (int i = keys.length-1; i >=0; i--) {
				heap.insert(i, keys[i]);
		}
		
			
		int k = 0;
		while (!heap.isEmpty()) {
			heap.getMin();
		//System.out.println(k + ": " + heap.minKey() + "  " + heap.getMin());
			k++;
		}
		
		
		
		
		
				
		//23 elements in keys1
		
		String[] keys1 = { "b", "e", "x", "mis", "l", "idn", "yr", "face", "cire", "rule", "your", "life", "candy", "mo",
				"arc", "goo", "cow", "beetle", "kwak", "z", "as", "boka", "zhoka" };
		
		for(int i=0; i<keys1.length; i++){
			System.out.println(i);
			heap.insert(i, keys1[i]);
		}
		
		
		int a = 0;
		while (!heap.isEmpty()) {
			
			System.out.println(a + ": " + heap.minKey() + "  " + heap.getMin());
			a++;
		}
		
		
		
		
		/*Random rnd = new Random();
			
			for(int i = keys1.length-2; i>0; i--){
				
				int a = rnd.nextInt(i);
				int b = rnd.nextInt(i);
				System.out.println(a + " " + b);
				heap.insert(a, keys1[b]);
				
			}
			
			int q = 0;
			while (!heap.isEmpty()) {
				
				System.out.println(q + ": " + heap.minKey() + "  " + heap.getMin());
				q++;
			}*/
		
		
		

	}
}