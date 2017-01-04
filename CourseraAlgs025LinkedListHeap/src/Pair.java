
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	public Value v(){
	return value;
	}
	
	public void setKey(Key key){
		this.key=key;
	}
	
	public void setValue(Value value){
		this.value = value;
	}
	

}
