package number;

public class SumOfAllDigitsOfNumber {
    /*   Mtd 1:   Java Program To Find The Sum Of All Digits Of A Number In Java
    static void sumOfDigit(int num){
        int copynum = num;
        int sum = 0;
        while (copynum!=0){
            int lastdigit = copynum%10;
            sum = sum + lastdigit;
            copynum = copynum/10;
        }
        System.out.println(num+" = "+sum);
    }
    */
    // Mtd 2: Recursive mtd
    int sum=0;
    int sumOfDigit(int num){
        if (num==0){
            return sum;
        } else {
            int lastdigit = num%10;
            sum = sum+lastdigit;
            num = num/10;
            sumOfDigit(num);
        }
        return sum;
    }


    public static void main(String[] args) {
//        sumOfDigit(555);    Mtd 1
//      Mtd 2:
    	SumOfAllDigitsOfNumber main = new SumOfAllDigitsOfNumber();
        System.out.print(555+" = ");
        System.out.print(main.sumOfDigit(555));
    }
}
