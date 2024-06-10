package programs.QAFOX;

public class CompareTwoArray {
    public static void main(String[] args) {
        int arr1[]= {1,2,3,4,5,6};
        int arr2[]= {1,2,3,4,5,6};

        if(arr1.length==arr2.length){
            System.out.println("arrays are not equal");
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] !=arr2[i]){
                System.out.println("not equal");
                break;

            }else{
                System.out.println("equal");
            }        
        }
    }
    
}
