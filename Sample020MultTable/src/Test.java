
public class Test {
	
	
	public static void main(String[] args){
		
		int[][] multable = new int[10][10];
		
		for(int i = 0; i<10; i++){
			for (int j = i; j<10; j++){
				multable[i][j] = i*j;
			}
		}
		for(int i=1; i<10; i++){
			for(int j=0; j<i; j++){
				multable[i][j] = multable[j][i];
			}
		}
		
		for(int i=1; i<10; i++){
			for (int j=1; j<10; j++){
				System.out.print(multable[i][j] + "  ");
				}
			System.out.print("\n");
		}
		
		
		
	}

}
