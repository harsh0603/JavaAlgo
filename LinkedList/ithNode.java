class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data = data;

    }
}



public class ithNode {


    public static Node<Integer> createLinkedList(){
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(14);
        Node<Integer> n3 = new Node<>(16);
        Node<Integer> n4 = new Node<>(19);
        Node<Integer> n5 = new Node<>(25);
        Node<Integer> n6 = new Node<>(27);
        Node<Integer> n7 = new Node<>(31);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;

        return n1;


    }




    public static void Print(Node<Integer> head){

        Node<Integer> temp = head;

        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }



    public static void Print_ith(Node<Integer> head,int i){
        Node<Integer> temp = head;
        int count = 0;
        while(count<i && temp!=null){
            temp = temp.next;
            count++;
        }
        if(temp !=null)
        System.out.println("Find at "+count+" -> "+temp.data);
    }




    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();
        Print(head);
        Print_ith(head, 5);
    }
}
