package practice.Stack;
import java.util.Stack;
import java.util.Scanner;


public class stack_demo {


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();


        // Add element
        stack.push(40);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.push(100);


        //Pop
        System.out.println("Enter element to be deleted: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("Before Stack:" + stack);
        int s = stack.search(a);

        for(int j=0 ; j<= stack.size() ; j++){

            if(stack.get(j) == a){
                stack.remove(j);
                System.out.println("Popped!");
                break;
            }else {
                continue;
            }
        }

        System.out.println("After stack: " + stack);



    }
}


