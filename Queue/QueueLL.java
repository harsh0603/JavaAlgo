class QueueEmptyException extends Exception
{
    String str1;
    QueueEmptyException(String str){

        str1 = str;
    }
  
    public String toString(){
        return ("QueueEmptyException: "+str1);
    }
}









class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data = data;

    }
}





public class QueueLL<T> {
    private Node<T> front;
    private Node<T> rear;
    int size;

    public QueueLL(){
        front = null;
        rear = null;
        size=0;
    }


    public int Size(){
        return size;
    }


    public boolean isEmpty(){
        return size==0;
    }


    public void enqueue(T elem){
        Node<T> newNode = new Node(elem);
        if(size==0){
            front = newNode;
            rear = newNode;

        }else{

            rear.next = newNode;
            rear = newNode;
        }

        size++;
    }


    public T Front(){
        try{
            if(Size()==0 || front==null){

            throw new QueueEmptyException("The Queue is empty");

            }

        }catch(QueueEmptyException e){

            System.out.println(e);
        }

        return front.data;
    }


    public T dequeue(){
        try{
            if(front==null){

            throw new QueueEmptyException("The Queue is empty");

            }

        }catch(QueueEmptyException e){

            System.out.println(e);
        }

        Node <T> temp = front;
        front = front.next;
        if(front== null){  //this is if the front and the rear are on the same element and dequeue() is performed 
            rear = null;
        }
        size--;

        return temp.data;

    }
    public static void main(String[] args) {
        QueueLL<Integer> queue = new QueueLL<>();
        int arr[] = {20,50,97,82,45};
        for(int i:arr){
            queue.enqueue(i);
        }
        

        while(!queue.isEmpty()){
            System.out.print(queue.dequeue()+" ");
        }
        
    }
    
}
