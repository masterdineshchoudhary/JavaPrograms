package pattern;

import java.util.Scanner;

public class NumberPattern {
  public static void main(String[] args) {
	  
    // Pattern 1
    // for(int i=1; i<=9; i++) {
    //   for(int j=1; j<=i; j++) {
    //     System.out.print(i);
    //   }
    //   System.out.println();
    // }

    // Pattern 2
    for(int i=9; i>=1; i--) {
      for(int j=9; j>=1; j--) {
        System.out.print(" ");
      }
      for(int j=1; j<=i; j++) {
        System.out.print(i+" ");
      }
      System.out.println();
    }
    
    // Pattern 3
    Scanner sc = new Scanner(System.in);
    int noOfRows = sc.nextInt();
    int rowCount = 1;
    for (int i=noOfRows; i>0; i--){
        for (int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for (int j=i;i<=rowCount;j++){
            System.out.println(rowCount+" ");
        }
        System.out.println();
        rowCount++;
    }
  }
}