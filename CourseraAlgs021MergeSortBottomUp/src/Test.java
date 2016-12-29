import java.util.Arrays;

public class Test {
	
	public static void main(String[] args){
		
		Integer[] a = {111,666,333,555,888,333,-50,8909,23534567,33545,-1};
		
		System.out.println(Arrays.toString(a));
		System.out.println();
		
		MergeSortBottomUp.sort(a);
		System.out.println(Arrays.toString(a));
		
		
		
	}

}
