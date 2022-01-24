// public class Array2D {
//     public static void main(String[] args) {
//         int arr[][] = new int[3][4];
//         arr[2][0] = 15;
//         System.out.println(arr[2][0]);
//         int arr2[][] = {{1,2,3},{4,5,6}};
//         for(int row = 0;row<2;row++){
//             for(int coln = 0;coln<3;coln++){
//                 System.out.print(arr2[row][coln]+" ");
//             }
//             System.out.println();
//         }
//     }
// }








// Question to find the max sim of the colmn of the 2d array------------>








import java.util.Scanner;

public class Array2D {

    static int[][] Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row: ");
        int row = sc.nextInt();
        System.out.println("Enter the column: ");
        int col = sc.nextInt();
        int input[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) { // this is i the no of rows in every colmn is equal
                input[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return input;
    }

    static void print(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int coln = 0; coln < arr[0].length; coln++) {
                System.out.print(arr[row][coln] + " ");
            }
            System.out.println();
        }
    }



    static int maxColnSum(int[][] arr){
        int max = Integer.MIN_VALUE;
        int rows = arr.length;
        int cols = arr[0].length;

        for(int j = 0;j<cols;j++){
            int sum = 0;
            for(int i = 0;i<rows;i++){
            
                sum += arr[i][j];
            }
            if(sum>max){
                max = sum;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int arr[][]=Input();
        print(arr);
        System.out.println("the largest sum is: "+ maxColnSum(arr));

        
    }
}