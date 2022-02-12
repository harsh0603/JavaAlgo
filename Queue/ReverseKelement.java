import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class ReverseKelement {

    public static void reverseK(Queue<Integer> queue, int k) {
        // Base Case
        if (queue.isEmpty()==true || k>queue.size())
            return;

        if(k<=0) return;    

        Stack<Integer>stack = new Stack<>();
        for(int i=0;i<k;i++){
            stack.push(queue.poll());
        }

        while(!stack.empty()){
            queue.add(stack.pop());
        }


        for(int i=0;i<queue.size()-k;i++){
            queue.add(queue.poll());
        }


       ;
        
    }

  

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        int arr[] = { 1, 2, 3, 4, 5 };
        for (int elem : arr) {
            queue.add(elem);
        }

        System.out.println(queue.size());

        reverseK(queue, 3);
        
        while (!queue.isEmpty()) {
        System.out.print(queue.poll() + " ");
        }

    }
}
