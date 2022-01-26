public class jaggesArray{
    public static void main(String[] args) {
        int arr[][] = new int[3][5];
        // System.out.println(arr[0]); //this will give us the address of the 1d array stored in the main 1d array
        // System.out.println(arr[0][0]); //this will give us the element in the first index of the 1d array stored in the main 1d array

        int arr2[][] = new int[4][]; //this mean that the size of the main array is 4 and the address of the 1d array stored in the main array is not defined,
                                     //therefore the main array will contain null in every index(all 4)

    //    System.out.println(arr2[0]); //this will print null
    //    System.out.println(arr2[0][0]); //this will show exception         
    





    // Jagged Arrays--->
    
    for(int i=0;i<arr2.length;i++){
        arr2[i] = new int[i+2];
    }


    for(int j=0;j<arr2.length;j++){
        for(int i=0;i<arr[j].length;i++){
            System.out.println(arr2[j][i]+" ");
        }
        System.out.println();
    }


    }
}