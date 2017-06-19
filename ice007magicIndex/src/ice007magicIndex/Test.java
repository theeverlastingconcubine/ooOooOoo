package ice007magicIndex;

import java.util.ArrayList;

public class Test {
	
	
	public static void main(String[] args){
		
	//	int[] a = {-1,-2,-3,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,21};
		int[] a = {-10,-5,2,2,2,3,4,7,9,12,13};
		
		for(int i = 0; i<a.length; i++){
			if(a[i]==i) System.out.println(i);
		}
		System.out.println();
		
	/*	System.out.println(magicIndex(a));
		System.out.println(magicSearch(a));*/
		
		for (int r: magicSearch(a)) System.out.print(r + "  ");
	}
	
	
	public static int magicIndex(int[] a){
		
		return magicIndex(a, 0, a.length-1);
		
	}
	
	
	private static int magicIndex(int[] a, int lo, int hi){
		
		if(hi<lo) return Integer.MIN_VALUE;
		
		int mid = lo + (hi-lo)/2;
	
		if (a[mid]==mid) return mid;
		else if(a[mid]>mid) return magicIndex(a, lo, mid-1);
		else return magicIndex(a, mid+1, hi);
					
	}
	
	public static ArrayList<Integer> magicSearch(int[] a){
		ArrayList<Integer> result = new ArrayList<Integer>();
		magicSearch(a, 0, a.length-1, result);
		return result;
	}
	
	
	
	private static void magicSearch(int[] a, int lo, int hi, ArrayList<Integer> result){
		
		if(hi<lo) return;
		
		int mid = lo + (hi-lo)/2;
		int midVal = a[mid];
		
		if(mid==midVal) {result.add(mid); return;}
		
		int leftIndex = Math.min(mid-1, midVal);
		magicSearch(a,lo,leftIndex, result);
				
		int rightIndex = Math.max(mid+1, midVal);
		magicSearch(a, rightIndex, hi, result);
		
		
		
	}

}
