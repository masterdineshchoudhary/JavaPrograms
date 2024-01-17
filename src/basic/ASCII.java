package basic;

import java.util.Scanner;

public class ASCII {
	public static void main(String[] args) {
	// two ways to print ASCII value in Java:
	// 1. Assigning a Variable to the int Variable
		char c1 = 'a';
		char c2 = 'A';
		int valueC1 = c1;
		int valueC2 = c2;
		System.out.println(valueC1);
		System.out.println(valueC2);
		
		// alternative to above way
		int ch1 = 'a';
		int ch2 = 'A';
		System.out.println(ch1);
		System.out.println(ch2);
		
	// 2. Using Type-Casting
		char chr1 = 'a';
		char chr2 = 'A';
		int valueChr1 = (int) chr1;
		int valueChr2 = (int) chr2;
		System.out.println(valueChr1);
		System.out.println(valueChr2);
		
	// Taking Input from the user
		System.out.println("Enter a character : ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		int asciiValue = ch;
		System.out.println(asciiValue);
		sc.close();
		
	}
}
