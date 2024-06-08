package programs.Sprograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ComparisonOfArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 4};
        boolean comparsionStatus = true;
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    comparsionStatus = false;
                    break;
                    }
                    }

        }else{
            comparsionStatus = false;
            System.out.println("both the arrays are not equal");
        }
        if (comparsionStatus) {
            System.out.println("both the arrays are equal");
        }
        // if (Arrays.equals(a,b)){
        //     System.out.println("Arrays are equal");
        // }
        // else{
        //     System.out.println("Arrays are not equal");
        //     }

    }
    
}
