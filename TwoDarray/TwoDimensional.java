package TwoDarray;

import java.util.Scanner;

public class TwoDimensional {
    public static void main(String[] args) {
        /*
         * arrays under an arrays are called as multi dimensional array .
         * 
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of rows :");
        int r = scanner.nextInt();
        System.out.println("enter number of columns :");
        int c = scanner.nextInt();

        int arr[][] = new int[r][c];
        System.out.println("enter " + r * c + " elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        printArray(arr);
        // arr[0][0]=1;
        // arr[0][1]=2;
        // arr[0][2]=3;
        // arr[1][0]=4;
        // arr[1][1]=5;
        // arr[1][2]=6;
        // arr[2][0]=7;
        // arr[2][1]=8;
        // arr[2][2]=9;
        // printArray(arr);

        /*
         * int arr2[][]={{1,2,3},
         *              {4,5,6},
         *              {7,8,9}};
         */
    }
    static void printArray(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
