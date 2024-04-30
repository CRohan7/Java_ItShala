package practice.Stack;

import java.util.Stack;
public class crud_stack {


    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();


        // Add element
        stack.push(40);
        stack.add(2 , 60);

        System.out.println(stack);

        // Delete element
        stack.pop();
        System.out.println(stack);

        System.out.println(stack.isEmpty());
        stack.push(10);
        stack.push(21);


        // Top element in stack
        System.out.println(stack.peek());

        //Access
        System.out.println(stack.get(0));

        // Size

    }

}
