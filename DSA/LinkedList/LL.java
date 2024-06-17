package DSA.LinkedList;
// compare to array in liked list insertion is easy compare to array 
// one of the major limitation of the single linked list is that we cant traverse back only traverse in forward direction
public class LL {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;

        }
        // length of linked list 
        public static int length(Node head){
            int count =0;
            while (head!=null) {
                count++;
                head=head.next;
            }
            return count;
        }
        // reverse print 
        public static void Reverse(Node head){
            if(head == null) return;
            Reverse(head.next);
            System.out.println(head.data); // chele thi print karse
        }
        // this function is calling recursively
        public static void displayR(Node head){
            if (head==null) return;
            System.out.println(head.data);
            displayR(head.next);
        }
        public static void display(Node head){
            while (head != null) {
                System.out.println(head.data + " ");
                head = head.next;
                
            }
        }
    
        
    }
    public static void main(String[] args) {
        Node n = new Node(5);
        System.out.println(n.data);// ama data avvse 
        System.out.println(n.next);// aama null avse karnke point nath kartu 
        Node a = new Node(5);
        Node b = new Node(6); 
        Node c = new Node(7);
        Node d = new Node(8); 
        Node e = new Node(8);
        
        System.out.println(a.next);// address of b haise aama pan atyare toh null aaj aavse
        a.next = b;// have a pase b no address avio  
        b.next = c;
        c.next = d;
        d.next = e; 
        // now linked list is connected
        Node temp = a;
        for(int i =1;i<=5;i++){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
    
}
