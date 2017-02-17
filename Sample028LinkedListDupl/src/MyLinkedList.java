import java.util.HashSet;
import java.util.Iterator;

public class MyLinkedList<Item> implements Iterable<Item> {
	
	Node head;
	
	private class Node{
		
		Node next;
		Item item;
		
		public Node(Item item, Node next){
			this.item = item;
			this.next = next;
		}
	
	}
	
	public void add(Item item){
		head = new Node(item, head);
		}
	
	
	private void delete(Node x){
	if(x == null) throw new IllegalArgumentException("delete NULL??");
	
	//find previous
	Node a;
	for(a = head; a.next.item != x.item; a = a.next);
	a.next = x.next;	
	}
	
	public void deleteDuplicates(){
		
		HashSet<Item> set = new HashSet<Item>();
		
		for(Node x = head; x!=null; x = x.next){
			if(set.contains(x.item)) delete(x);
			else set.add(x.item);
			
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	public Iterator<Item> iterator(){
		return new LinkedListIterator();
	}
	
	private class LinkedListIterator implements Iterator<Item>{
		
		Node current = head;
		
		public boolean hasNext(){
			return current!=null;
		}
		
		public Item next(){
			Item item = current.item;
			current = current.next;
			return item;
		}
		
	}
	
	
	
	

}
