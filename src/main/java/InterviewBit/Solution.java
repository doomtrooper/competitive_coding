package InterviewBit;

import java.util.Stack;

/**
 * Created by kuliza-265 on 14/5/17.
 */
public class Solution {

    private Stack<Integer> stk;
    private Stack<Integer> minStk;

    public Solution() {
        stk = new Stack<>();
        minStk = new Stack<>();
        stk.clear();
        minStk.clear();
    }

    public void push(int x) {
        stk.push(x);
        if (minStk.isEmpty()) {
            minStk.push(x);
        }else {
            minStk.push(Math.min(x, minStk.peek()));
        }
    }

    public void pop() {
        if (stk.isEmpty()) return;
        stk.pop();
        minStk.pop();
    }

    public int top() {
        return stk.isEmpty()?-1:stk.peek();
    }

    public int getMin() {
        return minStk.isEmpty()?-1:minStk.peek();
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        solution.push(10);
        solution.push(9);
        solution.getMin();
        solution.push(8);
    }
}
