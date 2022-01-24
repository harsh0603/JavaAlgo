
public class binarySearch {
    
    public static int binary_Search(int[]arr,int find){

        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(find==arr[mid]) return mid; 
            else{
                if(find<mid){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return -1;            //-1 is no index.......
    }
    
    public static void main(String[] args) {
        int arr[] = {2,4,5,8,9,15,21,28};
        System.out.println(binary_Search(arr, 1));
        

    }
}
