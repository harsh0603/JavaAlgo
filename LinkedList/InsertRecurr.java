import java.util.Scanner;

class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data = data;

    }
}

public class InsertRecurr {
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
    // public static void Print(Node<Integer>head){
    //     if(head==null){
    //         return ;
    //     }
    //     System.out.print(head.data+" ");
    //     Print(head.next);
    //     return;
    // }

    public static void Print(Node<Integer> head){

        Node<Integer> temp = head;

        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node<Integer>Insert(Node<Integer>head,int pos,int data){
        
        if(pos==0){
        Node<Integer>newNode = new Node<>(data);
        newNode.next = head;
        return newNode;
        }else{

            
            head.next = Insert(head, pos-1, data);
             return head;
        }


    }
    public static void main(String[] args) {
        Node<Integer>head = TakeInput();
        head = Insert(head, 2, 20);
        Print(head);
        
    }
}
