package itshala.Finall;

public class variable_final {

    public static void main(String[] args) {
        final class fc{
            static int i=10;
            final static int j =20;


        }
        fc.i = 99;               // Allowed
        System.out.println(fc.i);


//        fc.j = 30;               Not Allowed


    }
}
