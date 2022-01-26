// print the 2 d array in the sine wave form----->




public class Question5 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};


        for(int i=0;i<arr[0].length;i++){
            if(i%2==0){                         //when ever the column no is even wave goes down
                for(int j=0;j<arr.length;j++){
                    System.out.print(arr[j][i]+" ");
                }}else{
                    for(int j=arr.length-1;j>=0;j--){
                        System.out.print(arr[j][i]+" ");
                    }
                }
            }
        }               
                       
    }
    

