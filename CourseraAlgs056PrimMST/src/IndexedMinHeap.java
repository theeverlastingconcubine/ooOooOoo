import java.util.ArrayList;
import java.util.HashMap;

public class IndexedMinHeap<Item, Priority extends Comparable<Priority>> {
	
	private ArrayList<Item> pq;
	private HashMap<Item, Integer> qp;  //we store indexes in pq here
	private HashMap<Item, Priority> prior;
	private int n;
	
		
	public IndexedMinHeap(){
		
		pq = new ArrayList<Item>();
		pq.add(null);
		qp = new HashMap<Item, Integer>();
		prior = new HashMap<Item, Priority>();
		n=0;
				
	}
	
	public boolean hasElement(Item item){
		return prior.containsKey(item);
	}
	
	public boolean isEmpty() {return n==0;}
	
	public Priority minPriority() {return prior.get(pq.get(1));}
	
	public Priority getPriority(Item item){
		return prior.get(item);
	}
	
	public void insert(Item a, Priority p){
		
		if(hasElement(a)) {System.out.println("WE ALREADY HAVE THIS ITEM");
		return;
		}
		
		n++;
		pq.add(n,a);
		qp.put(a, n);
		prior.put(a, p);
		swim(n);
						
	}
	
	
	public Item getMin(){
		
		
		Item min = pq.get(1);
		
		swap(1, n);
		n--;
		sink(1);
			
		prior.remove(min);
		qp.remove(min);
		
		return min;
	}
	
	public void updatePriority(Item it, Priority p){
		
		prior.put(it, p);
		swim(qp.get(it));
		sink(qp.get(it));
		
		
	}
	
	public void decreasePriority(Item it, Priority p){
			
		prior.put(it, p);
		swim(qp.get(it));
		
	}
	
	
	
		
	
	private void swim(int k) {
		
		while (k > 1 && less(k, k / 2)) {
			swap(k, k / 2);
			k = k / 2;
		}

	}

	
	private void sink(int k) {

		while (2 * k <= n) {
			int j = 2 * k;
			if (j < n && less(j + 1, j))
				j++;
			if (!less(j, k))
				break;
			swap(k, j);
			k = j;
		}

	}
	
	
	private boolean less(int a, int b){
		
		Priority keya = prior.get(pq.get(a));
		Priority keyb = prior.get(pq.get(b));
		
		return keya.compareTo(keyb) < 0;
		
	}
	
	private void swap(int i, int j){
		
		Item a = pq.get(i);
		Item b = pq.get(j);
			
		Item tmp = pq.get(i);
		pq.set(i, pq.get(j));
		pq.set(j, tmp);
		
		qp.put(a, j);
		qp.put(b, i);
		
	}
	
	

	
	
		
	
	
	
	
	

}
