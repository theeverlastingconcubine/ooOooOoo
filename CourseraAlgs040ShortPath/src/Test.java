import java.util.Random;

public class Test {

	public static void main(String[] args) {

		// test IndexedMinHeap
		IndexedMinHeap<String> heap = new IndexedMinHeap<String>(10);

		String[] keys = { "b", "e", "x", "mis", "l", "idn", "yr", "face", "cire", "rule", "your", "life", "candy", "mo",
				"arc", "goo", "cow", "beetle", "kwak" };
		
		System.out.println(keys.length);			
		for (int i = keys.length-1; i >=0; i--) {
			heap.insert(i, keys[i]);
		}
		
		int k = 0;
		while (!heap.isEmpty()) {
			
			System.out.println(k + ": " + heap.minKey() + "  " + heap.getMin());
			k++;
		}
		
		
		
		
		/*for (int i = 1; i <keys.length; i++) {
			System.out.println(i);
			heap.insert(i, keys[i]);
			
		}
		
		int r = 0;
		while (!heap.isEmpty()) {
			
			System.out.println(r + ": " + heap.minKey() + "  " + heap.getMin());
			r++;
		}
		
		String[] keys1 = { "b", "e", "x", "mis", "l", "idn", "yr", "face", "cire", "rule", "your", "life", "candy", "mo",
				"arc", "goo", "cow", "beetle", "kwak", "z", "as", "boka", "zhoka" };
		
		
		Random rnd = new Random();
			
			for(int i = keys1.length-2; i>0; i--){
				
				heap.insert(rnd.nextInt(i), keys1[rnd.nextInt(i)]);
			}
			
			int q = 0;
			while (!heap.isEmpty()) {
				
				System.out.println(q + ": " + heap.minKey() + "  " + heap.getMin());
				q++;
			}*/
		
		
		

	}
}