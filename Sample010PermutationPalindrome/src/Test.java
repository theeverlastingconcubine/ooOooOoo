import java.util.Arrays;

public class Test {
	
	
	//non-letters map to -1
	
	private static int getCharNumber(Character c){
		
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);
		
		if(a <= val && val<=z){return val-a;}
		
		return -1;
		
	}
	
	//how many times each character appears?
	
	private static int[] charFrequency(String sentence){
		
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		
		for (char c: sentence.toCharArray()){
			int x = getCharNumber(c);
			if (x!=-1) table[x]++;
		}
		System.out.println(Arrays.toString(table) + "   " + table.length);
		return table;
		
	}
	
	private static boolean checkMaxOneOdd(int[] table){
		
		boolean foundOdd = false;
		
		for(int count:table){
			if(count%2==1){
				if(foundOdd){
					return false;
				}
				foundOdd = true;
			}
		}
		return true;
	}

	
	private static boolean isPermutationOfPalindrome(String phrase){
	
		int[] table = charFrequency(phrase);
		return checkMaxOneOdd(table);
	}
	
	public static void main(String[] args){
		
		System.out.println(isPermutationOfPalindrome("taco cat"));
		
		
	}
	
	
}

