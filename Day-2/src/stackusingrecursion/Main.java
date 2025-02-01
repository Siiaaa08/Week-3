package stackusingrecursion;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(4);
        stack.push(6);
        stack.push(2);
        stack.push(0);
        stack.push(7);
        stack.push(8);

        System.out.println("Original stack: " + stack);
        StackUsingRecursion.sortStack(stack);
        System.out.println("Sorted stack: " + stack);

    }

}
