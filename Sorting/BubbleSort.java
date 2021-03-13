
import java.util.*;

public class BubbleSort{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter value of n:");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.print("values in an array:");
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        int counter = 1;
        while(counter<n){
            for(int i=0; i<n-counter; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            counter++;
        }
        System.out.println("print in sorted order");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
    }
}