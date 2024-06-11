package programs.QAFOX;

public class MissingElementArrays {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6};
        // sum without miss
        int sumWithoutMiss =0;
        for(int i =1;i<=6;i++){
            sumWithoutMiss = sumWithoutMiss+i;
        }
        // sum with miss 
        int sumWithMiss =0;
        for (int i : arr) {
            sumWithMiss =sumWithMiss+i;  
        }
        System.out.println("the missing element in this array is"+(sumWithoutMiss-sumWithMiss));
    }
    
}
