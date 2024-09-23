package TwoDarray;

import java.util.Scanner;

public class AddTwoMatrix {
    public static void printMatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
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
        add(a, r1, c1, b, r2, c2);
    }
    static void add(int [][]a,int r1,int c1,int [][] b,int r2,int c2){
        if (r1!=r2 || c1!=c2) {
            System.out.println("addition is not possible Wrong Input !!");
            return;
        }
        int sum [][] = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j]= a[i][j]+b[i][j];
            }
        }
        System.out.println("matrix 1:");
        printMatrix(a);
        System.out.println("matrix 2:");
        printMatrix(b);
        System.out.println("sum of two matrix is :");
        printMatrix(sum);
        

    }
}
