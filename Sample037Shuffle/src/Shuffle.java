import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Shuffle {
	
	private static void swap(Object[] a, int i, int j){
		Object tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	public static void main(String[] args){
		
		Random rnd = new Random();
		
		Integer[] a = {0,1,2,3,4,5,6,7,8,9};
		Integer[] b = {0,1,2,3,4,5,6,7,8,9};
		
		System.out.println(Arrays.toString(a));
		for(int i = 0; i<a.length; i++){
			int r = rnd.nextInt(i+1);
			swap(a,i,r);
		}
		System.out.println(Arrays.toString(a));
		System.out.println();
		
		System.out.println(Arrays.toString(b));
		
		
		Integer[] aux = b;
		Map<Double, Integer> mapp = new TreeMap<Double, Integer>();
		
		for(int i = 0; i<b.length; i++){
			mapp.put(rnd.nextDouble(), i);
		}
		
		int i = 0;
		for(Double zz: mapp.keySet()) {
			aux[mapp.get(zz)] = b[i];
			i++;
		}
		System.out.println(Arrays.toString(aux));
		System.out.println(mapp);		
		for(Double zz: mapp.keySet()) System.out.print(mapp.get(zz) + ", ");
		
		
		
		
	}

}
