/*
 * class ll{
 *  class node{
 *    string data;
 *    node next; 
 *   
 *     Node (string data){
 *      this.data = data;
 *      this.next = null; 
 * }
 *
 *  * }
 * }
 */




package DSA.LinkedList;

class SinglyLinkedList {
    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the list
    private Node head;

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    // Delete by key
    public void deleteByKey(int key) {
        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Change head
            return;
        }

        // Search for the key to be deleted
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in the list
        if (temp == null) return;

        // Unlink the node from the linked list
        prev.next = temp.next;
    }

    // Search for a key in the list
    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) return true;
            current = current.next;
        }
        return false;
    }

    // Traverse the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method to demonstrate the list operations
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Insertions
        list.insertAtBeginning(10);
        list.insertAtEnd(20);
        list.insertAtBeginning(5);
        list.insertAtEnd(30);

        // Print list
        System.out.println("List after insertions:");
        list.printList();

        // Search
        System.out.println("Searching for 20: " + list.search(20));
        System.out.println("Searching for 40: " + list.search(40));

        // Deletion
        list.deleteByKey(20);
        System.out.println("List after deleting 20:");
        list.printList();

        list.deleteByKey(5);
        System.out.println("List after deleting 5:");
        list.printList();
    }
}
