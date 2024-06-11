package programs.QAFOX;

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        int arr[] = {9,8,7,5,4,3,6,2,1};
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number you want to search:");
        int search = scanner.nextInt();
        scanner.close();
        Boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if(search==arr[i]){
                System.out.println("the search element is found at the index "+i);
                found = true ;
                break;
            }
        }
        if (!found) {
            System.out.println("element not found in the array");
            
        }
    }
    
}
