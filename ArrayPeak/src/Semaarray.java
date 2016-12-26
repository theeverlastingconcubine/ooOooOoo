
public class Semaarray {

	int[] array;

	public Semaarray(int[] array) {
		this.array = array;

	}

//	public void printpeaks() {
//		for (int i = 0; i < array.length; i++) {
//			if (array(i) >= array(i + 1) && array(i) >= array(i - 1)) {
//				Test.log(array(i));
//			}
//
//		}

//	}

	public int getElement(int i) {
		if (i >= 0 && i < array.length) {
			return array[i];
		}
		if (i < 0) {
			return array[0];
		}
		if (i >= array.length) {
			return array[array.length - 1];
		}
		throw new Error("Unexpected index");

	}

	public int size() {
		
		return array.length;
	}

}
