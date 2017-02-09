import java.util.Arrays;

public class Test {
	
	public static void main(String[] args){
		
		
		String[] a = {"moscow","volgograd","vladivostok","anadyr","irkutsk","spb","murmansk","tver","smolensk","krasnodar","arhangelsk","mahachkala","ogurets"};
		System.out.println(Arrays.toString(a));
		StringSort.sort(a);
		System.out.println(Arrays.toString(a));
	}
	
	

}
