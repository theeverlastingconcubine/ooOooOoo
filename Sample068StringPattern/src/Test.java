import java.util.HashMap;

public class Test {
	
	public static void main(String[] args){
		System.out.println(wordPattern("abba","cat dog cat dog"));
		
		
	}
	
	public static boolean wordPattern(String pattern, String str){
		String[] words = str.split(" ");
		if(words.length!= pattern.length()) return false;
		
		HashMap<String, Character> map = new HashMap<String, Character>();
		
		for(int i = 0; i<words.length; i++){
			map.put(words[i], pattern.charAt(i));
			}
		
		for(int i = 0; i<words.length; i++){
			if(map.get(words[i])!=pattern.charAt(i)) return false;
		}
		
		return true;
		
		
		
		
		
	}

}



