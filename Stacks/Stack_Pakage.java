import java.util.Stack;

public class Stack_Pakage {
    
public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>(); 
    int arr[] = {1,2,3,4,5,6,7,8,9};

    for(int i:arr){
        stack.push(i);
    }

    System.out.println(stack.size());
    System.out.println(stack.isEmpty());

    System.out.println("This is the top element: "+stack.peek()); //this is same as the top method of the user defined



    while(!stack.isEmpty()){
        System.out.print(stack.pop()+" ");
    } System.out.println();
    System.out.println(stack.isEmpty());
}

    
}
