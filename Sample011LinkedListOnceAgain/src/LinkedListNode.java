public class LinkedListNode {

	LinkedListNode next;
	int data;

	public LinkedListNode(int data, LinkedListNode next) {

		this.data = data;
		this.next = next;

	}
	
	public String toString(){
		return "node's data is " + data;
		
	}

/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + data;
		result = prime * result + ((next == null) ? 0 : next.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinkedListNode other = (LinkedListNode) obj;
		if (data != other.data)
			return false;
		if (next == null) {
			if (other.next != null)
				return false;
		} else if (!next.equals(other.next))
			return false;
		return true;
	}*/
}