package TwoDarray;

public class SpiralMatrix {
    public static void main(String[] args) {
        
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
