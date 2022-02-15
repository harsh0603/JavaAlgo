import java.util.Queue;
import java.util.Scanner;


import java.util.ArrayList;
import java.util.LinkedList;

 class TreeNode<T> {
    T data;
    ArrayList<TreeNode<T>>children;
    public TreeNode(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}








public class TreeTraversal {


    public static TreeNode<Integer> Inputlevel(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data of the root node");
        int rootData = sc.nextInt();
        Queue<TreeNode<Integer>> pendingQueue = new LinkedList<>();
        TreeNode<Integer> root = new TreeNode<>(rootData);
        pendingQueue.add(root);
        while(!pendingQueue.isEmpty()){
            TreeNode<Integer> frontNode = pendingQueue.poll();
            System.out.println("Enter the no of children of "+ frontNode.data);
            int numOfChild = sc.nextInt();
            for(int i=0;i<numOfChild;i++){
                System.out.println("Enter the "+(i+1)+"th child "+ frontNode.data);
                int child = sc.nextInt();
                TreeNode<Integer>childNode = new TreeNode<>(child);
                frontNode.children.add(childNode);
                pendingQueue.add(childNode);
            }
        }
        return root;

    }



  



    public static void printInlevel(TreeNode<Integer> root){
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode<Integer>frontNode = queue.poll();
            String st = frontNode.data +":";
            for(int i=0;i<frontNode.children.size();i++){
                queue.add(frontNode.children.get(i));
                st = st+ frontNode.children.get(i).data+",";
            }
            System.out.println(st);

        }
    }


   public static void preorder(TreeNode<Integer>root){
    //    Edge case
    if(root==null){
        return ;
    }

    System.out.print(root.data+" ");


    for(int i=0;i<root.children.size();i++){
        preorder(root.children.get(i));
    }


   }



   public static void PostOrder(TreeNode<Integer>root){
         //    Edge case
    if(root==null){
        return ;
    }

    for(int i=0;i<root.children.size();i++){
        PostOrder(root.children.get(i));
    }
    
    System.out.print(root.data+" ");

   }


    public static void main(String[] args) {
        TreeNode<Integer>root = Inputlevel();
        printInlevel(root);
        System.out.println("this is the preorder traversal of the tree: ");
        preorder(root);
        System.out.println();
        System.out.println("this is the postorder traversal of the tree: ");
        PostOrder(root);

       
        
      
    }
}






