import java.util.HashMap;

public class Test {

	public static void main(String[] args) {

		int[] array = { 4, 4, 6, 7, 8, 3, 4, 5, 2 };

		printPeaks(array);
		
		Semaarray sarray = new Semaarray(array);
	
		
		log("!!!");
		
		
		
		printPeaks(sarray);
		
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		
		
		
		
		

	}
	
	private static void printPeaks(Semaarray sarray){
		for (int i = 0; i < sarray.size(); i++) {
			if (sarray.getElement(i) >= sarray.getElement(i + 1) && sarray.getElement(i) >= sarray.getElement(i - 1)) {
				Test.log(sarray.getElement(i));
			}

		}
		
		
	}
	

	private static void printPeaks(int[] array) {

		for (int i = 0; i < array.length; i++) {

			if (i == 0) {
				if (array[i] >= array[i + 1]) {
					log(array[i]);
				}
			} else if (i > 0 && i < array.length - 1) {
				if (array[i] >= array[i - 1] && array[i] >= array[i + 1]) {
					log(array[i]);
				}

			}

			else if (i == array.length - 1) {
				if (array[i] >= array[i - 1])
					log(array[i]);
			}

		}

	}

	public static void log(Object message) {
		System.out.println(message);

	}

}
