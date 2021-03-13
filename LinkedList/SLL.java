public class SLL {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next = null;
        }
    }
    
    public void insertAtHead(int val){
        Node n = new Node(val);
        n.next = head;
        head = n;
    }
    public void insertAtPosition(int val, int pos){
        Node n = new Node(val);
        Node temp = head;
        int count = 1;
        while(temp != null){
            if(count == pos){
               n.next = temp.next;
                temp.next = n;
                break;
            }
            count++;
            temp = temp.next;
        }
       // return head;
    }
    public void inserAtTail(int val){
        Node n = new Node(val);
        // edge case when head is null
        if(head == null){
            head = n;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = n;
    }
    
    public  void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public boolean search(int key){
        Node temp = head;
        while(temp!=null){
            if(temp.data==key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
public static void main(String args[]){
    SLL s = new SLL();
   /* s.inserAtTail(1);
    s.inserAtTail(2);
    s.inserAtTail(3);
    s.inserAtTail(4);
    System.out.print("insert at tail: ");
    s.display(s.head);
    s.insertAtHead(5);
    System.out.print("insert at head: ");
    s.display(s.head);
    System.out.println(s.search(5));
    */
    int arr[] = {1,2,3,4,5};
    for(int i=0; i<=4; i++)
    s.inserAtTail(arr[i]);
    s.display(s.head);
    s.insertAtPosition(7,2);
    s.display(s.head);
}    
}
