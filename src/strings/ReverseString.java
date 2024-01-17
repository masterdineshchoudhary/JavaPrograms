package strings;

// Java Program To Reverse A String

public class ReverseString {

	// Method 3 : recursive method
	/*
	 * This method takes the first character of a string (str.charAt(0)) and puts it
	 * at the end of the string. And then calls itself on the remainder of the
	 * string (str.substring(1)). Finally adds these two things to get the reverse
	 * of the passed string (recursiveMethod(str.substring(1)) + str.charAt(0)).
	 * When the passed string is one character or less (str.length() <= 1), it stops
	 * calling itself and just returns the string passed.
	 * 
	 * If the “MyJava” is the string to reverse, then this method works like this.
	 * 
	 * 1st Call —> recursiveMethod(“MyJava”) 2nd Call —> recursiveMethod(“yJava”) +
	 * “M” 3rd Call —> (recursiveMethod(“Java”) + “y”) + “M” 4th call —>
	 * ((recursiveMethod(“ava”) + “J”)+”y”) + “M” 5th Call —>
	 * (((recursiveMethod(“va”) + “a”) + “J”)+”y”) + “M” 6th Call —>
	 * ((((recursiveMethod(“a”) + “v”) + “a”) + “J”)+”y”) + “M”
	 * 
	 * After 6th call, it Stops calling itself. Because the length of passed string
	 * is 1. So, finally it returns “avaJyM”.
	 */
	static String recMtd(String str) {
		if ((null == str) || (str.length() <= 1)) {
			return str;
		}
		return recMtd(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {

		// Method 1 : 
		// using StringBuffer class 
		// reverse() method of StringBuffer class to reverse the string
		StringBuffer sbf = new StringBuffer("Dinesh");
		System.out.println(sbf.reverse());

		// Method 2 : 
		// using iterative method
		// first we convert given string to char array using charArray() method
		// then we iterate that array in the reverse order.
		String str = "Khushwant";
		char[] strarr = str.toCharArray();
		for (int i = strarr.length - 1; i >= 0; i--) {
			System.out.print(strarr[i]);
		}

		System.out.println();
		String st = "Dinesh";
		String revst = "";
		for (int i = st.length() - 1; i >= 0; i--) {
			revst = revst + st.charAt(i);
		}
		System.out.println(revst);

		// Method 3 : 
		// using recursive method
		// method which reverses the string by calling itself recursively.
		String strRec = "java";
		System.out.println(recMtd(strRec));

	}
}