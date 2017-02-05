import java.util.Arrays;

public class RotateArray2D {

	private static void swap(Object[][] a, int i, int j, int p, int q) {
		Object tmp = a[i][j];
		a[i][j] = a[p][q];
		a[p][q] = tmp;

	}
	
	

	private static void rotate(Object[][] a) {
		
		int layer = 0; 
		int n = a.length;
		
							
				while(layer<n/2){
								
				for(int i = layer; i< n - layer - 1; i++){ //for some reason we need this -1 WHYYYY
												
				Object tmp = a[layer][i];
			
				a[layer][i] = a[n-i-1-layer][layer];
				
				a[n-i-1-layer][layer] = a[n-1-layer][n-1-layer-i];
				
				a[n-1-layer][n-1-layer-i] = a[i][n-1-layer];
				
				a[i][n-1-layer] = tmp;
				
					
				
							
			}
				layer++;
		}
					
}
		

	

	public static void main(String[] args) {

		Integer[][] a = new Integer[10][10];

		int k = 1;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				a[i][j] = k % 10;
				k++;
			}
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(a[i][j] + " ");
			}

			System.out.println();
		}
		System.out.println("----------");
		
		rotate(a);		

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(a[i][j] + " ");
			}

			System.out.println();
			}
		
		
		

	}

}
