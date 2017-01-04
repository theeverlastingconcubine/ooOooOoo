
public class ST <Key, Value> {
	
	
	private MyLinkedList<Pair> stlist;
	
	
	public void put(Key key, Value val){
		
		Pair newpair = new Pair(key, val);
		int whereIsItem = stlist.searchItem(newpair);
		
		if (whereIsItem<0) stlist.add(newpair);
		else {stlist.deleteAtPosition(whereIsItem);
		stlist.add(newpair);}
				
	}
	
	// null if key is absent
	
	public void get(Key key){
		
	
		
		
	}
	
	public Iterable<Key> keys(){
		
		
	}
	
	
	
	
	

	
	
}
