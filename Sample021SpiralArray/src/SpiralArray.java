import java.util.Scanner;

public class SpiralArray {
	
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		String[][] a = new String[n][n];
		
		int vert1= 0;
		int vert2 = n-1;
		int hor1 = 0;
		int hor2 = n-1;
				
		int k=1;
				
		while(k<=n*n){
			
			for(int i = vert1; i<=vert2; i++){
				a[i][hor1] = "|";
				k++;
			}
			
			for(int i = hor1+1; i<=hor2; i++){
				a[vert2][i] = "—";
				k++;
			}
			
			for(int i = vert2-1; i>=vert1; i--){
				a[i][hor2] = "|";
				k++;
			}
			
			for(int i=hor2-1; i>hor1; i--){
				a[vert1][i] = "—";
				k++;
			}
			
			vert1++;
			vert2--;
			hor1++;
			hor2--;	
			
		}
		
		
		for(int i = 0; i<n; i++){
			for (int j = 0; j<n; j++){
				System.out.print(a[i][j] + " ");
			}
			
			System.out.print("\n");
			
		}
		
		
		
	}
}
