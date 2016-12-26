
public class Factorial {

	public static void main(String[] args) {

		System.out.println(factorial(4));
		
		int fact = 1;
		
		for (int i = 1; i <= 4; i++) {
			fact = fact*i;
			}
		
		System.out.println(fact);

	}

	private static int factorial(int n) {

		if (n == 1)
			return 1;
		else
			return n * factorial(n - 1);

	}

}
