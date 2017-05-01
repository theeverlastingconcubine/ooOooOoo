
public class Test {
	
	public static void main(String[] args){
		
		WQUF qf = new WQUF(6);
		
		qf.add(0,3);
		qf.add(2,4);
		qf.add(5,3);
		
		System.out.println(qf.isConnected(2, 5) + "   " + qf.isConnected(0, 5));
		
			
		
		
	}
	
	

}
