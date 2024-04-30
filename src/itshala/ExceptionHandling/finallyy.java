package itshala.ExceptionHandling;

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.InputMismatchException;

/*
We can have:
One 'try'
Multiple 'Catch'
Single 'Finally'


- Finally block always override if any other value is set before
 */

public class finallyy {
    public static void main(String[] args) {
        try{
            System.out.println( 1/0);

        }catch(ArithmeticException arth){
            System.out.println("from arth");

        }catch(InputMismatchException inp){
            System.out.println("from input");

        }catch(NoSuchFieldError nos){
            System.out.println("From No such");

        }finally{
            System.out.println("from finally");
        }
    }
}
