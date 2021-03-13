
import java.util.*;

public class InsertionSort{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter value of n:");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.print("values in an array:");
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        for(int i=1; i<n; i++){
            int current = arr[i];
            int j = i-1;
            while(arr[j] > current && j>=0){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        System.out.println("print in sorted order");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
    }
}