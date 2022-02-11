
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







public class DynamicQueue {

    private int data[];
    private int front;
    private int rear;
    private int size;

    public DynamicQueue(){
        data = new int[20];
        front = -1;
        rear = -1;
       
    }

    public DynamicQueue(int capacity){
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
        
            if(Size()==data.length){
                doubleCapacity();
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



    private void doubleCapacity(){
        int temp[] = data;
        int data[] = new int[2*temp.length];

        int index = 0;
        for(int i=front;i<temp.length;i++){
            data[index++] = temp[i];
        }

        for(int i=0;i<front-1;i++){
            data[index++] = temp[i];
        }
        front = 0;
        rear = temp.length;
    }



    public static void main(String[] args) {
        DynamicQueue dq = new DynamicQueue();
        int arr[] = {10,85,49,76,25,60,90};
        for(int i:arr){
            dq.enqueue(i);
        }
        dq.enqueue(3);
        dq.enqueue(8);
        dq.enqueue(9);
        dq.enqueue(4);


        while(!dq.isEmpty()){
            System.out.print(dq.dequeue()+" ");
        }
    }
}
