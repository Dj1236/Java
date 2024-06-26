package DSA.Stacks;

public class Q3 {
    public static void displayRev(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        System.out.print(top+"");
        displayRev(st);
        st.push(top);

    }
    
    public static void display(Stack<Integer> st) {
        if (st.size() == 0) return;
        int top = st.pop();
        display(st);
        System.out.print(top + "");
        st.push(top);

    }
    

    public static void main(String[] args) {
        // display stack recursively
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        
        display(st);


    }
    
}
