
public class Test {

	private static boolean isUnique(String word) {

		if (word.length() > 128)
			return false;

		boolean[] allchars = new boolean[128];
		
		for (int i = 0; i < word.length(); i++) {

			int val = word.charAt(i);
			if (allchars[val]) {
				return false;
			}
			allchars[val] = true;

		}

		return true;

	}

	public static void main(String[] args) {

		System.out.println(isUnique("as"));

	}

}
