import java.util.Arrays;

public class Test {

	public static String sort(String s) {

		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);

	}

	public static boolean permutation1(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}
		return sort(s).equals(sort(t));
	}

	public static boolean permutation(String s, String t){
		
		if (s.length() != t.length() ) return false;
		
		int[] letters = new int[128];
		
		char[] s_array = s.toCharArray();
		
		for(char c:s_array) letters[c]++;
		
		for (int i=0; i<t.length(); i++) {
			int c = (int) t.charAt(i);
			letters[c]--;
			if(letters[c]<0) {return false;}
		}
		
		return true;
		
	}
	
	
	public static void main(String[] args){
		
		boolean test1 = permutation1("cr ap","crarp ");
		boolean test2 = permutation("aaa","aa");
		System.out.println(test1 + "  " + test2);
		
	}

	
	
	
}
