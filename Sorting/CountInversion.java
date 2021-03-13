public class CountInversion{
    int merge(int arr[], int l, int mid, int r){
        int inversion = 0;
        int n1 = mid-l+1;
        int n2 = r-mid;

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
                arr[k]=a[i];
                k++;
                i++;
            }else{
                arr[k]=b[j];
               // if a[i] > b[j] and i < j
                inversion += n1-i;
                k++;
                j++;
            }
        }
        while(i<n1){
            arr[k]=a[i];
            k++;
            i++;
        } 
        while(j<n2){
            arr[k]=b[j];
            k++;
            j++;
        }
        return inversion;
    }
    int mergesort(int arr[], int l, int r){
        int inversion = 0;
        if(l < r){
            int mid = (l+r)/2;
            inversion += mergesort(arr, l, mid);
            inversion += mergesort(arr, mid+1, r);
            inversion += merge(arr, l, mid, r);
        }
        return inversion;
    }
    // brute force
    void inversion(int arr[], int n){
        int inversion = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] > arr[j]){
                    inversion++;
                }
            }
        }
        System.out.print(inversion);
    }
    public static void main(String args[]){
        CountInversion ci = new CountInversion();
        int arr[] = {3,5,6,9,1,2,7,8};
        int n = arr.length;
        System.out.println(ci.mergesort(arr,0,n-1));
        
    }
}