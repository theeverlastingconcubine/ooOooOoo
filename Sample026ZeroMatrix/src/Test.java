import java.util.Arrays;

public class Test {
	
	public static void main(String[] args){
		
		int[][] a = {{1,2,3,4,5}, {5,0,7,1,2}, {0,5,1,5,5}, {1,5,4,3,0}, {7,4,5,6,1}};
		
		for(int i = 0; i<a.length; i++){
			System.out.println(Arrays.toString(a[i]));
		}
		
		zeros(a);
		System.out.println();
		
		for(int i = 0; i<a.length; i++){
			System.out.println(Arrays.toString(a[i]));
		}
					
	}
	
	
	private static void zeros(int[][] a){
		
		int m = a.length;
		int n = a[0].length;
		
		boolean[] col = new boolean[n];
		boolean[] row = new boolean[m];
		
		for(int i=0; i<m; i++){
			for(int j = 0; j<n; j++){
				if(a[i][j] == 0){row[i] = true; col[j] = true;}
				}
				}
		
		for(int i = 0; i<m; i++){
			if(row[i]) zeroRow(a, i);
		}
			
		for(int j = 0; j<n; j++){
		if(col[j]) zeroColumn(a, j);
	}
	}
	
		
	
	
	
	
	
	
	private static void zeroRow(int[][] a, int i){
		int m = a.length;
		int n = a[0].length;
		
		for(int j = 0; j<n; j++){
			a[i][j] = 0;
		}
			
		}

	private static void zeroColumn(int[][] a, int j){
		int m = a.length;
		int n = a[0].length;
		
		for(int i = 0; i<m; i++){
			a[i][j] = 0;
		}
	}
	

}
