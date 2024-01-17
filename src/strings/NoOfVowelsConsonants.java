package strings;

public class NoOfVowelsConsonants {
	public static void main(String[] args) {
		String str = "My name is Java";
		str = str.toLowerCase();
		int v=0, c=0;
		for(int i=0; i<str.length(); i++) {
			if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				v++;
// 			} else if(str.charAt(i)) {
 				c++;
 			}
		}
		System.out.println("vowels count = " + v);
		System.out.println("consonants count = " + c);
	}
}