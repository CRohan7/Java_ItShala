package itshala.throw_keyword;
import java.util.Scanner;
public class tryy {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        if(age<18){
            throw new InvalidAgeException("Not eligible");
        }else{
            System.out.println("U r Eligible");
        }
    }
}
