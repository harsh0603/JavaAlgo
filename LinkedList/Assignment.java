import java.util.Scanner;

class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data = data;

    }
}



public class Assignment {
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


    // find the given node in the LL and return the index of it->
    // public static int FindNode(Node<Integer>head,int num){
    //     if(head==null){
    //         return -1;
    //     }

    //     Node<Integer>currNode = head;

    //     int count=0;
    //     while(currNode.next!=null){

    //         if(currNode.data==num){
    //             return count;
    //         }else{
    //             currNode = currNode.next;
    //             count++;
    //         }
    //     }


    //     return -1;

    // }











    // Append the num nodes from the LinkedList ahead->
    // Example: 1 2 3 4 5 , num=3, 









//     public static Node<Integer> Append(Node<Integer>head,int num){
//         // First count the no fo nodes
//         int len = 0;
//         Node<Integer> temp = head;
//         while(temp!=null){
//             temp = temp.next;
//             len++;
//         }

//         // now put the count as how many nodes from start we want to append back

//         int count = len-num;
//         Node<Integer>prev = null;
//         Node<Integer>curr = head;


//         // Traverse to that last node which will go behind 
//         while(count>0){
//             prev = curr;
//             curr = curr.next;
//             count--;
//         }
//         // put new head as on the curr
//         // and break the linkedList in sub part by connecting null to the prev
//         prev.next = null;
//         Node<Integer>head2 = curr;

//         // Traverse to the end of the LL and connect to the old head

//         while(curr.next!=null){
//             curr = curr.next;
//         }
//         curr.next = head;
// //  return new head;
//         return head2;
//     }










// Eliminate duplicates from LL 







// public static Node<Integer> duplicateNode(Node<Integer>head){

//     if(head==null || head.next==null){
//         return head;
//     }

//     Node<Integer>t1 = head;
//     Node<Integer>t2 = head.next;

//     while(t2!=null){
//         if(t1.data!=t2.data){
//             t1.next = t2;
//             t1=t2;
//             t2=t2.next;
//         }else{
//             t2 = t2.next;
//         }

//     }
//     t1.next = t2;
//     return head;
// }









// Print Reverse LinkedList






// public static void PrintReverse(Node<Integer>head){
//     if(head==null ){
//         return;
//     }

  
//     PrintReverse(head.next);

//     System.out.print(head.data+" ");

//     return;
// }










// Palindrome LinkedList


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


public static Node<Integer>mid(Node<Integer>head){
    Node<Integer>hear = head;
    Node<Integer>turtle = head;

    while(hear.next!=null && head.next.next!=null){
        turtle = turtle.next;
        hear = hear.next.next;
    }
    return turtle;
}



public static boolean Palindrome(Node<Integer>head){
     
    if(head==null || head.next==null){
        return false;
    }
    
    // Find the middle of the linked List
        

      Node<Integer>middle = mid(head);

       Node<Integer> head2 = reverse(middle.next);

        while(head2!=null){
             if(head.data!=head2.data)
             {
            return false;
             }
             head = head.next;
             head2 = head2.next;

        }

        return true;

}














    public static void main(String[] args) {
        Node<Integer>head = TakeInput();
        
        // int num=4;
        
      
        // System.out.println(num+" is present on "+FindNode(head, num)+" index");

        // int num = 3;
        // head = Append(head, num);
        // Print(head);


        // head = duplicateNode(head);
        // System.out.println("After removing the duplicates in the LL: ");
        // Print(head);



        // PrintReverse(head);



        // head = reverse(head);
        // Print(head);


        System.out.println("Is this LL palindrome: "+Palindrome(head));


    }
}
