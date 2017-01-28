
public class MinHeap<Key extends Comparable<Key>> {

	private Key[] id;
	int N;

	public MinHeap() {
		id = (Key[]) new Comparable[5];
		N = 0;
	}

	public void insert(Key key) {

		if (N == id.length-1)
			resize(2 * N);
		id[N + 1] = key;
		swim(N+1);
		N++;

	}

	public Key takeMin() {

		Key min = id[1];
		swap(1, N);
		N--;
		sink(1);
		id[N + 1] = null;
		
		if (N < (id.length) / 2)
			resize((N+3) / 2);
		return min;
	}

	private void sink(int k) {

		while (2 * k <= N) {
			int j = 2 * k;
			if (j < N && less(j + 1, j))
				j++;
			if (!less(j, k))
				break;
			swap(j, k);
			k = j;
		}

	}

	private void swim(int k) {

		while (k > 1 && less(k, k / 2)) {
			swap(k, k / 2);
			k = k / 2;
		}
	}

	private void resize(int k) {

		Key[] temp = (Key[]) new Comparable[k];
		for (int i = 0; i < id.length; i++)
			temp[i] = id[i];
		id = temp;

	}

	private boolean less(int i, int j) {

		return id[i].compareTo(id[j]) < 0;
	}

	private void swap(int i, int j) {

		Key tmp = id[i];
		id[i] = id[j];
		id[j] = tmp;

	}

}
