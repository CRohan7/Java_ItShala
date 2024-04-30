package itshala.throwskeyword;

public class basics {
    public static void main(String[] args) throws Exception {

        try{
            m1();
        }catch(ArithmeticException arth){
            System.out.println("error arth");
        }

    }
        static void m1() throws Exception{
            System.out.println(1/0);
        }

}
