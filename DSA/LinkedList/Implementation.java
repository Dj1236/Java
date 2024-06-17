package DSA.LinkedList;

public class Implementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;

        void deleteAt(int idx){
            if(idx ==0){
                head = head.next;
                return;
            }
            Node temp = head ;
            for(int i =1;i<=idx-1;i++){
                temp = temp.next;

            }
            temp.next = temp.next.next;
            tail =temp;
        }

        int getElement(int idx){ //O(n)
            if (idx <0 || idx>size()){
                System.out.println("pikina sarki index nakh ne");
                return -1;
            }
            Node temp = head;
            for(int i =1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }

        void insertAt(int idx, int data){ // O(n)
            if (idx == size()) {
                insertAtEnd(data);
                return;
                
            }else if (idx ==0) {
                insertAtHead(data);
                return;
                
            }else if (idx <0 || idx>size()){
                System.out.println("pikina sarki index nakh ne");
            }
            Node t = new Node(data);
            Node temp = head;
            for(int i =1;i<=idx-1;i++){
                temp = temp.next;

            }
            t.next = temp.next;
            temp.next = t;
        }
        void insertAtHead(int data){ //O(n)
            Node temp = new Node(data);
            if(head==null){
                head = tail = temp;

            }
            else{
                temp.next =head;
                head = temp;
            }
            
        }
        void insertAtEnd(int data) {//O(n)
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println(); // To move to the next line after printing all node values
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5); // 4 -> 5
        System.out.println("Size: " + ll.size()); // Prints 2
        ll.display(); // Prints 4 5
        ll.insertAtEnd(6); // 4 -> 5 -> 6
        ll.display(); // Prints 4 5 6
        System.out.println("Size: " + ll.size()); // Prints 3
        ll.insertAtHead(3);
        ll.display();
    }
}
