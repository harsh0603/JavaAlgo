import java.util.Scanner;

class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data = data;

    }
}

public class ReverseRecurr {
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


    // public static Node<Integer>reverse(Node<Integer>head){
    //     // Base Case of this method
    //     if(head==null || head.next==null){
    //         return head;
    //     }

    //     Node<Integer>smallHead = reverse(head.next);
    //     Node<Integer>tail = smallHead;
    //     while(tail.next!=null){
    //         tail = tail.next;
    //     }
    //     tail.next = head;
    //     head.next=null;
    //     return smallHead;



    // }


    // another way->

    public static Node<Integer>reverse(Node<Integer> head3){

        if(head3==null || head3.next==null){
            return head3;
        }
    
    
        Node<Integer>prev = head3;
        Node<Integer>curr = head3.next;
    
        while(curr!=null){
            Node<Integer>nextNode = curr.next;
            curr.next = prev;
            // update
    
            prev = curr;
            curr = nextNode;
        }
    
        head3.next = null;
        head3 = prev;
    
        return head3;
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
        Node<Integer>head = TakeInput();
      
        head = reverse(head);
        Print(head);
        
    }
}


