
public class MyLinkedList<Value> {
	
	private Node head;
	
	private class Node{
		
		Value value;
		Node next;
		
		private Node(Node next, Value value){
			this.next =next;
			this.value = value;
		}
	}
	
	public void add(Value value){
		if(head==null) head = new Node(null,value);
		else { 
			Node oldHead = head;
			head = new Node(oldHead, value);
		}
	}
	
	public int size(){
		Node x = head;
		int size = 0;
		while(x!=null){
			size++;
			x =x.next;
		}
		return size;
	}
	
	public int[] intersectionWith(MyLinkedList list2){
		int[] coordinates = {-1,-2};
		
		int lo = 0;
		Node runner1, runner2;
		int templo, temphi;
		
		
		
		for(Node current1=this.head; current1!=null; current1 = current1.next, lo++){
			for(Node current2 = list2.head; current2!=null; current2 = current2.next){
				
				if(current1.value==current2.value){
					
					templo = lo;
					temphi = lo;
					runner1 = current1;
					runner2 = current2;
					while(runner1!=null && runner2!=null && runner1.value == runner2.value){
						temphi++;
						runner1 = runner1.next;
						runner2 = runner2.next;
					}
										
					if(coordinates[1] - coordinates[0] < temphi - templo){
						coordinates[1] = temphi-1;
						coordinates[0] = templo;
					}
												
				}
				
				
				
			}
		}
		return coordinates;
				
	}
	
	public void inverse(MyLinkedList list){
		
		Node x = list.head;
		Node next = null;
		Node prev = null;
		
		while(x!=null){
			next = x.next;
			x.next = prev;
			prev = x;
			x = next;
				
		}
		
		list.head = prev;
		
	}
	
	
	
	public MyLinkedList overlap(MyLinkedList list2){
		int[] overlap = intersectionWith(list2);
		MyLinkedList<Value> list = new MyLinkedList<Value>();
		Node x = this.head;
		
		int i = 0;
		
		if (this.head==null) return null;
		
		while(x!=null && i<overlap[0]){
			x = x.next;
			i++;
			}
		while(x!=null && i<=overlap[1]){
			list.add(x.value);
			x = x.next;
			i++;
			
		}
		inverse(list);
		
		return list;
				
	}
	
	public String toString(){
		String s ="";
		Node x = head;
		while (x!=null){
			s = s + x.value + "-->";
			x = x.next;
		}
		return s;
		
	}
	

}
