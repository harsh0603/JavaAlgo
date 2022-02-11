

// Expression: {{{{
// If we reverse the second and the fourth opening brackets, the whole expression will get balanced. 
// Since we have to reverse two brackets to make the expression balanced, the expected output will be 2.



// Expression: {{{
// In this example, even if we reverse the last opening bracket, we would be left with the first opening bracket and 
// hence will not be able to make the expression balanced and the output will be -1.





import java.util.Stack;
import java.util.Scanner;
public class MinimumBracketReversal {
    public static int reversals(String str) {
        int count = 0;
        Stack<Character> stack = new Stack<>();

        if (str.length() % 2 == 1) {
            return -1;
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '{') {

                    stack.push(str.charAt(i));

                } else {
                    if (stack.isEmpty()) {
                        stack.push(str.charAt(i));
                    } else {
                        if (stack.peek() == '{') {
                            stack.pop();
                        } else {
                            stack.push(str.charAt(i));
                        }
                    }
                }

            }

        }



        while(!stack.isEmpty()){
            char c1 = stack.peek();
            stack.pop();
            char c2 = stack.peek();
            stack.pop();

            if(c1==c2){
                count+=1;
            }else{
                count+=2;
            }
        }


        return count;



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        System.out.println("Total numbers of reversals: "+reversals(str));
    }
}
