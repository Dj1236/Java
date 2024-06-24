package DSA.Stacks;

import java.util.*;

public class Stack<T> {
    private LinkedList<T> list = new LinkedList<>();

    // Push element onto the stack
    public void push(T element) {
        list.addFirst(element);
    }

    // Pop element from the stack
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.removeFirst();
    }

    // Peek at the top element without removing it
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.getFirst();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Get the size of the stack
    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        // Sample usage
        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Top element is: " + st.peek()); // Should print 30
        System.out.println("Stack size is: " + st.size()); // Should print 3

        System.out.println("Popped element is: " + st.pop()); // Should print 30
        System.out.println("Top element after pop is: " + st.peek()); // Should print 20
        System.out.println("Stack size after pop is: " + st.size()); // Should print 2

        System.out.println("Is stack empty? " + st.isEmpty()); // Should print false
        st.pop();
        st.pop();
        System.out.println("Is stack empty after popping all elements? " + st.isEmpty()); // Should print true
    }
}
