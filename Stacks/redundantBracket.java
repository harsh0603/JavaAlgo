import java.util.Scanner;
import java.util.Stack;



public class redundantBracket {
    public static boolean redundant(String str){
         Stack<Character>stack = new Stack<>();
         boolean flag;
         char ctr[] = str.toCharArray();
         for(char ch:ctr){
             if (ch==')') {
                 char top = stack.peek();
                 stack.pop();

                 flag = true;  //this is done because if we hit a imdiate '(' then this is the condition of duplicate(true redundant) 

                 while(top!='('){
                     if(top == '+' || top == '-' || top == '/' || top == '*' )
                     flag = false;

                     top = stack.peek();
                     stack.pop();
                 }

                 if(flag==true){
                     return true;
                 }

             } else {
                 stack.push(ch);  //all the open paranthesis and the operator and the operands and push in the stack
             }
         }

         return false;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        sc.close();

        System.out.println("Is the expression redundant: "+redundant(s));


    }
}
