
public class isUnique {
	
	public static void main(String[] args){
		
		System.out.println(isUnique("abrakadabra"));
		System.out.println(isUnique("tabure"));
		
		
		
	}
	
	
	public static boolean isUnique(String s){
		
		if(s.length()>128) return false;
		
		boolean[] check = new boolean[128];
		
		for(int i = 0; i<s.length(); i++){
			if(check[s.charAt(i)]==true) return false;
			else check[s.charAt(i)] = true;
		}
		
		return true;	
		
	}

}
