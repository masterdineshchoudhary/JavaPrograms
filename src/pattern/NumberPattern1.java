package pattern;

import java.util.Scanner;

// Pyramid of Numbers

public class NumberPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows");
        int noOfRows = sc.nextInt();
        int rowCount = 1;
        for (int i = noOfRows; i > 0 ; i--) {
        	// printing i spaces at beginning of each row
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // printing rowCount value rowCount times at the end of each row
            for (int j = 1; j <= rowCount; j++) {
                System.out.print(rowCount+" ");
            }
            System.out.println();
            // incrementing rowCount
            rowCount++;
            sc.close();
        }
    }
}
