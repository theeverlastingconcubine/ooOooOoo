
public class LinkedList {

	private LinkedListNode first = null;

	public void add(int data) {

		LinkedListNode newfirst = new LinkedListNode(data, first);
		first = newfirst;

	}

	public String toString() {
		String l = "";

		for (LinkedListNode x = first; x != null; x = x.next) {
			l = l + " " + x.data + "--->";

		}
		return l;

	}

	// returns kth node in the list
	public LinkedListNode nodeAt(int k){
		
		LinkedListNode x = first;
		
		for (int i=0; i<k-1; i++){
			x = x.next;
		}
		return x;
		
	}
	
	public void deleteNode(LinkedListNode currentnode){
					
		
		currentnode.data = currentnode.next.data;
		currentnode.next = currentnode.next.next;
			
	}

}
