import java.util.LinkedList;

public class Test {

	public static void main(String[] args){
		
		
		LinkedList<Integer> mylist = new LinkedList<Integer>();
		
		mylist.add(500);
		mylist.add(0);
		mylist.add(300);
		mylist.add(-100);
		mylist.add(99999);
		mylist.add(121);
		
		for(Integer s: mylist){System.out.println(s);}
		System.out.println(mylist.size());

		
		
	}
	
	
	
}
