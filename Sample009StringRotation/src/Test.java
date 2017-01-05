
public class Test {
	
	
	public static boolean isSubstring(String s1, String s2){
		
		if(s1.length() < s2.length()) return false;
		else return s1.contains(s2);
				
		
	}
	
	
	public static boolean isRotation(String s1, String s2){
		
		int len = s1.length();
		if (len == s2.length() && len>0){
			String s1s1 = s1+s1;
			return isSubstring(s1s1,s2);
		}
		
		return false;
	}
	
	
	public static void main(String[] args){
		
		
		
		System.out.println(isRotation("smokeweed","weedsmoke"));
		System.out.println(isRotation("smokeweed","ewedsmoke"));
	}
	
	

}
