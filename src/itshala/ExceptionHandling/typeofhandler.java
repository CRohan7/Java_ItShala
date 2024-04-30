package itshala.ExceptionHandling;

public class typeofhandler {

    public static void main(String[] args) {

        try{

            System.out.println(1/0);

        }catch(ArithmeticException | IndexOutOfBoundsException | NullPointerException exception){
            System.out.println("Specific Handler! Error: " + exception);
        }catch (Exception e){
            System.out.println("Generic Handler! Error: " +e) ;
        }


    }
}
