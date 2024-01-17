package strings;

public class ReplaceSpaceWithSpecificChar {
	public static void main(String[] args) {
		String str1 = "my name is dinesh";
		char ch = '*';
		str1 = str1.replace(' ', ch);
		// str1 = str1.replaceAll("\\s+","-");
		System.out.println(str1);
	}
}