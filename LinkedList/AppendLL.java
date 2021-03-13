public class AppendLL{
    Node head;
    Node newHead;
        Node newTail;
    class Node{
        int data;
        Node next;
        Node(int val){
            data = val;
            next = null;
        }
    }
    public void insertAtHead(int val){
        Node n = new Node(val);
        n.next = head;
        head = n;

    }
    public void insertAtTail(int val){
        Node n = new Node(val);
        // edge case where head is null
        if(head == null){
            insertAtHead(val);
            return;
        }
          
        // we need an iterator where we link all the nodes to traverse
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = n;
    }
    public void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public int length(Node head){
        int l = 0;
        Node temp = head;
        while(temp!=null){
         l++;
         temp = temp.next;
        }
        return l;
    }
  Node appendKNode(Node head,int k){
       /* Node newHead;
        Node newTail; */
        Node tail = head;
        int l = length(head);
        // if k is bigger than length 'l'
        k = k%l;
        int count = 1;
        while(tail.next!=null){
            if(count == l-k){
                newTail = tail;
            }
            if(count == l-k+1){
                newHead = tail;
            }
            tail = tail.next;
            count++;          
        }
        newTail.next = null;
        tail.next = head;
        return newHead;
    }
    public static void main(String args[]){
        AppendLL ll = new AppendLL();        
        int arr[] = {1,4,5,6,7};
        for(int i=0; i<5; i++)
            ll.insertAtTail(arr[i]);
            System.out.println("print the linked list:");
        ll.printList(ll.head);
        
     Node newHead = ll.appendKNode(ll.head, 3);
     System.out.println("After Append the Linked List:");
     ll.printList(newHead);
             }
}