public class DeleteNode {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println(list);
		System.out.println();

		
		LinkedListNode nodeToDelete = list.nodeAt(3);
		System.out.println(nodeToDelete);
		
		LinkedListNode nodeAt4 = list.nodeAt(2);
		LinkedListNode wtf = new LinkedListNode(4, nodeToDelete);
		
		System.out.println(wtf.equals(nodeAt4));
		System.out.println(wtf);
		System.out.println(list.nodeAt(2));
		
		System.out.println();
		list.deleteNode(nodeToDelete);
		System.out.println(list);
		
		
		

	}
}
