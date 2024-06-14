package programs.QAFOX.Patterns;


public class RightPyramid {
    public static void main(String[] args) {
        for( int i =1;i<=4;i++){
            for(int j=1;j<=i;j++){ // amaa j =4 aane j>=i j-- hoi toh reverse thai jai
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
