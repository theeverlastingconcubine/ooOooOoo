
public class Pair<Key, Value> {
	
	private Key key;
	private Value value;
	
	public Pair(Key key, Value value){
		this.key = key;
		this.value = value;
	}
	
	public Key returnKey(){
		return key;
	}
	
	public Value returnValue(){
	if (value!=null )return value;
	else return null;
	
	}
	
	public void setKey(Key key){
		this.key=key;
	}
	
	public void setValue(Value value){
		this.value = value;
	}
	

}
