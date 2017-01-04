import java.util.Arrays;
import java.util.HashMap;

public class Test {
	
	public static void main(String[] args){
		
		int[] a = {1,6,3,5,7,9,5,3,5,7,9,6,4,6};
		
		System.out.println(Arrays.toString(twoSum(a, 6)));
		
		
	}
	
	
	
	private static int[] twoSum(int[] a, int desire){
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int[] output = new int[2];
		
		for(int i=0; i<a.length; i++){
			
			if(map.containsKey(a[i])){
				
				int index = map.get(a[i]);
				output[0] = index+1;
				output[1] = i+1;
				break;	
				}
			else{
				
				map.put(desire - a[i],i);
						
			}
			
		}
		
		
		
		
		return output;
	}

}
