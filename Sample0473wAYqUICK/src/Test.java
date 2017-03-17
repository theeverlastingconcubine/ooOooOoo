import java.util.Arrays;
import java.util.Random;

public class Test {

	public static void main(String[] args){
		
		
		String[] a = {"who","cAn","it","bee","now","short","zux","kuzmya","mazY","flux","vortex",
				"kopol","plot","frog"};
	
			System.out.println(Arrays.toString(a));
			Qwick.sort(a, String.CASE_INSENSITIVE_ORDER);
			System.out.println(Arrays.toString(a));
			System.out.println(Qwick.isSorted(a, String.CASE_INSENSITIVE_ORDER));
			
			Random rnd = new Random();
			
			/*for(int q = 0; q<10000; q++){
			String[] b = new String[rnd.nextInt(20)];
			
			for(int i = 0; i<b.length; i++){
				int len = rnd.nextInt(8);
				char[] sb = new char[len];
				for(int w = 0; w<len; w++){
					char c = (char) (65 + rnd.nextInt(26));
					sb[i] = c;
					}
				a[i] = new String(sb);			
			}
			
			boolean flag = true;
			Qwick.sort(b, String.CASE_INSENSITIVE_ORDER);
			flag = Qwick.isSorted(b, String.CASE_INSENSITIVE_ORDER);
			if (flag==false){
				System.out.println("YourSortIsNotwOrkingException");
				break;
			}*/
			
			
			}
			
			
	
	
	}
	

