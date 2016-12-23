import java.util.Arrays;



public class NoBorderArray<Item> {
	
	Item[] a;
	
	
	public NoBorderArray(int n) {

		a = (Item[]) new Object[n];

	}

	
	public int length() {
		return a.length;
	}
	

	
	public void set(Item item, int i){
		if (i > -1 && i < a.length)
			a[i] = item;
		else throw new Error("No such index");
			
	}
	
		
	public Item value(int i) {

		if (i > -1 && i < a.length){
			return a[i];}
		if (i < 0){
			return a[0];}
		if (i >= a.length){
			return a[a.length - 1];}
		else
			throw new Error("not good");

	}
	
	public String toString(){
		return Arrays.toString(a);
		
	}

}
