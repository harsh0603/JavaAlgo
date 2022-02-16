import java.util.Scanner;

class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data = data;

    }
}

public class DeleteRecurr {
  public static Node<Integer> TakeInput(){

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null;

        while(data!=-1){
            Node<Integer> currNode = new Node<>(data);
            if(head == null){
                // Make this node as the head node
                head = currNode;
            }else{
                Node<Integer> temp = head;
                while(temp.next !=null){
                    temp=temp.next;
                }
                // Now temp will refer to last node
                // Connect currNode after the last node
                temp.next = currNode;
                
            }
            data = sc.nextInt();
        }
        sc.close();
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

    public static Node<Integer>delete(Node<Integer>head,int pos){
        if(head==null){
            return head;
        }

        if(pos==0){
            return head.next;
        }

        Node<Integer>temp;
       temp = delete(head.next, pos-1);
       head.next = temp;
        return head;
    }
    
    public static void main(String[] args) {
        Node<Integer>head = TakeInput();
        System.out.println("this is the main class");
        head = delete(head, 2);
        Print(head);
        
    }
}

