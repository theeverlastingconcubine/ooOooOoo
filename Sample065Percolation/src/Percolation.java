
public class Percolation {
	
	private WQUF qf;
	private int n;
	private boolean[][] grid;
	
	
	public Percolation(int n){
		this.n = n;
		qf = new WQUF(n*n+2);
			
	}
	
	private boolean isOpen(int i, int j){
		return grid[i][j]==true;
	}
	
	private int index(int i, int j){
		return i*n+j;
	}
	
	private void open(int i, int j){
		
		int ij = index(i,j);
		
		
		if(i==0) {qf.add(ij, n*n);}
		else if (i==n-1) {qf.add(ij,n*n+1);}
		else if (j==0) {if(isOpen(i-1,j)) qf.add(ij, index(i-1,j));}
		else {
			
			if(isOpen(i,j-1)) {qf.add(ij, index(i,j-1));}
			if(isOpen(i-1,j)) {qf.add(ij, index(i-1,j));}
			
		
		}
		
		grid[i][j]=true;
		
	}
	
	

}
