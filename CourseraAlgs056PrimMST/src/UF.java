
public class UF {
	
	int[] id;
	int[] size;
	
	public UF(int n){
		
		size = new int[n];
		id = new int[n];
		for(int i = 0; i<n; i++){
			id[i] = i;
			size[i] = 1;
		}
		
		
	}
	
	
	private int root(int k){
		
		while(id[k] !=k){
		id[k] = id[id[k]];
		k = id[k];
	}
	
	return k;
	}
	
	public boolean isConnected(int p, int q){
		return root(p)==root(q);
	}
	
	public void add(int p, int q){
		
		int proot = root(p);
		int qroot = root(q);
		
		if(size[proot]<=size[qroot]) {id[proot] = qroot; size[qroot] = size[proot] + size[qroot];}
		else {id[qroot] = proot; size[qroot] = size[qroot] + size[proot];}
	}
	
	
	
	
	

}
