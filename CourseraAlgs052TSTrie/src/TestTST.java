
public class TestTST {
	
	public static void main(String[] args){
		
		
		TST<Integer> tst = new TST<Integer>();
		
		tst.put("shelter", 12);
		tst.put("shell", 100);
		tst.put("shelest", 124);
		tst.put("shvabra", 2134);
		tst.put("teremok", 122123);
		tst.put("fiuggi", 0);
		tst.put("aalien", 125);
		
				
		for(String s: tst.keys()) System.out.println(s);
		
		
		StringBuilder sb = new StringBuilder();
		sb.append('s');
		sb.append('o');
		sb.append('b');
		sb.append('a');
		sb.append('k');
		
		String s = new String();
		System.out.println(sb.append('a').toString());
		System.out.println(sb.toString() + 'a');
	}
	
	
}
