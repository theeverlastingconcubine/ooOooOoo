
public class ST <Key extends Iterable<Key>, Value> {
	
	
	private MyLinkedList<Pair> stlist;
	
	
	public void put(Key key, Value val){
		
		Pair newpair = new Pair(key, val);
		
		if (stlist.searchItem(newpair)>0) 
		
		
	}
	
	// null if key is absent
	
	public void get(Key key){
		
	}
	
	public Iterable<Key> keys(){
		
		
	}
	
	
	
	
	

	
	
}
