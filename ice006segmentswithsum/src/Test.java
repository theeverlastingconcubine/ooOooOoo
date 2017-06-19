import java.util.HashMap;

public class Test {
	
	public static void main(String[] args){
		
		int[] a = {10,5,1,2,-1,-1,7,1,2};
		
		System.out.println(segmentsWithSum(a,16));
		
	
		
		
		
		
	}
	
	public static int segmentsWithSum(int[] a, int targetSum){
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int runningSum=0; 
		int count = 0;
		
		for(int i=0; i<a.length; i++){
			
			runningSum = runningSum+a[i];
			
			if (map.containsKey(runningSum)){
				int freq = map.get(runningSum);
				map.put(runningSum, freq+1);
			}
			else map.put(runningSum, 1);
			
			if (map.containsKey(runningSum-targetSum)) count += map.get(runningSum-targetSum);
			if (runningSum-targetSum==0) count++;
			System.out.println(runningSum + "  " + targetSum);
			
		}
		
		return count;
		
	}

}
