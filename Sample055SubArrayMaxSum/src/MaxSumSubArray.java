
public class MaxSumSubArray {
	
	public static void main(String[] args){
		
		int[] a = {1,-5,4,-5,3,7,-1,6,0};
		
		int lo=0;
		int hi=0;
		int globalMax = a[0];
		int currentMax = a[0];
		
		for(int i = 1; i<a.length; i++){
			
			currentMax = Math.max(a[i], currentMax + a[i]);
			if(currentMax == a[i]) lo=i;
			if(globalMax<currentMax) {
				globalMax = currentMax;
				hi = i;
			}
			
		}
		
		
		
		System.out.println(globalMax);
		System.out.println(lo + "  " +hi);
		
		
		
	}

}
