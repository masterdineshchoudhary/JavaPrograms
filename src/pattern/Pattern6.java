package pattern;

import java.util.Scanner;

// package Pyramid of Numbers;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows");
        int noOfRows = sc.nextInt();
        int rowCount = 1;
        for (int i = noOfRows; i > 0 ; i--) {
            for (int j = 1; j <= i*2; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= noOfRows; j++) {
                System.out.print(j+" ");
            }
            for (int j = noOfRows-1; j >= i; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
            rowCount++;
            sc.close();
        }
    }
}
