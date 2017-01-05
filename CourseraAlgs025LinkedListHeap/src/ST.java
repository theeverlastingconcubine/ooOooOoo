public class ST<Key, Value> {

	private MyLinkedList<Pair<Key, Value>> stlist;

	public ST() {
		stlist = new MyLinkedList<Pair<Key, Value>>();
	}

	public void put(Key key, Value val) {

		Pair<Key, Value> newpair = new Pair<Key, Value>(key, val);
		int whereIsItem = stlist.searchItem(newpair);

		if (whereIsItem < 0)
			stlist.add(newpair);
		else {
			stlist.deleteAtPosition(whereIsItem);
			stlist.add(newpair);
		}

	}

	// null if key is absent

	public Value get(Key key){
		
		Pair<Key,Value> tmp = new Pair<Key, Value>(null,null);
		
		for(Pair<Key,Value> p:stlist){
			if (p.returnKey() == key){
				tmp = p;
			}}
		return tmp.returnValue();
			
			
	
	}

	public Iterable<Key> keys() {

		MyLinkedList<Key> keys = new MyLinkedList<Key>();
		
		for (Pair<Key, Value> s : stlist) {
			keys.add(s.returnKey());
		}
		
		return keys;

	}

}
