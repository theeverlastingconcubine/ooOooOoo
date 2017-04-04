
public class StringLikeString implements StringLike{
	
	private final String text;
	
	public StringLikeString(String text){
		this.text= text;
	}
	
	public int charAt(int i){
		return text.charAt(i);
	}
	
	public int length(){
		return text.length();
	}
	
	public String toString(){
		return text;
	}
		
}
