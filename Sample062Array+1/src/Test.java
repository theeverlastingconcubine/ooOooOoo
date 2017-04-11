import java.util.Arrays;
import java.util.Random;

public class Test {

	public static void main(String[] args) {

		
		  Random rnd=new Random(); 
		  int[] a = new int[rnd.nextInt(10)]; 
		  for(int  i=0; i<a.length; i++){ 
			  a[i] = rnd.nextInt(10); 
			  }
		 

		int[] b = { 1,9,9,8 };

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(plusOne(a)));
		System.out.println(Arrays.toString(pOne(a)));
		
		
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(plusOne(b)));
		System.out.println(Arrays.toString(pOne(b)));


	}
	
	public static int[] pOne(int[] a){
		
		int n = a.length-1;
		int[] result = a;
	//	result[n]++;
				
		for(int i = n; i>0 && a[i]==10; i--){
			
			result[i]=0;
			result[i-1] = result[i]+1;
			
		}
		
		if(result[0]==9){
			result = new int[a.length+1]; 
			result[0]=1;
			return result;
		}
		
		return result;
		
		
		
		
		
		
		
	}

	public static int[] plusOne(int[] a) {

		int[] result = null;
		result = a;

		if (a[a.length - 1] != 9) {
			result[a.length - 1]++;
			return result;
		}

		for (int i = a.length - 1; i > 0; i--) {
			if (a[i] == 9) {
				result[i] = 0;
				if (a[i - 1] != 9)
					result[i - 1]++;
			}
		}
		if (result[0] == 9) {
			result = new int[a.length + 1];
			result[0] = 1;
			return result;
		}

		return result;

	}

}
