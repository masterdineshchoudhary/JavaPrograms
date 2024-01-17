package basic;

import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int row = sc.nextInt();
        System.out.print("Enter no of cols : ");
        int cols = sc.nextInt();
        int[][] matrix1 = new int[row][cols];
        int[][] matrix2 = new int[row][cols];
        int[][] sum = new int[row][cols];
        int[][] sub = new int[row][cols];
        int[][] mul = new int[row][cols];
        int[][] tramspose = new int[cols][row];

        System.out.println("Enter matrix 1 data : ");
        for (int i=0; i<row; i++){
            for (int j=0;j<cols;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter matrix 2 data : ");
        for (int i=0; i<row; i++){
            for (int j=0;j<cols;j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix 1 is : ");
        for (int i=0; i<row; i++){
            for (int j=0;j<cols;j++){
                System.out.print(matrix1[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("matrix 2 is : ");
        for (int i=0; i<row; i++){
            for (int j=0;j<cols;j++){
                System.out.print(matrix2[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("SUM of Matrix is : ");
        for (int i=0; i<row; i++){
            for (int j=0;j<cols;j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("SUB of Matrix is : ");
        for (int i=0; i<row; i++){
            for (int j=0;j<cols;j++){
                sub[i][j] = matrix1[i][j] - matrix2[i][j];
                System.out.print(sub[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("MUL of Matrix is : ");
        for (int i=0; i<row; i++){
            for (int j=0;j<cols;j++){
                mul[i][j] = matrix1[i][j] * matrix2[i][j];
                System.out.print(mul[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("TRANSPOSE of Matrix is : ");
        for (int i=0; i<row; i++){
            for (int j=0;j<cols;j++){
                tramspose[j][i] = matrix1[i][j];
                System.out.print(tramspose[j][i]+"\t");
            }
            System.out.println();
        }
    }
}
