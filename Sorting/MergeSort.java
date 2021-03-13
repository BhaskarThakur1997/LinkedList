
public class MergeSort{
    void merge(int arr[], int l, int mid, int r){
        int n1 = mid-l+1;
        int n2 = r-mid;

        //temp arrays
        int a[] = new int[n1];
        int b[] = new int[n2];
            for(int i=0; i<n1; i++){
                a[i] = arr[l+i];
            }
            for(int i=0; i<n2; i++){
                b[i] = arr[mid+1+i];
            }
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(a[i] < b[j]){
                arr[k] = a[i];
                i++;
                k++;
            }else{
                arr[k] = b[j];
                j++;
                k++;
            }
        }
        while(i<n1){
            arr[k] = a[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = b[j];
            j++;
            k++;
        }

    }
    void mergeSort(int arr[], int l, int r){
        if(l<r){
            int mid = (l+r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);

            merge(arr, l, mid, r);
        }
    }
    public static void main(String args[]){
        MergeSort ms = new MergeSort();
        int arr[] = {5,4,3,2,1};
        ms.mergeSort(arr,0,4);
        for(int i=0; i<5; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}