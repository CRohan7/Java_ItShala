package itshala.ExceptionHandling;

public class multi_catch {

    public static void main(String[] args){
        // Arithmetic Exception
        try{
            System.out.println(1/0);

        }catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException exception ){
            System.out.println("Error: " + exception);
        }





        // Null pointer Exception
        try{

            String st = null;
            System.out.println(st.length());

        }catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException exception ){
            System.out.println("Error: " + exception);
        }




        // Index out of bound exception
        try{
            int array[] = {0,1,2,3,4};
            for (int j=0 ; j<7; j++){
                System.out.println(array[j]);
            }

        }catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException exception ){
            System.out.println("Error: " + exception);
        }
    }
}
