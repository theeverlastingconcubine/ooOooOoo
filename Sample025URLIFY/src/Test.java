
public class Test {
	
	
	
	
	public static void main(String[] args){
		
		System.out.println(urlify(" hello darkness my old friend "));
		
		
		
	}
	
	public static String urlify(String s){
		
	/*	char[] sc = s.toCharArray();
		int spaces=0;
		
		for(int i = 0; i<sc.length; i++){
			if(sc[i] == ' ') spaces++;
		}
		char[] scc = new char[sc.length + 3*spaces];*/
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<s.length(); i++){
			if(s.charAt(i)==' ') sb.append("%20");
			else sb.append(s.charAt(i));
			
		}
		
		return sb.toString();
				
	}
	
	
}
