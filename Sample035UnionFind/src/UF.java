import java.util.Arrays;

public class UF {
	
	int[] id;
	int[] size;
	
	public UF(int n){
		id = new int[n];
		size = new int[n];
		for(int i = 0; i<n; i++){
			id[i] = i;
			size[i] = 1;
		}
	}
	
	public void union(int p, int q){
		
		int a = root(p);
		int b = root(q);
		if (a==b) return;
		if (size[a]<size[b]) {id[a] = b; size[b] = size[a] + size[b];}
		else {id[b] = a; size[a] = size[a] + size[b];}
		System.out.println(Arrays.toString(size));
		
		
	}
	
	private int root(int p){
		
		while(id[p]!=p){
			p = id[p];
		}
		
		return p;
	}
	
	public boolean isConnected(int p, int q){
		return root(p)==root(q);
	}
	
	

}
