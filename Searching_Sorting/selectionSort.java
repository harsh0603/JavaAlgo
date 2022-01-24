public class selectionSort {
    public static void selection_Sort(int[] arr){
        int point = 0;
        while(point<arr.length-1){
            int min=Integer.MAX_VALUE;
            int minIndex = point;
            for(int i = point;i<arr.length;i++){

                if(arr[i]<min){
                    min = arr[i];
                    minIndex = i;
                }
            }
            if(minIndex!=point){
                arr[minIndex] = arr[point];
                arr[point] = min;
            }
            point++;

        }
    }
    public static void main(String[] args) {
        int[]arr = {2,5,9,1,8,3,4};
        selection_Sort(arr);
        
        for(int j=0;j<arr.length;j++){

            System.out.print(arr[j]+" ");
        }
    }
}
