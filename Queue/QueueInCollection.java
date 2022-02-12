import java.util.LinkedList;
import java.util.Queue;

public class QueueInCollection {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();  //As the queue is a interface that's why we are using it with the LinkedList
        queue.add(12);
        queue.add(54);
        queue.add(84);
        queue.add(46);
        queue.add(28);
        System.out.println(queue.size());
        System.out.println(queue.peek()); //this will going to give us the value of the front
        System.out.println(queue.poll()); //this will dequeue the front element
        System.out.println(queue.size());


    }
    
}
