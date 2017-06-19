package ice010BooleanEvaluation;

public class Test {
	
	
	public static void main(String[] args){
		
		System.out.println(countWays("0&0&0&1^1|0", true));
		System.out.println(countWays("1^0|0|1", false));
		
	}
	
	
	public static int countWays(String s, boolean target){
		
		if(s.length()==0) return 0;
		if(s.length()==1) {
			if(stringToBool(s)==target) return 1;
			else return 0;
		}
		
		int ways = 0;
		
		for(int i = 1; i<s.length(); i=i+2){
			
			char c = s.charAt(i);
			String left = s.substring(0, i);
			String right = s.substring(i+1, s.length());
			
			int rightTrue = countWays(right, true);
			int rightFalse = countWays(right, false);
			int leftTrue = countWays(left, true);
			int leftFalse = countWays(left, false);
			
			int total = (leftTrue+leftFalse)*(rightTrue+rightFalse);
			
			int totalTrue = 0;
			
			if (c=='&') totalTrue = leftTrue * rightTrue;
			else if (c=='|') totalTrue = leftTrue*rightTrue + leftTrue*rightFalse + leftFalse*rightTrue;
			else if (c=='^') totalTrue = leftTrue*rightFalse + leftFalse*rightTrue;
			
			int subWays = target==true ? totalTrue: total-totalTrue;
			ways = ways+subWays;
		}
		return ways;
		
		
		
	}
	
	public static boolean stringToBool(String s){
		assert s.length()==1;
		
		if (s.equals("1")) return true;
		return false;
	}

}
