import java.util.HashSet;

public class Test {
	
	public static void main(String[] args){
		
		String s1 = "voldemort";
		String s2 = "gandolf";
		System.out.println(isUnique(s1));
		System.out.println(isUnique(s2));
		
		System.out.println(isUniqueNoHashMap(s1));
		System.out.println(isUniqueNoHashMap(s2));
		
		System.out.println(isUniqueBoolArray(s1));
		System.out.println(isUniqueBoolArray(s2));
		
	}
	
	public static boolean isUniqueBoolArray(String s){
		
		boolean[] bool = new boolean[128];
		for(int i=0; i<s.length(); i++){
			if(bool[s.charAt(i)]) return false;
			else bool[s.charAt(i)] = true;
		}
		return true;
		
	}
	
	
	public static boolean isUnique(String s){
		HashSet<Character> set = new HashSet<Character>();
		
		
		
		for(int i=0; i<s.length(); i++){
			if(set.contains(s.charAt(i))) return false;
			else set.add(s.charAt(i));
		}
		
		return true;
				
	}
	
	public static boolean isUniqueNoHashMap(String s){
		
		for(int i=0; i<s.length(); i++){
			for(int j=0; j != i && j<s.length(); j++){
				if(s.charAt(i)==s.charAt(j)) return false;
			}
		}
		return true;
		
	}

}
