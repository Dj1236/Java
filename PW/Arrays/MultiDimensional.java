package PW.Arrays;

public class MultiDimensional {

    static void printSpiralOrder(int matrix[][], int r, int c) {
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int totalElements = 0;

        while (totalElements < r * c) {
            // toprow => leftcol to rightcol
            for (int j = leftCol; j <= rightCol; j++) {
                System.out.print(matrix[topRow][j]);
                totalElements++;

            }
            topRow++;

            // rightcol => toprow to bottom col
            for (int i = topRow; i <= bottomRow; i++) {
                System.out.print(matrix[i][rightCol]);
                totalElements++;

            }
            rightCol--;

            // bottom row => rightcol to leftcol
            for (int j = bottomRow; j >= leftCol; j++) {
                System.out.print(matrix[bottomRow][j]);
                totalElements++;

            }
            bottomRow--;

            // left col => bottom row to topRow
            for (int i = bottomRow; i >= topRow; i++) {
                System.out.print(matrix[i][leftCol]);
                totalElements++;

            }
            leftCol++;

        }
    }
    
    static int[][] transpose(int[][] matrix, int rows, int cols) {
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }
    static void multiply(int [][]a,int r1,int c1,int [][] b,int r2,int c2){
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
    }
    public static void main(String[] args) {
        
    }
    
}
