// resizing shit is just for an exercise - it is SLOW. 

// if we know in advance the size of a heap no resizing needed
// every operation takes log time. 

// otherwise we pull out elements of pq(indexes) and keys
// somewhere from the middle (almost randomly, depends on keys)
// we resize whenever empty tail appears. it is expensive: 
// linear time to search for search 
// prevMaxIndex + linear time to resize + it happens quite often



public class IndexedMinHeap<Key extends Comparable<Key>> {

	private int maxIndex;						
	private int n; 			// #elements in the heap
	private Key[] keys; 	// priorities
	private int[] pq; 		// heap of objects(nodes) which has priorities, according to keys
	private int[] qp; 		// indexes of objects in the heap: pq[i] = m => qp[m] = i => qp[pq[i]] = qp[m] = i

	
	
	// by default we have only 10 places available (before resizing)

	public IndexedMinHeap() {
		keys = (Key[]) new Comparable[110];
		pq = new int[110];
		qp = new int[110];
		n = 0;
		maxIndex = 0;

	}

	public IndexedMinHeap(int cap) {

		keys = (Key[]) new Comparable[cap + 1];
		pq = new int[cap + 1];
		qp = new int[cap + 1];
		n = 0;
		maxIndex = 0;

	}
			
	
	public int getMin(){
		
		int min = pq[1];
		keys[min] = null;
		qp[min] = -1;
		swap(1,n);
		n--;
		sink(1);
		
		
	//	if(min == maxIndex) maxIndex = prevMaxIndex(); 
		
		// weak slow part is here
		// we does not need this if we know size of a heap in advance
		// also no problem to resize if heap is just a heap: 
		// only getMin() and add() are supported (NO changeKey)
		// since maintaining qp and keys arrays is slowing us down
		// in ordinary heap keys = pq and nothing else needed. 
		
		
		
	//	if(n < maxIndex) resize(maxIndex); 
	//	else if (n >= maxIndex && n == (pq.length-1)/4) resize((pq.length-1)/2);
		
		return min;
	}
	
	
	public void insert(int k, Key key){
		
		if (k > maxIndex) maxIndex = k;
	
		
		
	//	if (k > n) resize(k);
	//	else if ( k<=n && n==pq.length-1) resize(2*n);
		
		n++;	
		pq[n] = k;
		qp[k] = n;
		keys[k] = key;
		swim(n);
		
	}
	
	public int size() {return n;}
	
	public Key minKey() {return keys[pq[1]];} 
	
	public boolean isEmpty() {return n == 0;}
	
	
	
	
	private int prevMaxIndex(){
		
		int i = maxIndex-1; 
		while(keys[i] == null) i--;
		return i;
						
	}
	
	
	
	private void swim(int k) {
		
		while (k > 1 && less(k, k / 2)) {
			swap(k, k / 2);
			k = k / 2;
		}

	}

	private void sink(int k) {

		while (2 * k <= n) {
			int j = 2 * k;
			if (j < n && less(j + 1, j))
				j++;
			if (!less(j, k))
				break;
			swap(k, j);
			k = j;
		}

	}

	private void swap(int i, int j) {
		int tmp = pq[i];
		pq[i] = pq[j];
		pq[j] = tmp;

		qp[pq[i]] = i; // not forget to swap indexes as well
		qp[pq[j]] = j;
	}

	private boolean less(int i, int j) {
		return keys[pq[i]].compareTo(keys[pq[j]]) < 0;

	}

	private void resize(int k) {

		Key[] keys1 = (Key[]) new Comparable[k + 1];
		int[] pq1 = new int[k + 1];
		int[] qp1 = new int[k + 1];

		for (int i = 0; i <= n; i++) {
			keys1[i] = keys[i];
			pq1[i] = pq[i];
			qp1[i] = qp[i];
		}
		keys = keys1;
		pq = pq1;
		qp = qp1;

	}

}
