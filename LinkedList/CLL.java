
public class CLL {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int val){
            data = val;
            next = null;
        }
    }
    void insertAtHead(int val){
        Node n = new Node(val);
        if(head == null){
            n.next = n;
            head = n;
            return;
        }
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = n;
        n.next = head;
        head = n;
    }
    void insertAtTail(int val){
        if(head == null){
            insertAtHead(val);
            return;
        }
        Node n = new Node(val);
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = n;
        n.next = head;
    }
    void display(Node head){
        Node temp = head;
       do{
           System.out.print(temp.data +"->");
                   temp = temp.next;
       }while(temp != head);
        System.out.println("null");
    }
public static void main(String args[]){
    CLL ll = new CLL();
    int arr[] = {1,2,3,4,5};
    for(int i=0; i<5; i++)
    ll.insertAtTail(arr[i]);
    ll.display(ll.head);
    ll.insertAtHead(7);
    ll.display(ll.head);
}    
}
