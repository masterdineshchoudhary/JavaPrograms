package basic;
// Armstrong n is a positive m-digit n that is equal to the sum of the mth powers of their digits. 

// It is also known as pluperfect, or Plus Perfect,
// There is no two-digit Armstrong n.
// eg: 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407
// Ex: 153: 13 + 53 + 33 = 1 + 125+ 27 = 153
// Ex: 125: 13 + 23 + 53 = 1 + 8 + 125 = 134 (not arms)

public class Armstrong {

//	static boolean isArms(int n){
//        int temp, digits=0, last=0, sum=0;
//        temp=n;
//        while (temp>0) {
//            temp=temp/10;
//            digits++;
//        }
//        temp=n;
//        while (temp>0) {
//            last = temp%10; // determines last digit
//            sum += Math.pow(last, digits); //calculates the power of a n up to digit times and add the resultant to the sum variable  
//            temp = temp/10; // removes last digit
//        }
//        if(n==sum) {return true; } else return false;
//    }

	public static void main(String[] args) {
		int n = 153, temp = n, sum = 0, lastDigit, lastDigitToThePowerOfNoOfDigits;
		int noOfDigits = String.valueOf(n).length();
		while (temp != 0) {
			lastDigit = temp % 10;
			lastDigitToThePowerOfNoOfDigits = 1;
			for (int i = 0; i < noOfDigits; i++) {
				lastDigitToThePowerOfNoOfDigits = lastDigitToThePowerOfNoOfDigits * lastDigit;
			}
			sum = sum + lastDigitToThePowerOfNoOfDigits;
			temp = temp / 10;
		}

		if (sum == n) {
			System.out.println(n + " is armstrong");
		} else {
			System.out.println(n + " is not armstrong");
		}

//		// checks for a specified limit range
//		int num = 200;
//        System.out.println("Arms upto "+num+" are: ");
//        for (int i = 0; i <=num; i++) {      
//            if (isArms(i)) {
//                System.out.print(i+" ");
//            }
//        }
//        System.out.println();
//
//        // checks for given no
//        int no = 153;
//        if (isArms(no)) {  System.out.println("arms");
//        } else { System.out.println("not arms"); }
	}
}
