package number;

public class ReverseNumber {
	
	public static void revNum(int num) {
		if (num<10) {
			System.out.println(num);
			return;
		} else {
			System.out.print(num%10);
			revNum(num/10);
		}
	}
	
	public static void main(String[] args) {
//		int number = 146, rem, rev=0, temp = number;
//		while(temp>0) {
//			rem = temp % 10;
//			rev = rev*10 + rem;
//			temp = temp/10;
//		}
//		System.out.println("Reverse : "+rev);
		
//		int n=1234,r,rev=0;
//        while(n!=0){
//            r=n%10;
//            rev=rev*10+r;
//            n=n/10;
//        }
//        System.out.println(rev);
		
		// for-loop
		int num=1234, rev=0, rem;
		for(; num!=0; ) {
			rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
		System.out.println(rev);
		
		revNum(158);
	}
}
