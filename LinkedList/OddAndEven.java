
public class OddAndEven {
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
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = n;
    }
    void oddEven(){
        Node odd = head;
        Node even = head.next;
        Node evenStart = even;
        while(odd.next != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenStart;
        if(odd.next != null){
            even.next = null;
        }
    }
    void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
    OddAndEven ll = new OddAndEven();
    int arr[] = {1,2,3,4,5,6};
    for(int i=0; i<6; i++)
        ll.insertAtTail(arr[i]);
    ll.display(ll.head);
    ll.oddEven();
    ll.display(ll.head);
}    
}
