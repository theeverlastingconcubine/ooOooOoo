import java.util.LinkedList;
import java.util.Scanner;

public class Test {
	
	
	public static void main(String[] args){
			
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
		
		LinkedList<Integer> values = new LinkedList<Integer>();
		LinkedList<Character> operands = new LinkedList<Character>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<input.length(); i++){
			Character ci = input.charAt(i);
			Character cii;
			if(i<input.length()-1) cii = input.charAt(i+1);
			else cii = '!';
			
			
			if(ci=='(');
			else if(ci=='+' || ci=='-' ||ci=='*'||ci=='/') operands.push(ci);
			else if(ci == ')') {
				Character op = operands.pop();
				if(op == '+') values.push(values.pop() + values.pop());
				else if(op == '-') values.push(values.pop() - values.pop());
				else if(op == '*') values.push(values.pop() * values.pop());
				else if(op == '/') values.push(values.pop() / values.pop());
				}
			else { 
					sb.append(ci);
					System.out.println(ci);
					if(Character.getNumericValue(cii)<Character.getNumericValue(0) || Character.getNumericValue(cii)>Character.getNumericValue(9) || cii == '!'){
						values.push(Integer.parseInt(sb.toString()));
						sb = new StringBuilder();
					}
				
			}
			
			
		}
			System.out.println(values.pop());
		
		
		
	}

}
