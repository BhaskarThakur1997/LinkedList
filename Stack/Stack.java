/* Stack Implementation Using Array
*/

public class Stack {
    static final int MAX = 100;
    int top;
    int arr[] = new int[MAX];
    Stack(){
        top = -1;
    }
    void push(int x){
        if(top==MAX-1){
            System.out.print("stack overflow");
            return;
        }
        top++;
        arr[top]=x;
    }
    void pop(){
        if(top == -1){
            System.out.print("No element to pop");
            return;
        }
        top--;
    }
    int Top(){
        if(top == -1){
            System.out.print("No element in stack");
            return -1;
        }
        return arr[top];
    }
    boolean isEmpty(){
        return (top<0);
    }
    public static void main(String args[]){
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.pop();
        System.out.println(st.Top());
    }
}
