import java.util.Arrays;

public class Test {
	
	public static void main(String[] args){
		
		int[]a = {1,7,5};
		int[]b = {6,7,8,9};
		
		
		System.out.println(Arrays.toString(multiply(a,b)));
		System.out.println(175*6789);
	
	}
	
	
	public static int[] multiply(int[] a,int[] b){
		
		int[] result = new int[a.length+b.length];
		
		
		for(int i= a.length-1; i>=0; i--){
			for(int j = b.length-1; j>=0; j--){
				result[i+j+1] = result[i+j+1] + a[i]*b[j];
				result[i+j] = result[i+j] + result[i+j+1]/10;
				result[i+j+1] = result[i+j+1]%10;
				
			}
		}
		
		
		
		
		return result;
	}
	
	

}
