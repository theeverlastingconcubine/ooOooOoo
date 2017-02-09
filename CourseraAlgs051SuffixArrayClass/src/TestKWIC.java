
public class TestKWIC {
	
	public static void main(String[] args){
		
		String s = "hello darkness my old friend i want to talk to you again";
		String ss = "hellodarknessmyoldfriendiwanttotalktoyouagain";
		String sss = "it was the best of times it was the";
		
		SuffixArray sa = new SuffixArray(sss);
		
		String test = "s";
		
		System.out.println(sa.rank(test));
		System.out.println(sa.index(sa.rank(test)));
		
		
		for(int i = sa.rank(test); i<sss.length() && sa.select(i).startsWith(test); i++){
			
			System.out.println(sa.select(i));
				
			
		}
		
		
	}

}
