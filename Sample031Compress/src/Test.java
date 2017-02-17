
public class Test {
	
	
	public static void main(String[] args){
		
		String a = "sooobaaakaaa";
		
		int counter = 0;
		StringBuilder sb = new StringBuilder();
		
		
		
		for(int i=0; i<a.length()-1; i++){
			char c = a.charAt(i);
			counter++;
			if(c!=a.charAt(i+1)){
				if(counter>2) sb.append(counter);
				sb.append(c);
				counter=0;		
		}		
			
		}
		System.out.println(sb.toString());
		
	
	}

}
