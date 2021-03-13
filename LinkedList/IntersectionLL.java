public class IntersectionLL{
    Node head;
    Node head1;
    Node head2;
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
        Node n = new Node(val);
        if(head == null){
            insertAtHead(val);
            return;
        }
        Node temp = head;
        while(temp.next!= null){
            temp = temp.next;
        }
        temp.next = n;
    }
    int length(Node head){
        int l = 0;
        Node temp = head;
        while(temp != null){
            l++;
            temp = temp.next;
        }
        return l;
    }
    public Node intersection(){
        int len1 = length(head1);
        int len2 = length(head2);
        int d = 0;
        Node temp1;
        Node temp2;
        if(len1 > len2){
            d = len1 - len2;
            temp1 = head1;
            temp2 = head2;
        }else{
            d = len2 - len1;
            temp1 = head2;
            temp2 = head1;
        }
        for(int i=0; i<d; i++){
            temp1 = temp1.next;
            if(temp1 == null){
                return null;
            }
        }
        while(temp1 != null && temp2 != null){
            if(temp1 == temp2){
                return temp1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }
    void intersect(int pos){
        Node temp1 = head1;
        for(int i=0; i<pos; i++){
            temp1 = temp1.next;
        }
        Node temp2 = head2;
        while(temp2.next != null){
            temp2 = temp2.next;
        }
        temp2.next = temp1;
    }
    void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        IntersectionLL ll = new IntersectionLL();
        ll.insertAtTail(1);
        ll.insertAtTail(2);
        ll.insertAtTail(3);
        ll.insertAtTail(4);
        ll.printList(ll.head);
        ll.insertAtHead(5);
        ll.printList(ll.head);
        ll.intersect(5);
        ll.printList(ll.head);
    }
}