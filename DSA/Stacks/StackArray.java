package DSA.Stacks;

public class StackArray {
    public static class Stack {
        private int arr[]= new int[5];
        private int idx = 0;

        void push(int x){
            if (isFull()) {
                System.out.println("stack is full");
                return;
            }
            arr[idx]=x;
            idx++;
        }
        int peek (){
            if (idx==0) {
                System.out.println("stack is empty");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if (idx==0) {
                System.out.println("stack is empty");
                return-1;
                
            }
            int top = arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        void display(){
            for (int i = 0; i < idx-1; i++) {
                System.out.print(arr[i]+"");
                
            }
            System.out.println();
        } 
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(size()==0) return true;
            else return false;
        }
        boolean isFull(){
            if (idx==arr.length) return true;
            else return false;
        }
        int capacity(){
            return arr.length;
        }
    
        
    }
    public static void main(String[] args) {
        
    }
    
}
