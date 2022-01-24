public class BubbleSort{
    public static void bubbleSort(int []arr){
        for(int j = 0;j<arr.length-1;j++){
        for(int i= 0;i<arr.length-1-j;i++){ //We won't have to compare the last and sorted element that's why use -j(from the 0 index to last not sorted element ) 
             if(arr[i+1]<arr[i]){
                 int temp;
                 temp = arr[i+1];
                 arr[i+1] = arr[i];
                 arr[i] = temp;
                
             }
        }
    }
    }
    
    public static void main(String[] args) {
     int arr[] = {4,6,2,7,1,3};
     bubbleSort(arr);
     for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
     }

    }
}