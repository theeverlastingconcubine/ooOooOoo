import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args){
		
		Integer[] array = {6,3,77,33,9,3324,7,33,47,00,2,-2000};
		HeapPQ<Integer> pq = new HeapPQ<Integer>(array.length);

		for(int i=0; i<array.length; i++){
			pq.insert(array[i]);
		}
		
		System.out.println(pq.delMin());
		
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=0; i<array.length; i++) a.add(array[i]);
		HeapPQ<Integer> pqq = new HeapPQ<Integer>(a);
		
		System.out.println(pqq.delMin());
		
	}

}
