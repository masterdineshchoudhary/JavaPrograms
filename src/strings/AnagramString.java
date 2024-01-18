package strings;

import java.util.Arrays;

public class AnagramString {

	// Method 1
	// using sort() and equals()
	static void isAnagram(String s1, String s2) {
		String cs1 = s1.replaceAll("\\s", "");
		String cs2 = s2.replaceAll("\\s", "");
		boolean status = true;
		if (cs1.length() != cs2.length()) {
			status = false;
		} else {
			char s1arr[] = cs1.toLowerCase().toCharArray();
			char s2arr[] = cs2.toLowerCase().toCharArray();
			Arrays.sort(s1arr);
			Arrays.sort(s2arr);
			status = Arrays.equals(s1arr, s2arr);
		}
		if (status) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}
	}

	public static void main(String[] args) {
        isAnagram("Geeks", "Keegs");
	}
}