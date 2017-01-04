
public class Test {
	
	
	public static void main(String[] args){
		
		//list test
		
		LinkedList<Integer> testList = new LinkedList<Integer>();
		
	//	System.out.println(testList.isEmpty());
		testList.add(100);
	//	System.out.println(testList.isEmpty());
		testList.add(50);
		testList.add(200);
		testList.add(0);
		testList.add(300);
		testList.add(-50);
		testList.add(400);
		
		
//		for(Integer i:testList){
//			System.out.println(i);
//		}
		
//		System.out.println(testList.isEmpty());
		
		
		System.out.println(testList.find(300));		
		
		
	}

}
