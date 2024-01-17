package number;

public class SquareRoot {
	public static void main(String[] args) {
		
		int n=25;
        double t, sqrtroot=n/2;
        do {
            t=sqrtroot;
            sqrtroot=(t+(n/t))/2;
        } while ((t-sqrtroot)!=0);
        System.out.println(sqrtroot);
		
//		int n=25;
//		int sqrtofn = (int) Math.sqrt(n);
//		System.out.println(sqrtofn);
	}
}
