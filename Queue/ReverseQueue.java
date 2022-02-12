import java.util.Queue;
import java.util.LinkedList;


public class ReverseQueue{

    public static void reverse(Queue<Integer> queue){
        // Base Case
        if(queue.isEmpty()){
            return;
        }

        int x = queue.poll();
        reverse(queue);

        queue.add(x);

    }

    public static void main(String[] args) {
        Queue<Integer>queue = new LinkedList<>();
        int arr[] = {10,45,15,78,95,42,1};
        for(int i:arr){
            queue.add(i);
        }
        reverse(queue);
        while(!queue.isEmpty())
        {
            System.out.print(queue.poll()+" ");
        }

    }
}
