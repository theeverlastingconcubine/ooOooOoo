
public class ST <Key, Value> {
	
	
	private MyLinkedList<Pair<Key, Value>> stlist;
	
	
	public void put(Key key, Value val){
		
		Pair<Key, Value> newpair = new Pair<Key, Value>(key, val);
		int whereIsItem = stlist.searchItem(newpair);
		
		if (whereIsItem<0) stlist.add(newpair);
		else {stlist.deleteAtPosition(whereIsItem);
		stlist.add(newpair);}
				
	}
	
	// null if key is absent
	
	public Value get(Key key){
	
		for (Pair<Key, Value> p: stlist){
			
			if (p.k().equals(key)) return p.v();
			else throw new Error("We found nothing");
			
		}
		
		
	}
	
	public Iterable<Key> keys(){
		
		Key[] keys = (Key[]) new Object[stlist.size()];
		int i=0;
		for (Pair<Key, Value> s: stlist){
					keys[i] = s.k();	
		}
		
		return keys;
		
		
	}
	
	
	
	
	

	
	
}
