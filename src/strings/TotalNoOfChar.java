package strings;

// Java Program to count the total number of characters in a string

public class TotalNoOfChar {
	public static void main(String[] args) {
		String string = "Hello my name is Dinesh";
        System.out.println(string);
        int count = 0;
        for (int i=0; i<string.length(); i++) {
            if (string.charAt(i)!=' ') {
                count++;
            }
        }
        System.out.println("Toatl number of chars in a string is : " + count);
	}
}