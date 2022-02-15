



// Make a Take Input mehtod to make the linkedList
// Put the element until the scanner hit -1
// Time Complexity of it is -> O(n^2)







import java.util.Scanner;

class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data = data;

    }
}



public class InputLinkedList {

    // public static Node<Integer> TakeInput(){

    //     Scanner sc = new Scanner(System.in);
    //     int data = sc.nextInt();
    //     Node<Integer> head = null;

    //     while(data!=-1){
    //         Node<Integer> currNode = new Node<>(data);
    //         if(head == null){
    //             // Make this node as the head node
    //             head = currNode;
    //         }else{
    //             Node<Integer> temp = head;
    //             while(temp.next !=null){
    //                 temp=temp.next;
    //             }
    //             // Now temp will refer to last node
    //             // Connect currNode after the last node
    //             temp.next = currNode;
                
    //         }
    //         data = sc.nextInt();
    //     }
    //     sc.close();
    //     return head;
    // }







    // THe time complexity of the takeInput() is O(n^2)

    // To optimise it we can make a tail node which will make the traverse for us->
    








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


    public static void Print(Node<Integer> head){

        Node<Integer> temp = head;

        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        // Node<Integer> head = TakeInput();
        Node<Integer> head = TakeInput2();
        Print(head);

    }
    
}
