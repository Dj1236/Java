package DSA.LinkedList;

public class DoublyLinkedListImplementation {

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static class DoublyLinkedList {
        Node head = null;
        Node tail = null;

        void deleteAt(int idx) {
            if (idx == 0) {
                head = head.next;
                if (head != null) {
                    head.prev = null;
                } else {
                    tail = null; // List became empty
                }
                return;
            }

            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }

            if (temp == tail) {
                tail = temp.prev;
                tail.next = null;
            } else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
        }

        int getElement(int idx) { // O(n)
            if (idx < 0 || idx >= size()) {
                System.out.println("Invalid index");
                return -1;
            }

            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }

            return temp.data;
        }

        void insertAt(int idx, int data) { // O(n)
            if (idx < 0 || idx > size()) {
                System.out.println("Invalid index");
                return;
            }

            if (idx == 0) {
                insertAtHead(data);
            } else if (idx == size()) {
                insertAtEnd(data);
            } else {
                Node newNode = new Node(data);
                Node temp = head;

                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }

                newNode.next = temp.next;
                newNode.prev = temp;
                temp.next.prev = newNode;
                temp.next = newNode;
            }
        }

        void insertAtHead(int data) { // O(1)
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        }

        void insertAtEnd(int data) { // O(1)
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
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
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtEnd(4);
        dll.insertAtEnd(5); // 4 <-> 5
        System.out.println("Size: " + dll.size()); // Prints 2
        dll.display(); // Prints 4 5
        dll.insertAtEnd(6); // 4 <-> 5 <-> 6
        dll.display(); // Prints 4 5 6
        System.out.println("Size: " + dll.size()); // Prints 3
        dll.insertAtHead(3); // 3 <-> 4 <-> 5 <-> 6
        dll.display(); // Prints 3 4 5 6
    }
}
