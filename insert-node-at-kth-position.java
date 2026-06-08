class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {

    static Node head;

    public static void main(String[] args) {

        // Predefined Linked List
        head = new Node(5);
        head.next = new Node(10);
        head.next.next = new Node(15);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(25);

        int data = 12;
        int k = 3;

        
        Node newNode = new Node(data);
        
        
        Node temp = head ;
        for( int i = 1 ; i < 2  &&  temp != null ; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        
       
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
