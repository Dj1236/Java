package searching;

public class EvenDigitInArray {
    public static void main(String[] args) {
        int arr[]={18,124,9,7,98,1};
        int count = 0;
        int num = 78956;
        System.out.println((int)Math.log10(num)+1);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
