import java.util.Scanner;

class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data = data;

    }
}


public class PrintRecurr {
    public static Node<Integer> TakeInput2(){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null;
        Node<Integer>tail = null;
        while(data!=-1){          //Now the time complexity is O()
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
    public static void Print(Node<Integer>head){
        if(head==null){
            return ;
        }
        System.out.print(head.data+" ");
        Print(head.next);
        return;
    }
    public static void PrintReverse(Node<Integer>head){
        if(head==null){
            return ;
        }
        Print(head.next);
        System.out.print(head.data+" ");
    }
    public static void main(String[] args) {
        Node<Integer>head = TakeInput2();
        // Print(head);
        System.out.println();
        PrintReverse(head);
    }
}
