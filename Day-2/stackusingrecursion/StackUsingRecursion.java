package stackusingrecursion;

import java.util.Stack;

public class StackUsingRecursion {

    public static void sortStack(Stack<Integer> stack){
        if(!stack.isEmpty()){
            int temp = stack.pop();
            sortStack(stack);
            insert(stack,temp);
        }
    }

    public static void insert(Stack<Integer> stack, int value){
        if(stack.isEmpty() || stack.peek() <= value){
            stack.push(value);
            return;
        }
        int temp = stack.pop();
        insert(stack,value);
        stack.push(temp);
    }


}
