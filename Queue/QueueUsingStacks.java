import java.util.Stack;

public class QueueUsingStacks<T>{
    public Stack<T>s1;
    public Stack<T>s2;
    public QueueUsingStacks(){
        this.s1 = new Stack<T>();
        this.s2 = new Stack<T>();
        
    }


    public int getSize(){
        return this.s1.size();
    }

    public boolean isEmpty(){

        return s1.isEmpty();
    }


    public void enQueue(T elem){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }

        s1.push(elem);

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }

    }

    public T dequeue(){

        if(s1.isEmpty()){
            System.out.println("this queue is Empty");
            System.exit(0);
        }

        T temp = s1.peek();
        s1.pop();
        return temp;


    }
    public static void main(String[] args) {
        
        QueueUsingStacks<Integer> queue = new QueueUsingStacks<>();
        int arr[] = {10,45,75,15,56};
        for(int i:arr){
            queue.enQueue(i);
        }

        System.out.println(queue.getSize());

        while(!queue.isEmpty()){
            System.out.print(queue.dequeue()+" ");
        }
        
    }
}