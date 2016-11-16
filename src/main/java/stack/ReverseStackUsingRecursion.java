package stack;

import java.util.Stack;

public class ReverseStackUsingRecursion {

    public static void pushIntoStack(Stack<Integer> stack, int first) {

        if(stack.isEmpty()) {
            stack.push(first);
        }
        else {
            int last = stack.pop();
            pushIntoStack(stack, first);
            stack.push(last);
        }
    }
    public static void removeStack(Stack<Integer> stack) {

        if (!stack.isEmpty()) {

            int top = stack.pop();
            removeStack(stack);
            pushIntoStack(stack, top);

        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);


        removeStack(stack);
        while (!stack.isEmpty()) {
            System.out.print(stack);
        }
    }
}
