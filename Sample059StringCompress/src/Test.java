
public class Test {
	
	public static void main(String[] args){
	
		String s1 = "smmmspppwfllllkkjjddduuuuuuuuuuuuuuuuuuufjjhhfbbbfjjsssffkkem";
		String s2 = "auroraborealis";
		
		System.out.println(compress(s1));
		System.out.println(compress(s2));
		
		
		System.out.println(String.valueOf(23455).length());
		
	}
	
	
	public static String compress(String s){
		
		String compressed = "";
		
		int counter = 0;
		
		for(int i=0; i<s.length(); i++){
			counter++;
			if(i+1>=s.length() || s.charAt(i)!=s.charAt(i+1)) {
				
				compressed = compressed + s.charAt(i) + counter;
				counter=0;
			}
		}
	//	System.out.println(compressed);
		if (compressed.length()<s.length()) return compressed;
		return s;
		
	}
	
	
	

}
