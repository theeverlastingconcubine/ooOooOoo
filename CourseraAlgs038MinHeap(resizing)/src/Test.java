
public class Test {
	
	
	public static void main(String[] args){
		
		int[] a = {2,3,7,9,700,6,5,6,7,9,65,5,-100,-1000,-666,34,5,7,8,9};
		
		MinHeap pq = new MinHeap();
		
		for(int i=0; i<a.length; i++) pq.insert(a[i]);
		
		for(int i=0; i<a.length; i++) System.out.println(pq.takeMin());
		
		
	}

}
