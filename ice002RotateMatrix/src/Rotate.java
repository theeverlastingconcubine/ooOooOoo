import java.util.Arrays;

public class Rotate {
	
	public static void main(String[] args){
		
		Integer n = 9;
		Integer[][] a = new Integer[n][n];
		
		for(int i = 0; i<a.length; i++){
			for (int j = 0; j < a[0].length; j++){
				a[i][j] = i+j + 10;
			}
		}
		
		for (int i = 0; i<a.length; i++) System.out.println(Arrays.toString(a[i]));
		
		rotate(a);
		System.out.println();
		
		for (int i = 0; i<a.length; i++) System.out.println(Arrays.toString(a[i]));
		
		
		int n1 = 9;
		Character[][] b = new Character[n1][n1];
		
		for(int i = 0; i<b.length; i++){
			for (int j = 0; j < a[0].length; j++){
				if(i%3==0) b[i][j] = '?';
				else b[i][j] = '!';
			}
		}
		
for (int i = 0; i<b.length; i++) System.out.println(Arrays.toString(b[i]));
		
		rotate(b);
		System.out.println();
		
		for (int i = 0; i<b.length; i++) System.out.println(Arrays.toString(b[i]));
		
			
	}
	
	public static void rotate(Object[][] a){
		
		for(int layer = 0; layer<a.length/2; layer++){
			rotateLayer(a,layer);
		}
		
				
	}
	
	private static void rotateLayer(Object[][] a, int layer){
		
		Object tmp;
		int n = a.length;
		
		for(int i = layer; i<n-layer-1; i++){
			
			tmp = a[layer][i];
			
			a[layer][i] = a[n-1-i][layer];
			a[n-1-i][layer] = a[n-1-layer][n-1-i];
			a[n-1-layer][n-1-i] = a[i][n-1-layer];
			a[i][n-1-layer] = tmp;
			
			
		}
		
	}
	
	
	

}
