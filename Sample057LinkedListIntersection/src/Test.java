import java.util.Arrays;

public class Test {

	public static void main(String[] args){
		
		MyLinkedList<Integer> list1= new MyLinkedList<Integer>();
		MyLinkedList<Integer> list2= new MyLinkedList<Integer>();
		
		list1.add(17);
		list1.add(14);
		list1.add(100);
		
		list1.add(666);
		list1.add(98789);
		list1.add(15);
		list1.add(100);
		
		
		list2.add(14);
		
				
		list2.add(5);
		list2.add(4);
		list2.add(3);
		
		list2.add(17);
		list2.add(14);
		list2.add(100);
		
		list2.add(1);
		list2.add(0);
		
		list2.add(14);
		list2.add(100);
		
		list2.add(1);
		list2.add(2);
		
		System.out.println(list1.size() + "       " + list1);
		System.out.println(list2.size() + "       " + list2);
		
		int[] overlap = list1.intersectionWith(list2);
		System.out.println(Arrays.toString(overlap));
		System.out.println(list1.overlap(list2));
		
		System.out.println();
		System.out.println();
		
		list1.inverse(list1);
		list2.inverse(list2);
		System.out.println(list1.size() + "       " + list1);
		System.out.println(list2.size() + "       " + list2);
		
		int[] overlap1 = list1.intersectionWith(list2);
		System.out.println(Arrays.toString(overlap1));
		System.out.println(list1.overlap(list2));
		
		
		
	}
}
