public class DLL{
   Node head;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int val){
            data = val;
            next = null;
            prev = null;
        }
    }

public void insertAtHead(int val){
    Node n = new Node(val);
    n.next = head;
    if(head !=null){
        head.prev = n;
    }
    head = n;
}

public void insertAtTail(int val){
    Node n = new Node(val);
    Node temp = head;
    // edge case when head is null
    if(head == null){
        insertAtHead(val);
        return;
    }
    while(temp.next!= null){
        temp = temp.next;
    }    
    temp.next = n;
    n.prev = temp;
}

public void display(Node head){
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.data +"->");
        temp = temp.next;
    }
    System.out.println("Null");
}
    public static void main(String args[]){
        DLL d = new DLL();
       // Node head;
        d.insertAtTail(1);
        d.insertAtTail(2);
        d.insertAtTail(3);
        d.insertAtTail(4);
        System.out.println("Insert At Tail");
        d.display(d.head);
        d.insertAtHead(5);
        System.out.println("Inserta At Head");
        d.display(d.head);
    }
}