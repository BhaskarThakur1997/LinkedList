
public class MergeLL {
    Node head;
    Node head1;
    //Node head2;
    class Node{
        int data;
        Node next;
        Node(int val){
            data = val;
            next = null;
        }
    }
    void insertAtHead(Node head,int val){
        Node n = new Node(val);
        n.next = head;
        head = n;
    }
    void insertAtTail(Node head,int val){
        Node n = new Node(val);
        if(head==null){
            insertAtHead(head,val);
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = n;   
    }
    void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    Node mergeRecursive(Node head, Node head1){
        if(head==null){
            return head1;
        }
        if(head1==null){
            return head;
        }
        Node result;
        if(head.data < head1.data){
            result = head;
            result.next = mergeRecursive(head.next, head1);
        }else{
            result = head1;
            result.next = mergeRecursive(head, head1.next);
        }
        return result;
    }
public static void main(String args[]){
    MergeLL ll = new MergeLL();
    int arr1[] = {1,4,5,7};
    int arr2[] = {2,3,6};
    for(int i=0; i<4; i++){
        ll.insertAtTail(ll.head,arr1[i]);
    }
    
    for(int i=0; i<3; i++){
        ll.insertAtTail(ll.head1,arr2[i]);
    }
    System.out.println("print arr1:");
    ll.printList(ll.head);
   System.out.println("print arr2:");
   ll.printList(ll.head1);

    //Node newHead = ll.mergeRecursive(ll.head1, llhead2);
    // ll.printList(newHead);

}    
}

