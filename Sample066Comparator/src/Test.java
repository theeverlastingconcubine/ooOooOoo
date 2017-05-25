import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Test {
	
	public static void main(String[] args){
		
		String[] array  = {"sun", "son", "nus", "sus", "murz", "zrum", "nos", "sus"};
		System.out.println(Arrays.toString(array));
		sortAnagrams(array);
		System.out.println(Arrays.toString(array));
		
		
		
		
	}
	
	private static void sortAnagrams(String[] a){
		Arrays.sort(a, new myComparator());
	}
	

 public static class myComparator implements Comparator<String>{
	
	public String sortedVersion(String s){
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	
	public int compare(String s1, String s2){
		return sortedVersion(s1).compareTo(sortedVersion(s2));
	}
	
	
	
}

}
