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








public class Assignment {


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


   

    // Check if the tree contain x or not

    public static boolean check(TreeNode<Integer>root,int x){
        
           // edge case
           if(root==null){
            return false;
        }

        
        if(x==root.data)
        return true;


        for(int i=0;i<root.children.size();i++){
            
           if(check(root.children.get(i), x))
           return true;
        
        }

        return false;

    }

    
    // Find the maximum child sum node->

    static TreeNode<Integer> ans;
    static int Mainsum = Integer.MIN_VALUE;
    public static void FindMax(TreeNode<Integer>root){

      // edge case
      if(root==null){
          return;
        }


        int sum = root.data;
        // for(TreeNode<Integer> child: root.children){
        //     int currSum = FindMax(child);
        //     sum+=currSum;
        // }

        for(int i=0;i<root.children.size();i++){
            
               sum+=root.children.get(i).data;
                FindMax(root.children.get(i));
         
         }

        if(sum>Mainsum){
            Mainsum = sum;
            ans = root;
        }
        

        return;

    }


    // Given two generic trees, return true if they are structurally identical. Otherwise return false.
    //Structural Identical

    public static boolean checkIdentity(TreeNode<Integer>root1,TreeNode<Integer>root2){
        // edge case
      if(root1==null || root2==null){
        return false;
      }

      boolean check = true;

      if((root1.data==root2.data) && (root1.children.size()==root2.children.size())){
        for(int i=0,j=0;i<root1.children.size() && j<root2.children.size() ;i++,j++){

           check = checkIdentity(root1.children.get(i), root2.children.get(j));

        }
      } else{
          check = false;
      } 

      return check;
}



// Given a generic tree and an integer n. Find and return the node with next larger
// element in the tree i.e. find a node with value just greater than n.

   

   public static int NextLarge(TreeNode<Integer>root,int x){
       if(root==null) return -1;

       int ans = -1;

       if(root.data>x){
           ans = root.data;
       }

       for(int i=0;i<root.children.size();i++){
         int temp = NextLarge(root.children.get(i), x);

         if(ans== -1){

            ans = temp;
         }

         if(temp<ans){
             ans = temp;
         }

       }

       return ans;


   }




    public static void main(String[] args) {
        TreeNode<Integer>root = Inputlevel();
        printInlevel(root);
        System.out.println();



        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        // System.out.println("Is "+x+" present in the tree: "+check(root, x));




        // Find the Max of the imidiate child of a node and itself


        // FindMax(root);
        // System.out.println("the Max Node Sum is: "+ ans.data+" of sum: "+Mainsum);

        

       //Structural Identical

    //    TreeNode<Integer>root1 = Inputlevel();
    //    printInlevel(root1);
    //    TreeNode<Integer>root2 = Inputlevel();
    //    printInlevel(root2);

    //    System.out.println("Are these trees identical: "+checkIdentity(root1, root2));




        //  Next Largest value in the tree


        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println("Next largest value of "+x+" is: "+NextLarge(root, x));






      
    }
}
