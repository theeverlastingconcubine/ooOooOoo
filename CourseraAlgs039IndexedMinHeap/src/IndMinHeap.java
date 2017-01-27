import java.util.Iterator;

public class IndMinHeap<Key extends Comparable<Key>> implements Iterable<Integer> {

	private Key[] keys;
	private int[] pq;
	private int[] qp;
	private int n;

	public IndMinHeap() {

		n = 0;
		keys = (Key[]) new Comparable[10];
		pq = new int[10];
		qp = new int[10]; // we have 0s here by default

	}

	public IndMinHeap(int capacity) {

		n = 0;
		keys = (Key[]) new Comparable[capacity];
		pq = new int[capacity];
		qp = new int[capacity]; // we have 0s here by default

	}

	public boolean isEmpty() {
		return n == 0;
	}

	public void insert(int i, Key key) {

		int GOO = Math.max(i, n);
		if (pq.length - 1 <= GOO)
			resize(2 * GOO);

		n++;
		pq[n] = i;
		keys[i] = key;
		qp[i] = n;
		swim(n);

	}

	public int delMin() {

		int min = pq[1];
		swap(1, n);
		n--;
		sink(1);
		qp[min] = -100;
		keys[min] = null;
		
		int max = 0;
		for(int i: pq) if(i>max) max=i;
		int GOO = Math.max(n, max);
		if(GOO<=pq.length/4) resize(GOO/2);
				
		
		return min;
	}

	public int minIndex() {
		return pq[1];
	}

	public void changeKey(int i, Key key) {
		keys[i] = key;
		swim(qp[i]);
		sink(qp[i]);
	}

	public void decreaseKey(int i, Key key) {

		keys[i] = key;
		swim(qp[i]);

	}

	private void sink(int k) {

		while (2 * k < n) {
			int j = 2 * k;
			if (j < n && less(j + 1, j))
				j++;
			if (!less(j, k))
				break;
			swap(k, j);
			k = j;
		}

	}

	private void swim(int k) {
		while (less(k, k / 2) && k > 1) {
			swap(k, k / 2);
			k = k / 2;

		}

	}

	private void swap(int i, int j) {
		int temp = pq[i];
		pq[i] = pq[j];
		pq[j] = temp;

		qp[pq[i]] = i;
		qp[pq[j]] = j;

	}

	private boolean less(int i, int j) {
		return keys[pq[i]].compareTo(keys[pq[j]]) < 0;
	}

	private void resize(int c) {
		Key[] keys1 = (Key[]) new Comparable[c];
		int[] pq1 = new int[c];
		int[] qp1 = new int[c];
		
		int max = 0;
		for(int i: pq) if(i>max) max=i;
		int GOO = Math.max(n, max);
		
		for (int i = 0; i <= GOO; i++) {
			keys1[i] = keys[i];
			pq1[i] = pq[i];
			qp1[i] = qp[i];
		}
		keys = keys1;
		pq = pq1;
		qp = qp1;

	}


	//// iterator shit///
	//just copy the heap and delete from that copy one at a time//
	
	public Iterator<Integer> iterator() {
		return new HeapIterator();
	}

	private class HeapIterator implements Iterator<Integer> {

		private IndMinHeap<Key> copy;

		public HeapIterator() {
			copy = new IndMinHeap<Key>(pq.length + 1);
			for (int i = 1; i <= n; i++) {
				copy.insert(pq[i], keys[pq[i]]);
			}
		}

		public boolean hasNext() {
			return copy.isEmpty();
		}

		public Integer next() {
			return copy.delMin();
		}

	}

}
