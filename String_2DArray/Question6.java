
public class Question6 {
    static void spiral(int[][] arr){
        int rowst = 0,colmst = 0;
        int rowen = arr.length-1, colmen = arr[0].length-1;

        int nm = arr.length*arr[0].length;
        int count = 0;

        while(count<nm){
            // top wall
            for(int i=rowst, j = colmst ;j<=colmen && count< nm;j++){
                System.out.print(arr[i][j]+ " ");
                count++;
            }
            rowst++;
            //right wall
            for(int i=rowst, j = colmen;i<=rowen && count< nm;i++){
                System.out.print(arr[i][j]+ " ");
                count++;
            }
            colmen--;
            //bottom wall
            for(int i=rowen, j = colmen;j>= colmst && count< nm;j--){
                System.out.print(arr[i][j]+ " ");
                count++;
            }
            rowen--;
            // left wall
            for(int i=rowen, j = colmst;i>= rowst && count< nm;i--){
                System.out.print(arr[i][j]+ " ");
                count++;
            }
            colmst++;
        }

    }
    public static void main(String[] args) {

       
       int arr[][] = {{7,8,9},{4,5,6},{1,2,3}};
       spiral(arr);
    }
    
}
