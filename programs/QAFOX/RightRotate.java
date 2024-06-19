package programs.QAFOX;

import java.util.Arrays;

public class RightRotate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int size = arr.length;
        int last = arr[arr.length-1];
        for(int i = size-1;i>0;i--){
            arr[i]=arr[i-1];


        }
        arr[0]=last;
        System.out.println(Arrays.toString(arr));


    }
    
}
