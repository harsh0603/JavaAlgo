import java.util.Scanner;

class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data = data;

    }
}



public class InsertLL {

    public static Node<Integer> TakeInput2(){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null;
        Node<Integer>tail = null;
        while(data!=-1){          //Now the time complexity is O(n)
            Node<Integer>newNode = new Node<>(data);
            if(head ==null){
                head = newNode;
                tail = newNode;              
            }else{
                tail.next = newNode;
                tail = newNode;
            }

            data = sc.nextInt();

        }
        sc.close();
        return head;
    }

    public static Node<Integer> Insert(Node<Integer>head,int data,int pos){  //We have to return head at the end, because the java work on the pass by value not reference
        Node<Integer> newNode = new Node<>(data);
        if(pos==0){
            newNode.next = head;
            // head = newNode;  //no need to write this statement

            return newNode;
        }else{
            int count = 0;
            Node<Integer>temp = head;
            while(count<pos-1 && temp.next!=null){ //the second condition is to check the pos is not more than the size of the LL

                temp = temp.next;
                count++;

            }
            if(temp.next!=null){
            newNode.next = temp.next;
            temp.next = newNode;
            }
        }


        return head;
    }


    public static void Print(Node<Integer> head){

        Node<Integer> temp = head;

        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }




    public static void main(String[] args) {
         Node<Integer> head = TakeInput2();
        Print(head);
        // Insert(head, 15, 3);
        head = Insert(head, 15, 0);
        Print(head);
    }
}
