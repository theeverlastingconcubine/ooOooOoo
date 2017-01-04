import java.util.LinkedList;

public class Prokladka<Key, Value> {
	
	private LinkedList<Pair<Key, Value>> list;
	
	public Prokladka(){
		list = new LinkedList<Pair<Key, Value>>();
	}
	
	public void add(Key key, Value value){
		
		//Pair<Key, Value> newpair = new Pair<Key,Value>(key, value);
		
		list.add(new Pair<Key, Value>(key, value));
		
	}
	
	public LinkedList<Pair<Key, Value>> getList(){
		
		return list;
	}
	
	public Key getFirstKey(Key key){
		
		return list.getFirst().getKey();
		
	}
	
	

}
