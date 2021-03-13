public class DNFSort{
    void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    void dnfsort(int arr[], int size){
        int low = 0;
        int mid = 0;
        int high = size-1;

        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr,low,mid);
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                swap(arr,mid, high);
                high--;
            }
        }
    }
    public static void main(String args[]){
        DNFSort dnf = new DNFSort();
        int arr[] = {1,1,2,0,0,1,2,2,1,0};
        int n = arr.length;
        dnf.dnfsort(arr,n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}