import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Test {
	
	public static void main(String[] args){
		
	/*	build a dfa based on Pattern
		M is the length of pattern
			   A   B   C   B   D	
		table: 0   1   2   3   4 .. M-1 (pattern.charAt(i)) - just enumerated pattern String
		     A	
			 B 1       3   
			 C     2
			 D             4
			 ..
			 ^
			 possible letters (transition arrows)
			 
			 dfa[B][A] = 1;
			 dfa[C][B] = 2;
			 dfa[B][C] = 3;
			 dfa[D][B] = 4;
			 
			 how do we proceed when go to the next letter in TEXT?
			 j = dfa[text.charAt(i)][0] -> next state j. M is the length of pattern -> M+1 states: 0...M
			 then take that state j and read next charachter and update j
			 j = dfa[text.charAt(i+1)][j];
			 
			 we start at the beginning of the text and if we end up
			 in the state M = pattern.length() we have a match. 
		
			 for some i (text.charAt(i)) we went (via that charAt(i) transition)
			 to the final state M. Means that last transition was at i-> N-i is the beginning
			 of the pattern in the text. otherwise return N.
			 
			 0-A-->1--B->2--C->3--D->4
			 
			 
			 
			 
			 
			 coordinate [i][j] - row, column is
			 the state we go if we read a letter i  when we are at state j
			 state i is the longest prefix of PATTERN which apperas (by far)
			 in input Stream. it is also a prefix in text[0...i]*/
		
			
				
		
		
		
		String text = "Call me Ishmael. Some years ago- never mind how long precisely-"
				+ "having little or no money in my purse, and nothing particular to"
				+ "interest me on shore, I thought I would sail about a little and see"
				+ "the watery part of the world. It is a way I have of driving off the"
				+ "spleen and regulating the circulation. Whenever I find myself growing"
				+ "grim about the mouth; whenever it is a damp, drizzly November in my";
	
		String pattern = "th;";
		
		for(int i = 0; i < text.length() - pattern.length(); i++){
			int j;
			for(j = 0; j < pattern.length(); j++){
				if(text.charAt(i+j)!=pattern.charAt(j)) break;
				}
			if(j == pattern.length()) System.out.println(i);;
		}
		
		KMP kmp = new KMP(pattern);
		System.out.println(kmp.search(text, pattern));
		
		
		
		
	}

}
