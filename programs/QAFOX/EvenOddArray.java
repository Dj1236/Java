package programs.QAFOX;

public class EvenOddArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("below are the even number int this array");
        for (int i : arr) {
            if (i%2==0) {
                System.out.println(i);
                
            }
            
        }
        System.out.println("");
        System.out.println("below are the odd number in the array");
        for (int i : arr) {
            if (i%2!=0) {
                System.out.println(i);
                
            }
            
        }
    }
    
}
