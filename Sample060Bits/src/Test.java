
public class Test {
	
	public static void main(String[] args){
		
		
		
	//	System.out.println(numBits(0x000F));
	//	System.out.println(numBits(0x2222));
		System.out.println(0x2222 + "  " + Integer.toBinaryString(0x2222));
		System.out.println(0x000F + "  " + Integer.toBinaryString(0x000F));
		//System.out.println(0x222 & 0x00F);
		System.out.println();
		
		
		System.out.println(Integer.toBinaryString(15));
		
		System.out.println(Integer.toBinaryString(15^1));
		System.out.println(Integer.toBinaryString(15>>>1));
		
		System.out.println("+++++++");
		
		System.out.println(Integer.toBinaryString(-15));
		System.out.println(Integer.toBinaryString(-15>>4));
		System.out.println(Integer.toBinaryString(-15>>>1));
		
		System.out.println(Double.SIZE);
		System.out.println(Boolean.TRUE);
		System.out.println(Integer.parseInt("42"));
		
		System.out.println(666&1);
		System.out.println(665&1);
		
		
		
		
		
	}
	
	public static int numBits(int n){
		
		int num = 0;
		
		while(n!=0){
			if((n&1) >0) num++;
			n = n>>>1;
			
		}
		
		return num;
		
	}
	
	public static String toBinary(int n){
		
		StringBuilder sb = new StringBuilder();
		
		while(n!=0){
			sb.append(n % 2);
			n = (n - n%2)/2;
		}
		
		return inverse(sb.toString());
					
		
	}
	
	private static String inverse(String s){
		
		for(int i = 0; i<s.length()/2; i++){
			swap(s, i, s.length()-1-i);
		}
		
		return s;
		
	}
	
	private static void swap(String s, int i, int j){
		char[] str = s.toCharArray();
		char tmp = s.charAt(i);
		str[i] = s.charAt(j);
		str[j] = tmp;
		s = new String(str);
		
		
	}

}
