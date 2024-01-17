package number;

//import java.util.Scanner;

// Prime number is a number that is greater than 1 and divided by 1 or itself only.
// For example 2, 3, 5, 7, 11, 13, 17....
// 0 and 1 are not prime numbers. 
// 2 is the only even prime number because all the other even numbers can be divided by 2.

public class PrimeNumber {
	
	static void chkPrime(int n){
        int i, m=n/2, flag=0;
        if (n==0 || n==1) { System.out.println("not prime"); 
        } else {
            for ( i = 2; i <= m; i++) {
            	if(n%i==0) {
            		System.out.println("not prime");
                    flag=1;
                    break;
            	}
            }
        }
        if (flag==0) { System.out.println("is prime"); }
    }
	
	
	public static boolean isPrime(int n){
        if (n<=1) { 
        	return false; 
        } else {
//        	for (int i = 2; i <= Math.sqrt(n); i++) {
        	for (int i = 2; i <= n/2; i++) {
                if (n%i==0) { return false; }
            }
        }
        return true;
    }
	
	
	public static void main(String[] args) {
		int num = 11, count = 0;
		for (int i = 2; i < num-1; i++) {
			if (num%i==0) {
				count++;
			}
		}
		if (count>0) {
			System.out.println(num + " is Not Prime Number");
		} else {
			System.out.println(num + " is Prime Number");
		}
		
		
		chkPrime(3);
		chkPrime(4);
		
		if (isPrime(18)) {
			System.out.println("Prime");
		} else {
			System.out.println("Not prime");
		}
		
	}
}
