package basic;
// Factorial of n is the product of all positive descending integers
// 4 = 4*3*2*1 = 24

public class Factorial {
	
	static int factorial(int n){
        if(n==0){ return 1; }
        else { return n*factorial(n-1); }
    }
	
	public static void main(String[] args) {
		int num = 5, fact=1;
//		while (num>0) {
//			fact = fact * num;
//			num--;
//		}
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial is "+ fact);
		
		// method call
		fact = factorial(num);
        System.out.println("Factorial is : "+fact);
	}
}
