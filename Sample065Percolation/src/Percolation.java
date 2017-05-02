import java.util.Arrays;

public class Percolation {
	
	private WQUF qf;
	private int n;
	private int[][] grid;
	
	
	public Percolation(int[][] cells){
		
		this.n = cells.length;
		qf = new WQUF(n*n+2);
		grid = new int[n][n];
		
				
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				if(cells[i][j]==1) open(i,j);
			}
		}
		
			
	}
	
	private boolean isOpen(int i, int j){
		return grid[i][j]==1;
	}
	
	private int index(int i, int j){
		return i*n+j;
	}
	
	private void open(int i, int j){
		
		int ij = index(i,j);
		
		this.grid[i][j]=1;
		
		
		if(i==0) {qf.add(ij, n*n);}
		else if (i==n-1) {qf.add(ij,n*n+1);}
		
		if(i>0 && isOpen(i-1,j)) { qf.add(ij, index(i-1,j)); }
		if(i<n-1 && isOpen(i+1,j)) {qf.add(ij, index(i+1,j));}
		if(j>0 && isOpen(i,j-1)) {qf.add(ij, index(i,j-1));}
		if(j<n-1 && isOpen(i,j+1)) {qf.add(ij, index(i,j+1));}
		
		
		
		/*else if (j==0) {if(isOpen(i-1,j)) qf.add(ij, index(i-1,j));}
		else {
			
			if(isOpen(i,j-1)) {qf.add(ij, index(i,j-1));}
			if(isOpen(i-1,j)) {qf.add(ij, index(i-1,j));}
			
		
		}*/
		
		
		
	}
	
	public boolean percolates(){
		return qf.isConnected(n*n, n*n+1);
	}
	
	

}
