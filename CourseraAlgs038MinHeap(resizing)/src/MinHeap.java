
public class MinHeap<Key extends Comparable<Key>> {

	private Key[] id;
	int N;

	public MinHeap() {
		id = (Key[]) new Comparable[5];
		N = 0;
	}

	public void changeKey(Key oldkey, Key newkey) {
		int i = 0;
		for (i = 0; i < N; i++) {
			if (id[i].equals(oldkey)) break;
		}
		id[i] = newkey;
		if (less(i, i / 2))
			swim(i);
		else
			sink(i);

	}

	public void insert(Key key) {

<<<<<<< HEAD
		if (N == id.length-1)
			resize(2 * N);
=======
		if (N == id.length - 1)
			resize(2 * id.length);
>>>>>>> branch 'master' of https://github.com/theeverlastingconcubine/ooOooOoo
		id[N + 1] = key;
		swim(N + 1);
		N++;

	}

	public Key takeMin() {

		Key min = id[1];
		swap(1, N);
		N--;
		sink(1);
		id[N + 1] = null;
<<<<<<< HEAD
		
		if (N < (id.length) / 2)
			resize((N+3) / 2);
=======

		if (N < (id.length - 1) / 4)
			resize(id.length / 2);
>>>>>>> branch 'master' of https://github.com/theeverlastingconcubine/ooOooOoo
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
<<<<<<< HEAD
		for (int i = 0; i < id.length; i++)
=======
		for (int i = 0; i <= N; i++)
>>>>>>> branch 'master' of https://github.com/theeverlastingconcubine/ooOooOoo
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
	
	public boolean isEmpty(){
		return N==0;
	}

}
