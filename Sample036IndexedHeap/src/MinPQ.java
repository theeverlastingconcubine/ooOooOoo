import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MinPQ<Priority extends Comparable<Priority>, Item> {
	
	ArrayList<Item> pq;
	Map<Item, Priority> priority;
	Map<Item, Integer> index;
	int size;
		
	public MinPQ(){
		
		pq = new ArrayList<Item>(2);
		priority = new HashMap<Item, Priority>();
		index = new HashMap<Item, Integer>();
		size=0;
		
		pq.add(null);
	
	}
	
	public void updatePriority(Item item, Priority priority){
		int cmp = this.priority.get(item).compareTo(priority);
		if(cmp<0) incP(item, priority);
		else if(cmp>0) decP(item, priority);
		else return;
		
	}
	
	private void incP(Item item, Priority priority){
		this.priority.put(item, priority);
		sink(index.get(item));
		
	}
	
	private void decP(Item item, Priority priority){
		this.priority.put(item, priority);
		swim(index.get(item));
		
	}
	
	public void add(Item item, Priority priority){
		size++;
		pq.add(null);
		pq.set(size,item);
		this.priority.put(item, priority);
		this.index.put(item, size);
		swim(size);		
		
	}
	
	public boolean isEmpty() {return size==0;}
	
	public Item getMin(){
		
		Item min = pq.get(1);
		swap(1, size);
		size--;
		sink(1);
		return min;
	}
	
		
	private void sink(int k){
		
		while(2*k<=this.size){
		int j = 2*k;
		if (j<this.size && less(j+1, j)) j = j+1;
		if (!less(j,k)) break; 
		swap(k,j);
		k=j;
		}
	}
	
	
	private void swim(int k){
		
		while(k>1 && less(k,k/2)){
			
			swap(k,k/2);
			k=k/2;
			
		}
			
		
	}
	
	
	
	private boolean less(int i, int j){
		
		return priority.get(pq.get(i)).compareTo(priority.get(pq.get(j))) < 0;
		
	}
	
	private void swap(int i, int j){
		
		Item tmp = pq.get(i);
		pq.set(i, pq.get(j));
		pq.set(j, tmp);
		
		index.put(pq.get(i), i);
		index.put(pq.get(j), j);
	}
	
	

}
