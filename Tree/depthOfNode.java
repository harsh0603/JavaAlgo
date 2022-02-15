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








public class depthOfNode {


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


public static void Depth(TreeNode<Integer>root,int k){
    // Edge case
    if(k<0){
        return;
    }

    // Base Case
    if(k==0){
        System.out.println(root.data);
        return;
    }

    for(int i=0;i<root.children.size();i++){
        Depth(root.children.get(i), k-1);
    }

}



    public static void main(String[] args) {
        TreeNode<Integer>root = Inputlevel();
        printInlevel(root);
        System.out.println("Enter the depth  for the nodes: ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("The nodes at depth "+k+" are: ");
        Depth(root, k);
        
    }
}




