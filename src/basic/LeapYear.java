package basic;
import java.util.Scanner;
// leap year - 2024, 2028, 2096

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year : ");
		int year = sc.nextInt();
		boolean isLeap = false;
		if (year%4==0) {
			if (year%100==0) {
				if (year%400==0) {
					isLeap = true;
				} else {
					isLeap = false;
				}
			} else {
				isLeap = true;
			}
		} else {
			isLeap = false;
		}
		
		if (isLeap) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}
	}
}
