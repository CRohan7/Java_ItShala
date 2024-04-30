package itshala.Abstraction;

public class overriding {

    abstract class p{
        abstract void m1();
    }


    class Child extends p{
        @Override
        void m1() {
            System.out.println("From child");
        }
    }
}
