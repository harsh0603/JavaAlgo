class QueueOverflowException extends Exception{
    String str2;
    QueueOverflowException(String str){
        str2=str;
    }

    public String toString(){
        return ("QueueOverflowException: "+str2);
    }
}





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








public class CircularQueue {
    private int data[];
    private int front;
    private int rear;
    private int size;

    public CircularQueue(){
        data = new int[20];
        front = -1;
        rear = -1;
       
    }

    public CircularQueue(int capacity){
        data = new int[capacity];
        front = -1;
        rear = -1;
       
    }


    public int Size(){
        return size;
    }


    public boolean isEmpty(){
        return size==0;
    }

    public void enqueue(int elem){
        try{
            if(Size()==data.length){
                throw new QueueOverflowException("The Queue is overflowed");
            }
        } catch (QueueOverflowException e) {
            System.out.println(e);
        }


        if(size==0){
            front++;
            rear++;
            data[front] = elem;
        }else{
            rear = (rear+1)%data.length;  //this is the statement to make the queue as circular
        
            data[rear] = elem;
        
        }
        size++;
    }


    public int Front(){
        try{
            if(Size()==0){
            throw new QueueEmptyException("The stack is empty");
            }
        }catch(QueueEmptyException e){

            System.out.println(e);
        }

        return data[front];
    }
    public int Rear(){
        try{
            if(Size()==0){
            throw new QueueEmptyException("The stack is empty");
            }
        }catch(QueueEmptyException e){

            System.out.println(e);
        }

        return data[rear];
    }



    public int dequeue(){
        try{
            if(Size()==0){
            throw new QueueEmptyException("The stack is empty");
            }
        }catch(QueueEmptyException e){

            System.out.println(e);
        }

        int temp = data[front];
        front = (front+1)%data.length;    //this is the statement to make the queue as circular
        size--;

        if(size == 0){
            front=rear =-1;
        }
        return temp;


    }

    public static void main(String[] args) {
        
            CircularQueue queue = new CircularQueue();
            int arr[] = {10,20,30,40};
    
            for(int i:arr){
               queue.enqueue(i);
            }

            queue.dequeue();
            queue.enqueue(100);
            
    
            while(!queue.isEmpty()){
                System.out.print(queue.dequeue()+" ");
            }
        // System.out.println(queue.dequeue());       //this will give exception
    }
    
}
