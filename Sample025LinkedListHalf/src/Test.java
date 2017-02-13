
public class Test {
	
	public static void main(String[] args){
		
		MyLinkedList list = new MyLinkedList();
		
		list.addToTheLeft(1);
		list.addToTheLeft(2);
		list.addToTheLeft(3);
		list.addToTheLeft(4);
		list.addToTheLeft(5);
		list.addToTheLeft(6);
		list.addToTheLeft(7);
		list.addToTheLeft(8);
		list.addToTheLeft(9);
		
		System.out.println(list);
		
		list.delete(5);
		
		list.delete(9);
		
		list.delete(1);
		
		list.delete(6);
		
		list.delete(2);
		
		list.delete(8);
		
		System.out.println(list);
		
		
		
		System.out.println(list.middle());
		
		
	}

}
