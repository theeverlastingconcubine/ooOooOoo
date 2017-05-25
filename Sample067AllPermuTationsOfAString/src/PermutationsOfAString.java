import java.util.ArrayList;

public class PermutationsOfAString {
	
	public static void main(String[] args){
		
	/*	String s = "moose";
		for(int i = 0; i<s.length()+1; i++){
			System.out.println(placeCharAt('A',s,i));
		}*/
		
		System.out.println(permutations("abc"));
		
		
		
		
		
	}
	
	public static ArrayList<String> permutations(String s){
		ArrayList<String> permutations = new ArrayList<String>();
		permutations(permutations, s);
		return permutations;
	}
	
	public static ArrayList<String> permutations(ArrayList<String> permutations, String s){
		
		if(s==null) return null;
		if(s.length()==0) {permutations.add(""); return permutations;}
		
		String little = s.substring(1);
		char c = s.charAt(0);
		ArrayList<String> words = permutations(permutations, little);
		for(String word: words){
			for(int i = 0; i<word.length()+1; i++){
				String add = placeCharAt(c,little,i);
				permutations.add(add);
			}
		}
		
		return permutations;
		
		
		
	}
	
	public static String placeCharAt(char c, String s, int i){
		String first = s.substring(0,i);
		String last = s.substring(i, s.length());
		return first + c + last;
	}

}
