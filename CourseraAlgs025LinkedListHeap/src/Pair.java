
public class Pair<Key, Value> {
	
	private Key key;
	private Value value;
	
	public Pair(Key key, Value value){
		this.key = key;
		this.value = value;
	}
	
	public Key k(){
		return key;
	}
	
	public Value v(){
	return value;
	}
	

}
