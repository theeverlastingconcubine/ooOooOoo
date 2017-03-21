
public class Test {
	
	public static void main(String[] args){
		
		String text1 = "I've been the witness, and the"
				+ "seal of death lingers in the molten wax that is my head";
		InContext searcher = new InContext(text1);
		String[] suffix = searcher.suffixArray();
		
		int i = 0;
		for (String s: suffix) {
			System.out.println(i + " " + s);
			i++;
		}
		
		System.out.println(searcher.binSearch(suffix, "is my head"));
		
		
	}

}
