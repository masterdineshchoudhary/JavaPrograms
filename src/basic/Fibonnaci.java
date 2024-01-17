package basic;
// next number is the sum of previous two numbers
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. 
// The first two numbers of series are 0 and 1.

import java.util.Scanner;

public class Fibonnaci {
//	public static void main(String[] args) {
//		int n1 = 0, n2 = 1, n3, count = 10;
//		System.out.print(n1 + " " + n2);
//		for (int i = 2; i < count; i++) {
//			n3 = n1 + n2;
//			System.out.print(" " + n3);
//			n1 = n2;
//			n2 = n3;
//		}
//	}

// fibonacci prog upto max value
//	 public static void main(String args[]) {
//	 int x=0,y=1,z=0,n;
//	 Scanner sc = new Scanner(System.in);
//	 System.out.print("Enter MAX Value :");
//	 n = sc.nextInt();
//	 while (z<=n) {
//	 System.out.print(z+" ");
//	 x=y;
//	 y=z;
//	 z=x+y;
//	 }
//	 sc.close();
//	 }

// fibonacci prog upto n terms
//	 public static void main(String args[]) {
//	 int x=0,y=1,z=0,n,count=1;
//	 Scanner sc = new Scanner(System.in);
//	 System.out.print("Enter n Value :");
//	 n = sc.nextInt();
//	 while (count<=n) {
//	 System.out.print(z+" ");
//	 x=y;
//	 y=z;
//	 z=x+y;
//	 count++;
//	 }
//	 sc.close();
//	 }

	
	
// fibonacci upto n terms - RECURSION
//	static int n1=0,n2=1,n3;
//    static void fib(int count) {
//        if(count>0){
//            n3=n1+n2;
//            n1=n2;
//            n2=n3;
//            System.out.print(" "+n3);
//            fib(count-1);
//        }
//    }
//    public static void main(String[] args) {
//        int count=10;
//        System.out.print(n1+" "+n2);
//        fib(count-2);
//    }



// Given a number n, print n-th Fibonacci Number. (using recursion)
// if n = 0, n=1 fib() should return n. 
// For n > 1, it should return Fn-1 + Fn-2

// static int fib(int n){
//     if (n<=1) {
//         return n;
//     }
//     return fib(n-1) + fib(n-2);
// }
// public static void main(String[] args) {
//     int n=1;
//     System.out.print(fib(n));
// }
}