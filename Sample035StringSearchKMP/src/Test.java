
public class Test {
	
	public static void main(String[] args){
		
		
		String text = "what are the Chances ask the man in your heart For the AnSWers";
		String pattern = "e answ";
		
		KMP kmp = new KMP(pattern);
		System.out.println(kmp.search(text.toLowerCase()));
		
		
	}

}
