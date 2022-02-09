
class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data = data;

    }
}





class StackEmptyException extends Exception
{
    String str1;
    StackEmptyException(String str){

        str1 = str;
    }
  
    public String toString(){
        return ("StackEmptyException: "+str1);
    }
}









public class StackUsingLL<T> {

    private Node<T> head;
    private int size;

    StackUsingLL(){
        head = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0; 
    }


    public void push(T elem){
        Node<T> newNode = new Node<>(elem);
        newNode.next = head;
        head = newNode;
        size++;
    }


    public T top(){
        try{
            if(size()==0 || head==null){

            throw new StackEmptyException("The stack is empty");

            }

        }catch(StackEmptyException e){

            System.out.println(e);
        }

        return head.data;
    }



    public T pop(){
        try{
            if(size()==0 || head==null){
            throw new StackEmptyException("The stack is empty");
            }
        }catch(StackEmptyException e){

            System.out.println(e);
        }
        T temp = head.data;
        head = head.next;
        size--;
        return temp;
    }




    public static void main(String[] args) {
        
        StackUsingLL<Integer> sul = new StackUsingLL<>();

        int arr[] = {1,5,9,7,3,6};

        for(int i=0;i<arr.length;i++){
            sul.push(arr[i]);
        }

        System.out.println("the size of the linkedList is: "+ sul.size());

        System.out.println("the top of the linked List is: "+ sul.top());
        
        
        while(! sul.isEmpty()){
            System.out.print(sul.pop()+" ");
        }
        System.out.println();


        System.out.println("Is the linked list empty: "+sul.isEmpty());





    }
    
}
