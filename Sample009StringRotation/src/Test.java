public class Test {

	
	//naive isSubstrig
	//search the first letter of s2 in s1, then checks if all letters
	//from here are coincide

	
	public static boolean isSubstring1(String s1, String s2) {

		if (s1.length() < s2.length())
			return false;

		int i = 0;

		do {

			while (s1.charAt(i) != s2.charAt(0)) {
				i++;
			}

			if (s1.length() - i < s2.length())
				break;

			boolean indicator = true;
			for (int j = 0; j < s2.length() && i < s1.length(); j++) {
				if (s1.charAt(i) != s2.charAt(j)) {
					indicator = false;
					break;
				} else
					i++;
			}
			if (indicator == true)
				return true;
		}

		while (i < s1.length());

		return false;
	}

	public static boolean isSubstring(String s1, String s2) {

		if (s1.length() < s2.length())
			return false;
		else
			return s1.contains(s2);

	}

	public static boolean isRotation(String s1, String s2) {

		int len = s1.length();
		if (len == s2.length() && len > 0) {
			String s1s1 = s1 + s1;
			return isSubstring(s1s1, s2);
		}

		return false;
	}

	public static void main(String[] args) {

		System.out.println(isRotation("smokeweed", "weedsmoke"));
		System.out.println(isRotation("smokeweed", "ewedsmoke"));

		System.out.println(isSubstring1("weed", "ed"));
	}

}
