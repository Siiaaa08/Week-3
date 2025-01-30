package queueusingstacks;
import java.util.*;
public class QueueUsingStacks {
    Stack <Integer> stack1 = new Stack<>();
    Stack <Integer> stack2 = new Stack<>();

    public void enqueue(int data){
        stack1.push(data);
    }

    public int dequeue(){
        if(stack2.isEmpty()){
           if(stack1.isEmpty()){
               throw new RuntimeException("Queue is empty");
           }
           while(!stack1.isEmpty()){
               stack2.push(stack1.pop());
           }
        }
        return stack2.pop();
    }
}
