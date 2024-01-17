package strings;

// Java Program to Count the Total Number of Punctuation Characters Exists in a String

public class TotalNoOfPunctuationChar {
	public static void main(String[] args) {
		String string = "He said, 'The mailman loves you.' I heard it with my own ears. ?"; 
		int count = 0;
		for (int i=0; i<string.length(); i++) {
			if (string.charAt(i)==',' || string.charAt(i)=='.' ||string.charAt(i)=='?') {
				count++;
			}
		}
		System.out.println("Total Punctuation marks: "+ count);
	}
}