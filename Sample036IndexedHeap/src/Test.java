import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args){
		
		
	MinPQ<Integer, String> pq = new MinPQ<Integer, String>();
	
	pq.add("pushkin", 1000);
	pq.add("tolstoi", 99);
	pq.add("turgenev", 1000);
	pq.add("akunin", -10);
	pq.add("marinina", -1100);
	pq.add("kalashnikov", -3700);
	pq.add("gogol", 50);
	
	pq.updatePriority("pushkin", 0);
	
	pq.updatePriority("gogol", 500);
	
	while(!pq.isEmpty()) System.out.println(pq.getMin());
		
	
		
		
	}

}
