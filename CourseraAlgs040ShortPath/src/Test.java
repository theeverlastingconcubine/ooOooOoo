
public class Test {

	public static void main(String[] args) {

		// test IndexedMinHeap
		IndexedMinHeap<String> heap = new IndexedMinHeap<String>();

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
		

	}
}