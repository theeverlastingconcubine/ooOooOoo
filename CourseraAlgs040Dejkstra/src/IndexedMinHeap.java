import java.util.ArrayList;

public class IndexedMinHeap<Key extends Comparable<Key>> {
	
	
	private Key[] keys;
	private int[] pq;
	private int[] qp;
	private int n;
	
	public IndexedMinHeap(int capacity){
		
		keys = (Key[]) new Comparable[capacity];
		pq = new int[capacity];
		qp = new int[capacity];
		n=0;
				
	}
	
	
	

}
