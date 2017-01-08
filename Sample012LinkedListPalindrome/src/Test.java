
public class Test {
	
	public static void main(String[] args){
		
	MyLinkedList<Integer> mylist = new MyLinkedList<Integer>();
	
	mylist.addToTail(0);
	mylist.addToTail(1);
	mylist.addToTail(2);
	mylist.addToTail(3);
	mylist.addToTail(4);
	mylist.addToTail(3);
	mylist.addToTail(2);
	mylist.addToTail(1);
	mylist.addToTail(0);
	
	System.out.println(mylist);
	System.out.println(mylist.reverse());
	System.out.println();
	
	System.out.println("THIS LIST IS PALINDROME:  " + mylist.isPalindrome());
	
	/*System.out.println("first value is " + mylist.showFirst() + " size is: " + mylist.size());
	System.out.println(mylist);
	
	
	for (Integer s: mylist) System.out.print(s + " " + "-----> ");
	
	System.out.println();
	System.out.println();
	System.out.println(mylist.reverse());
	
	boolean eq = mylist.isEqual(mylist, 0, 4, mylist.reverse(), 0, 4);
	
	System.out.println(eq);*/
	
	
	}

}
