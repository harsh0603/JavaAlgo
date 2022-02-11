
// For example, if the price of a stock over a period of 7 days are [100, 80, 60, 70, 60, 75, 85], then the stock spans will be [1, 1, 1, 2, 1, 4, 6].
// Explanation: On the sixth day when the price of the stock was 75, the span came out to be 4, 
// because the last 4 prices(including the current price of 75) were less than the current or the sixth day's price.






import java.util.ArrayList;
import java.util.Stack;

public class StockSpan {

    public static ArrayList<Integer> Span(int[] arr) {

        ArrayList<Integer> arl = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        int span;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                stack.push(i);
                span = 1;
                arl.add(span);
            } else {
                while (!stack.isEmpty() && arr[stack.peek()] <= arr[i])
                    stack.pop();

                if (!stack.isEmpty()) {
                    span = i - stack.peek();
                    arl.add(span);
                } else {
                    span = i + 1;
                    arl.add(span);
                }
                stack.push(i);
            }

        }
        return arl;

    }

    public static void main(String[] args) {
        int arr[] = { 60, 70, 80, 100, 90, 75, 80, 120 };
        ArrayList<Integer> result = new ArrayList<>();
        result = Span(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

}
