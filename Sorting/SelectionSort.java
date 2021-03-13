import java.util.Scanner;

public class SelectionSort {
public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
        arr[i] = scan.nextInt();
    }
    // selection sort
    for(int i=0; i<n-1; i++){
        for(int j= i+1; j<n; j++){
            if(arr[j] < arr[i]){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }
    //print the element
    for(int i=0; i<n; i++){
        System.out.println(arr[i]+" ");
    }
}    
}
