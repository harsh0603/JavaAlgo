

// Reverse the stack using the implicit recurssion and store it in the same stack again
// using a helper stack






import java.util.Stack;

public class ReverseStack {

    public static void reverseIt(Stack<Integer> s1,Stack<Integer> h){
        // Base Case
        if(s1.size()<=1){
            return;
        }

        int x = s1.pop();
         reverseIt(s1, h);

        while(!s1.isEmpty()){
            h.push(s1.pop());
        }
        s1.push(x);
        while(!h.isEmpty()){
            s1.push(h.pop());
        }






    }

    public static void main(String[] args) {
        Stack<Integer>stack = new Stack<>();
        int arr[] = {1,4,6,9};
        for(int i:arr){
            stack.push(i);
        }
        Stack<Integer>helper = new Stack<>();
        reverseIt(stack, helper);
       while(!stack.isEmpty()){
           System.out.print(stack.pop()+" ");
       }

    }
    
}
