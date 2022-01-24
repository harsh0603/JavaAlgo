public class quickSort {

    static void swap(int []arr,int m,int n){
        int temp = arr[m];
                arr[m] = arr[n];
                arr[n] = temp;
        
    }
    public static int partition(int arr[], int l, int r) {

        int pi = arr[r];
        int i = (l-1);
        for(int j =l;j<=r-1;j++){
            if(arr[j]<pi){
                i++;
                swap(arr, i, j);
                
            }
        }
        swap(arr, i+1, r);
        

        return (i+1);

    }

    public static void quick_Sort(int[] arr, int start, int end) {

        if (start < end) {
            int pivot = partition(arr, start, end);
            quick_Sort(arr, start, pivot - 1);
            quick_Sort(arr, pivot + 1, end);
        }
    }
    public static void display(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {6,3,5,9,2,8,7};
        quick_Sort(arr, 0, arr.length-1);
        display(arr);
        
    }
}
