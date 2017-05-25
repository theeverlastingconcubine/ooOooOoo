
public class BSRotatedArray {
	
	public static void main(String[] args){
	
		int[] a = {12,16,17,19,5,8,10,11,11,11,11,11,11,11,11,11};
		
		System.out.println(search(a, 10)+1);
		
	}

private static int search(int[] a, int target, int lo, int hi){
	if(hi<lo) return -1;
	int mid = lo + (hi-lo)/2;
	if(a[mid]==target) return mid;
	//right side is sorted
	if(a[mid]<a[hi]){
		if(target >a [mid] && target<=a[hi]) return search(a,target,mid+1,hi);
		else return search(a,target,lo,mid-1);
	}
	else if (a[mid]>a[hi]){
		if(target<a[mid] && target >=a[lo]) return search(a,target,lo,mid-1);
		else return search (a,target,mid+1,hi);
	}
	else if(a[mid]==a[hi]){
		if(a[mid]!=a[lo]) return search(a,target, lo,mid-1);
		else {
			int result = search(a,target, lo,mid-1);
			if (result==-1) return search(a,target,mid+1,hi);
			else return result;
		}
		
	}
	
	
	
	
	
	
	return -1;
	
	
}

private static int search(int[] a, int target){
	return search(a,target, 0, a.length-1);
}

	
	
	

}
