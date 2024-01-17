package number;

public class LargestOf3Number {
	public static void main(String[] args) {
		int n1=59, n2=41, n3=39;
		if (n1>n2 || n1>n3) {
			System.out.println("n1 is greater " + n1);
		} else if (n2>n3) {
			System.out.println("n2 is greater " + n2);
		} else {
			System.out.println("n3 is greater");
		}
		
		int temp = n1>n2?n1:n2;
		int largest = n3>temp?n3:temp;
		System.out.println(largest);
	
	}
}
