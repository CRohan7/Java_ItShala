package itshala.throwskeyword;

// Unchecked exceptions or Run time exceptions are by default thrown to the caller
// No need to throw runtime exceptions to the caller
public class implicit_throw {
    public static void main(String[] args) {

            try{
                m2();
            }catch(ArithmeticException arth){
                System.out.println("error arth");
            }

        }
        static void m2() {
            System.out.println(1/0);
        }

    }

