package programs.QAFOX;

public class FindDuplicate {
    public static void main(String[] args) {
        int arr[] = {1,5,4,1,2,6,2,8,3,5,4};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    System.out.println(arr[i]+"is duplicate ");
                    
                }
                
            }
            
        }
    }
    
}
