import java.util.Arrays;

public class Test{
	
	private static class KVal<Key extends Comparable<Key>, Value> implements Comparable<KVal>{
		
		Key key;
		Value value;
		
		private KVal(Key key, Value value){
			this.key=key;
			this.value=value;
		}
		
		public String toString(){
			return "["+key+", "+value+"]";
		}

		@Override
		public int compareTo(KVal that) {
			return this.key.compareTo((Key) that.key);
		}

		
		
		
		
		
	}
	
public static void main(String[] args){
		
		
		BST<Integer, String> bst = new BST<Integer, String>();
		
		bst.put(5, "five");
		bst.put(2, "two");
		bst.put(10, "ten");
		bst.put(1, "one");
		bst.put(0, "zero");
		bst.put(20, "twenty");
		bst.put(-4, "NEGATIVE");
		bst.put(15, "fifteen");
		bst.put(666, "beast");
		bst.put(-1, "negativeone");
		
		System.out.println(bst.search(666));
			
		System.out.println(bst);
		
		System.out.println(bst.isBalanced());
		
		KVal<Integer, String>[] a = (KVal<Integer, String>[]) new KVal[19];
		
		for(int i =0;i<a.length; i++){
			a[i] = new KVal(2*a.length-i, "dan");
		}
		
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		
		
	}

}
