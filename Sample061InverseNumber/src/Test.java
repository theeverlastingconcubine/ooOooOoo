
public class Test {
	
	public static void main(String[] args){
		
		int a= 5;
		
		int result=0;
		
		while(a!=0) {
		
			int lastdigit = a % 10;
			result = result*10 + lastdigit;
			a = a/10;
				
			
		}
		
		System.out.println(result);
		
		System.out.println(isPalindrome(1234004321));
		System.out.println(isPalindrome(123404321));
		System.out.println(isPalindrome(1258412));
		
	}
	
	
	public static boolean isPalindrome(int x){
		
		int k = (int) Math.floor(Math.log10(x)) + 1;
		int first = (int) Math.pow(10, k-1);
	
		for(int i = 0; i<k/2; ++i){
			
			if(x % 10 != x/first) return false;
			x = x % first;
			x = x/10;
			first = first/100;			
			
		}
		
		return true;
	}
	
	

}
