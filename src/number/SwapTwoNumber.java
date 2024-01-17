package number;

public class SwapTwoNumber {
	public static void main(String[] args) {
		int a=5, b=10,temp;
		System.out.println(a+" "+b);
		
		// using bitwise operator
//		a=a^b;
//		b=a^b;
//		a=a^b;
//		System.out.println(a+" "+b);
		
		// using temp var
		temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
	}
}
