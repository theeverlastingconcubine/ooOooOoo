import java.util.Random;

public class Test {
	
	public static void main(String[] args){	
		
		String[] words = {"ijhyr","azxcr","edtyi","qasdf",
						"dcfip","asxdc","ujiop","cdvfb",
						"edrft","qqqqq","zxcvb","qwedc",
						"asdfg","uytre","yhbvf","wsdcv",
						"yhgfv","qwsed","ertgv",
						"bhvgc","lmjnh","werfd",
						"rfgbs","bngdw","bhgre"};
		
		//check if all the words have same length
		
		Random rnd = new Random();
		
		int k = rnd.nextInt(words.length);
		
		for(String w: words) {
		if(words[k].length() != w.length()) System.out.println(w);
		}
		
		LSD.sord(words);
		
		for(String w: words) {
			System.out.println(w);
		}
		
		
		
		
		
		
	}

}
