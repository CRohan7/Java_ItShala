package itshala.ExceptionHandling;

/*
i. Exception is unwanted, unexpected event that terminates program abnormally
ii. Exceptions can be recovered
iii. Exceptions are occurred mostly due to developer logical mistakes
iv. Exceptions can be handled
v. Exception Handling is preventing the abnormal termination
vi.InputMismatchException: When input data type does not match declared data type of variable
vii. ArithmeticException: Math logic error ex. 1/0
viii. Checked Exception: At time of compile time , Extends Exception class
ix. Unchecked exception: At run time , extends error and run time error class
x. Stack Overflow error: When stack is full,or when there is no terminating condition
 */


public class basics {

    public static void main(String[] args ) {

        try{
            int i=0;
            System.out.println(1/i);
        }catch( Exception e){
            System.out.println(e);

        }
    }



}