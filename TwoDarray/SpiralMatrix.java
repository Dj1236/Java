package TwoDarray;

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of matrix:");
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int [][] matrix = new int[r][c];
        int total = r*c;
        System.out.print("enter"+total+"values");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <c; j++) {
                matrix[i][j] =scanner.nextInt();
            }
        }
        scanner.close();
        System.out.println("input matrix ");
        printMatrix(matrix);
        System.out.println("print spiral order:");
        printSpiralOrder(matrix, r, c);


        
    }
    static void printMatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void printSpiralOrder(int  matrix[][],int r , int c){
        int topRow =0 , bottomRow =r-1, leftCol =0 , rightCol=c-1;
        int totalElements =0;

        while (totalElements<r*c) {
            //toprow => leftcol to rightcol
            for(int j=leftCol;j<=rightCol;j++){ 
                System.out.print(matrix[topRow][j]);
                totalElements++;


            }topRow++;

            // rightcol => toprow to bottom col
            for(int i = topRow;i<=bottomRow;i++){
                System.out.print(matrix[i][rightCol]);
                totalElements++;

            } rightCol--;

            //bottom row => rightcol to leftcol
            for(int j =bottomRow;j>=leftCol;j++){
                System.out.print(matrix[bottomRow][j]);
                totalElements++;

            }bottomRow--;


            //left col => bottom row to topRow
            for(int i =bottomRow;i>=topRow;i++){
                System.out.print(matrix[i][leftCol]);
                totalElements++;

            }leftCol++;

        }
    }
}
