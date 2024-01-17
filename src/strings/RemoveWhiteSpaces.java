package strings;

import java.util.Scanner;

// Remove white spaces from String

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string: ");
        String str = sc.nextLine();
//      String str = "Java is a programming language";

        // Method 1
        // using built-in method - replaceAll(string to be replaced, string to be replaced with) of String class
        /*
         * Note:
         * 1. This method removes spaces at the end, spaces at the beginning and spaces between the words.
         * 2. “\\s+” Vs “\\s” : Both of these strings, when passed to replaceAll() method, produce the same result with almost same performance. But, when the number of consecutive spaces increases, “\\s+” is slightly faster than “\\s”. Because, it replaces set of consecutive multiple spaces with the replacement string at a time rather than replacing one by one.
         * 3. trim() method trims the given string i.e it removes the white spaces at the beginning and at the end of a string, not between the words.
         * */
        // String strWithoutSpace = str.replaceAll("\\s", "");
        // System.out.println(strWithoutSpace);

        // Method 2
        // without using built-in method
        // first we convert the given input string to char array and then we traverse this array to find white spaces. We concatenate the characters which are not the white spaces to String object.
        char[] strarr = str.toCharArray();
        String strWithoutSpace = "";
        for (int i = 0; i < strarr.length; i++) {
            if ((strarr[i]!=' ') && (strarr[i]!='\t')) {
                strWithoutSpace += strarr[i];
            }
        }
        System.out.println(strWithoutSpace);
        sc.close();
    }
}
