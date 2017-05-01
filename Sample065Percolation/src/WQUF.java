
public class WQUF {

	private int[] id;
	private int[] size;

	public WQUF(int n) {

		id = new int[n];
		size = new int[n];

		for (int i = 0; i < n; i++) {
			id[i] = i;
			size[i] = 1;
		}

	}

	private int root(int q) {

		while (id[q] != q) {

			id[q] = id[id[q]];
			q = id[q];

		}

		return q;
	}

	public boolean isConnected(int q, int p) {
		return root(q) == root(p);

	}

	public void add(int p, int q) {

		int qroot = root(q);
		int proot = root(p);

		if (qroot == proot)
			return;

		if (size[proot] > size[qroot]) {

			id[qroot] = proot;
			size[proot] = size[proot] + size[qroot];
		} 
		
		else {
			id[proot] = qroot;
			size[qroot] = size[qroot] + size[proot];
		}

	}

}
