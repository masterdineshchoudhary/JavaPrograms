package strings;

import java.util.Arrays;
public class StringPalindrome {
	public static void main(String[] args) {
		String str = "iKI";
		// str = str.toLowerCase();
		String revStr = new String(str);
		char charStr[] = str.toCharArray();
		for (int i=0; i<charStr.length; i++) {
			System.out.print(charStr[i]);
		}
		
//		revStr = Arrays.reverse(str);
		System.out.println(revStr);
	}
}

//String str = "manam";
//String temp = str;
//char strArr[] = str.toCharArray();
//String rev ="";
//for(int i = strArr.length-1; i>=0; i--) {
//    rev = rev + strArr[i];
//}
//System.out.println(rev);
//System.out.println(temp);
//
//if(rev.equals(temp)) {
//    System.out.println("Palindrome");
//} else {
//    System.out.println("Not Palindrome");
//}