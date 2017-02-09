import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		String s = "hihowareyou";
		String ss = "hihowarethey";
		String sss = "koozya";
		String ssss = "hihowareyou";
		String[] a = {"lenin","stalin","khruschev","brezhnev","andropov","chernenko","gorbachev","eltsyn","putin","nikolai","alexander","pavel","petr","ivan","mihail"};
		
		System.out.println(Arrays.toString(suffixArray(s)));
		
		System.out.println(longestPrefix(s, ss));
		System.out.println(longestPrefix(s, sss));
		System.out.println(longestPrefix(s, ssss));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(a[8]);
		System.out.println(a[8].compareTo("lenin"));
		
		System.out.println(binSearch(a,"stalinn"));
		

	}

	private static String[] suffixArray(String s) {
		String[] suff = new String[s.length()];
		for (int i = s.length() - 1; i >= 0; i--) {
		suff[suff.length - 1 - i] = s.substring(i);
		}
		return suff;
	}
	
	private static String longestPrefix(String a, String b){
		
		if(a.charAt(0)!=b.charAt(0)) return "NO PREFIX";
		else for(int i = 0; i<Math.min(a.length(), b.length()); i++){
			if(a.charAt(i)!=b.charAt(i)) return a.substring(0,i);
			}
		return a;		
	}
	
	private static int binSearch(String[] a, String w){
		return binSearch(a,w,0,a.length-1);
	}
	
	
	private static int binSearch(String[] a, String w, int lo, int hi){
			
		
		int k = lo + (hi-lo)/2;
		
		System.out.println(lo + " " + hi + "  " + k);
		
		if(a[k].compareTo(w)==0) return k;
		else if(a[k].compareTo(w)<0) return binSearch(a,w,k+1,hi);
		else return binSearch(a,w,lo,k-1);
		
		
			
	}

}
