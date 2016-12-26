import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		Object[] cards = { "is", "this", "a", "real", "life", 666 };

		System.out.println(Arrays.toString(cards));
		System.out.println();
		Shuffle.shuffle(cards);
		System.out.println(Arrays.toString(cards));

	}

}
