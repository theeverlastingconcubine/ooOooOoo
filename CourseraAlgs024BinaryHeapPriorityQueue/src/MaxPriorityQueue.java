import java.util.Arrays;

public class MaxPriorityQueue<Key extends Comparable<Key>>{

	private Key[] pq;
	private int N;

	public MaxPriorityQueue(int capacity) {

		pq = (Key[]) new Comparable[capacity + 1];

	}
	
	public String toString(){
		return Arrays.toString(pq);
	}
	
	

	public boolean isEmpty() {
		return N == 0;
	}

	public Key delMax(){
		
		Key max = pq[1];
		exchange(1,N);
		N--;
		sink(1);
		pq[N+1] = null;
		return max;
		
	}

	public void insert(Key key){
		pq[N+1] = key;
		N++;
		swim(N);
			
	}
	
	public void swim(int k) {

		while (k > 1 && less(k / 2, k)) {
			exchange(k, k / 2);
			k = k / 2;
		}
	}

	public void sink(int k) {
		while (2 * k <= N) {
			int j = 2 * k;
			if (j < N && less(j, j + 1)) {
				j++;
			}
			if (!less(k, j))
				break;
			exchange(k, j);
			k = j;

		}

	}

	public boolean less(int i, int j) {

		return pq[i].compareTo(pq[j]) < 0;
	}

	private void exchange(int i, int j) {
		Key temp = pq[i];
		pq[i] = pq[j];
		pq[j] = temp;
	}
	
	

}
