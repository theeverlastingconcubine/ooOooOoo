
public class Test {
	
	public static void main(String[] args){
	
	MyLinkedList<Integer> list = new MyLinkedList<Integer>();
	
	list.add(5);
	list.add(1);
	list.add(9);
	list.add(2);
	list.add(7);
	list.add(5);
	list.add(1);
	list.add(9);
	list.add(0);
	list.add(1);
	list.add(9);
	//duplicates are 1 and 9 and 6
	for(Integer i: list) System.out.print(i + "-->");
	list.deleteDuplicates();
	for(Integer i: list) System.out.print(i + "-->");
	
	}
}
