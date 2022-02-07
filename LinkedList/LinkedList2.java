// Increment in the data of the linked list node




class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data = data;

    }
}


public class LinkedList2 {

    public static Node<Integer> createLinkedList(){
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        return n1;


    }



    public static void Increment(Node<Integer> head){
        Node<Integer> temp = head;

        while(temp!=null){
            temp.data++;
            temp = temp.next;
        }

    }



    public static void Print(Node<Integer> head){

        Node<Integer> temp = head;

        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }








    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();
        Increment(head);
        Print(head);

    }


    
}
