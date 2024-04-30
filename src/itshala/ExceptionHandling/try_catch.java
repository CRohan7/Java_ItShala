package itshala.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;
// We can have n number of catch while only one try
public class try_catch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try{
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            System.out.println(i/j);
        }catch(ArithmeticException ath){
            System.out.println("from first catch");
            System.out.println(ath);

        }catch(InputMismatchException inp){
            System.out.println("from second catch");
            System.out.println(inp);
        }
    }
}
