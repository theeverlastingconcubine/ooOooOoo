
public class MyLinkedList {
	
	private Node head;
	
	private class Node{
		
		Node next;
		int val;
		
		
		public Node(int val, Node next){
			this.next = next;
			this.val = val;
		}
				
	}
	
	public void addToTheLeft(int k){
		head = new Node(k, head);
				
	}
	
	public String toString(){
	
		String s = "";
		for(Node x = head; x!=null; x = x.next)
		s = s + x.val + " --> ";
		return s;
	}
	
	
	public int middle(){
		
		Node n1 = head;
		Node n2 = head;
		
		while(n2!=null && n2.next!=null && n2.next.next!=null){
			n1 = n1.next;
			n2 = n2.next.next;
			
		}
		
		return n1.val;
	}
	
	public void delete(int i){
		Node n = head;
		while(n.val!=i) n = n.next;
		delete(n);
		
	}
	
	private void delete(Node n){
			
		Node i = head;
		if(head.val == n.val) {head = head.next;}
		else {while(i.next.val!=n.val) i = i.next;
		i.next = n.next;}
		
	}
	
	
	
	
	
	
	

}
