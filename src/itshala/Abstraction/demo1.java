package itshala.Abstraction;
// When abstract class extends another abstract class
// its optional for child abstract class to override the methods
//of the parent abstract class
//But it must be overridden by the concrete class




public class demo1 {

    public static void main(String[] args) {
        abstract class ac{
            abstract void m1();
        }

        abstract class ac2 extends ac{

            abstract void m2();
          }

        class cl extends ac2{
            @Override
            void m1(){
                System.out.println("Overrided m1");
            }

            @Override
            void m2(){
                System.out.println("Overrided m2");
            }
        }
    }

}
