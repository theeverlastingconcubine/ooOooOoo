import java.util.Collection;

public class HeapPQ<Key extends Comparable<Key>> {

	private Key pq[];
	private int N;
	
	public HeapPQ(int cap){
		pq = (Key[]) new Comparable[cap+1];
	}
	
	

	public HeapPQ(Collection<Key> c) {
		pq = (Key[]) new Comparable[c.size() + 1];
		for(Key key: c) this.insert(key); 

	}

	public boolean isEmpty() {
		return N == 0;
	}
	
	

	private void swim(int k) {

		while (k > 1 && !less(k / 2, k)) {
			swap(k, k / 2);
			k = k / 2;
		}

	}
	
	public void insert(Key x){
		pq[N+1] = x;
		N = N+1;
		swim(N);
	}
	
	private void sink(int k){
		
		while(2*k<=N){
			
			int j = 2*k;
			if (j<N && !less(j,j+1)) j++;
			if(less(k,j)) break;
			swap(k,j);
			k=j;
			
		}
	}
	
	
	public Key delMin(){
		Key max = pq[1];
		swap(1, N--);
		sink(1);
		pq[N+1] = null;
		return max;
				
	}

	private boolean less(int i, int j) {
		return pq[i].compareTo(pq[j]) < 0;
	}

	private void swap(int i, int j) {
		Key temp = pq[i];
		pq[i] = pq[j];
		pq[j] = temp;
	}

}
