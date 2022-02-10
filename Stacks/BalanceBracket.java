import java.util.Stack;

public class BalanceBracket {

    public static boolean isCorrect(String expression){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<expression.length();i++){
            char x = expression.charAt(i);
            if(x== '(' || x== '{' || x== '['){  //add the entry brackets in the stack
                stack.push(x);
                continue;
            }
            
            if(stack.isEmpty()) return false;  //if the stack is empty then there is nothing to add and remove
            char check=x;

            switch (x) {  //check the exit bracket and also should be in pair 
                case ')':
                    check = stack.pop(); //If condition meets then pop()the bracket
                    if(check == '{' || check == '[') //else if the enry is another 
                    return false;
                    break;
                case '}':
                    check = stack.pop();
                    if(check == '[' || check == '(')
                    return false;
                    break;
                case ']':
                    check = stack.pop();
                    if(check == '{' || check == '(')
                    return false;
                    break;
            
            }

        }

        return (stack.isEmpty());
    }

    public static void main(String[] args) {
        String expression = "[{(a+b)}*(c-d)]";

        System.out.println("Is this expression turly balanced: " + isCorrect(expression));

    }

}