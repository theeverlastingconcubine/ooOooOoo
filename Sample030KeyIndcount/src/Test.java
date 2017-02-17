import java.util.Arrays;

public class Test {
	
	public static void main(String[] args){
		
		int[] a = {1,3,4,6,8,0,0,4,2,4,6,3,5,6,7,2,1};
		
		System.out.println(Arrays.toString(a));
		KIndCount.sort(a, 12);
		System.out.println(Arrays.toString(a));
		
		String[] list = {"mood","dron","cope","face","trac","uwad","dwar","acro","baop","mzyk","zver","hoop"};
		
		System.out.println(Arrays.toString(list));
		KIndCount.sortLSD(list, 256);
		System.out.println(Arrays.toString(list));
		
		System.out.println(1<<4);
		
	}

}
