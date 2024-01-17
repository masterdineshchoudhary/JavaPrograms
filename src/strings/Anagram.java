package strings;

import java.util.Arrays;
public class Anagram {
	
//	// Mtd 1: Anagram Program In Java Using sort() and equals() Methods
//    String cs1 = s1.replaceAll("\\s","");
//    String cs2 = s2.replaceAll("\\s","");
//    boolean status = true;
//    if (cs1.length() != cs2.length()){
//        status = false;
//    } else {
//        char s1arr[] = cs1.toLowerCase().toCharArray();
//        char s2arr[] = cs2.toLowerCase().toCharArray();
//        Arrays.sort(s1arr);
//        Arrays.sort(s2arr);
//        status = Arrays.equals(s1arr, s2arr);
//    }
//    if (status) {
//        System.out.println("Anagram");
//    } else {
//        System.out.println("Not Anagram");
//    }
	
	public static void main(String[] args) {
		String str1 = "Grab";
		String str2 = "Brag";
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if (str1.length() != str2.length()) {
			System.out.println("Not Anagram");
		} else {
			char c1[] = str1.toCharArray();
			char c2[] = str2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if (Arrays.equals(c1,c2)==true) {
				System.out.println("Both string are Anagram");
			} else {
				System.out.println("Both string are not Anagram");
			}
		}
		
		// Mtd 1: Call
//        isAnagram("Geeks", "Keegs");
	}
}