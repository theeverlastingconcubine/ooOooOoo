
public class UF {
	
	int[] UF;
	
	public UF(int N){
		UF = new int[N];
		for (int i = 0; i<N; i++){
			UF[i] = i;
		}
	}
	
	public void add(int p, int q){
		int proot = root(p);
		int qroot = root(q);
		UF[qroot] = proot;	
		
	}
	
	private int root (int v){
		
		while(v!=UF[v])
			v = UF[v];
		return v;
		}
	
	public boolean isConnected(int p, int q){
		return root(p)==root(q);
	}
	
	

}
