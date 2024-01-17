package basic;
// palindrome number = number that is same after reverse. For ex: 545, 151, 34543

// palindrome string = string that is same after reverse. For ex: madam,lol

public class Palindrome {

	public static void main(String[] args) {

		// palindrome number
		int num = 151, rem = 0, rev = 0, temp = num;
		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println("num = " + temp);
		System.out.println("rev = " + rev);
		if (rev == temp) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

		// palindrome string
		String str = "madam";
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Original = " + str);
		System.out.println("Reverse = " + reverse);
		if (str.equals(reverse)) {
			System.out.println("Palindrome string");
		} else {
			System.out.println("Not Palindrome string");
		}

	}
}