package DSA.Stacks;

// import java.util.Scanner;
import java.util.Stack;

public class Q1 {
    public static void main(String[] args) {
        // move one stack elements to another in same order
        // Scanner scanner = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        Stack<Integer> gt = new Stack<>();
        while (st.size()>0) {
            // int x = st.peek();
            gt.push(st.pop());
            // st.pop();
            
        }
        System.out.println(gt);

        Stack<Integer> rt = new Stack<>();
        while (gt.size() > 0) {
            // int x = st.peek();
            rt.push(gt.pop());
            // st.pop();

        }
        System.out.println(rt);

    }        

    //     int n;
    //     System.out.println("enter the number of element you want to insert:");
    //     n = scanner.nextInt();
    //     System.out.println("enter the number of element:");
    //     for(int i =1;i<=n;i++){
    //         int x = scanner.nextInt();
    //         st.push(x);


    //     }
    //     System.out.println(st);
    // }
    
}
