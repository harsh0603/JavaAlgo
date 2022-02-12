import java.util.ArrayList;
import java.util.Scanner;

 class TreeNode<T> {
    T data;
    ArrayList<TreeNode<T>>children;
    public TreeNode(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}



public class TakeInputPrint {
    public static TreeNode<Integer> takeInput(Scanner sc){
        int n; //this is the data to be stored
        System.out.println("Enter the next node data");
      
        n = sc.nextInt();
        TreeNode<Integer>root = new TreeNode<>(n);
        System.out.println("Enter the number of children for "+n);
        int children = sc.nextInt();
        for(int i=0;i<children;i++){
            TreeNode<Integer>child = takeInput(sc);
            root.children.add(child);
        }
        return root;
    }

    public static void print(TreeNode<Integer> root){
        String s = root.data+":";
        for(int i=0;i<root.children.size();i++){ //this will give use the size of the childern of the root

            s = s + root.children.get(i).data+",";   //this is the data at the index i of the root children
        }

        System.out.println(s);
        for(int i = 0;i<root.children.size();i++){
            print(root.children.get(i));
        }


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode<Integer>root = takeInput(sc); //it is because now we can take input in one line, otherwise if we define Scanner in the takeInput then it will make new Scanner in every recursive time
        print(root);
        
    }
    
}
