package TwoDarray;

import java.util.Scanner;


public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter for first matrix:");
        System.out.println("enter number of rows :");
        int r1 = scanner.nextInt();
        System.out.println("enter number of columns :");
        int c1 = scanner.nextInt();

        int [][] a = new int[r1][c1];
        System.out.println("enter  " + r1 * c1 + " elements");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("enter for the second matrix:");
        System.out.println("enter number of rows :");
        int r2 = scanner.nextInt();
        System.out.println("enter number of columns :");
        int c2 = scanner.nextInt();

        int b[][] = new int[r2][c2];
        System.out.println("enter " + r2 * c2 + " elements");

        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = scanner.nextInt();
            }
        }
        scanner.close(); 
        multiply(a, r1, c1, b, r2, c2);
    }
    public static void multiply(int [][]a,int r1,int c1,int [][] b,int r2,int c2){
        if (c1!=r2) {
            System.out.println("multiplication is not possible ");
            return;
        }
        int mul[][] = new int[r1][c2];
        
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += a[i][k] *b[k][j]; 
                }
            }
        }
        System.out.println("multiplication of two matrixes ");
        printMatrix(mul);
        
    }
    public static void printMatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
}
}