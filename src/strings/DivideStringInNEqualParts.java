package strings;

public class DivideStringInNEqualParts {
	public static void main(String[] args) {
		String str="aaaabbbbcccc";
		int n=3, temp=0, len=str.length(), chars=len/n;
		String equalStr[] = new String[n];
		if (len%n!=0) {
			System.out.println("Not Possible");
		} else {
			for (int i=0; i<len; i=i+chars) {
				String part = str.substring(i,i+chars);
				equalStr[temp] = part;
				temp++;
			}
			System.out.println(n+" equals parts of a string are :");
			for(int i=0; i<equalStr.length; i++) {
				System.out.println(equalStr[i]);
			}
		}
 
	}
}