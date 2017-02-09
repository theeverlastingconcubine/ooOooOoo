import java.util.Arrays;

public class Test {
	
	
	
	
	public static void main(String[] args){
		
	String s = "hello darkness my old friend i want to talk to you again";
	String ss = "hellodarknessmyoldfriendiwanttotalktoyouagain";
	
	String[] suffix = Search.suffixArray(s);
	for(int i = 0; i<suffix.length; i++) System.out.println(suffix[i]);
	
	Search.sort(suffix);
	for(int i = 0; i<suffix.length; i++) System.out.println(suffix[i]);
	
	
	
	System.out.println(Search.lcp("babbaasdeervdf", "babba"));
	
	
	
	/*String[] suffixx = Search.suffixArray(ss);
	for(int i = 0; i<suffixx.length; i++) System.out.println(suffixx[i]);
	
	Search.sort(suffixx);
	for(int i = 0; i<suffixx.length; i++) System.out.println(suffixx[i]);*/
		
		
	}

}
