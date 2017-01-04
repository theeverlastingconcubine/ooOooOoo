
public class Test {
	
	
	public static void main(String[] args){
		
		MyLinkedList<String> mylist = new MyLinkedList<String>();
		
		mylist.add("bottle 1");
		mylist.add("bottle 2");
		mylist.add("bottle 3");
		mylist.add("bottle 4");
		mylist.add("bottle 5");
		mylist.add("bottle 6");
		mylist.add("bottle 7");
		mylist.add("bottle 8");
		mylist.add("bottle 9");
		
		System.out.println("list size is  " + mylist.size());
		
		System.out.println();
		
		for (String s: mylist){
			
			System.out.print("[" + s + "]--->");
			}
		
		System.out.println();
		System.out.println();
		
		int where = mylist.searchItem("bottle 0");
		
		System.out.println(where);
		
	}
	

}
