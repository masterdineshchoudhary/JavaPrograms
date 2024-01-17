package number;

public class EvenOdd {
	public static void main(String[] args) {
		System.out.println("Even Numbers");
		for (int i = 1; i <= 100; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("\nOdd Numbers");
		for (int i = 1; i <= 100; i++) {
			if (i%2!=0) {
				System.out.print(i+" ");
			}
		}
		
		
//		int odd=0, even=0;
//		for (int i = 1; i < 100; i++) {
//            if(i%2==0){
//                System.out.println("even: "+i);
//            } else if (i%2!=0) {
//                System.out.println("odd "+i);
//            }
//        }
	}
}
