package itshala.Inheritance;

public class demo4 {
    public static void main(String[] args) {
        class A{
            int a=1;
            void m1(){
                System.out.println("From m1");
            }
        }

        class B extends A{

            void m2(){
                System.out.println("From m2");
            }

        }


        A obj = new B();
        obj.m1();
        // Accessable as m1 is present in both classes

        // obj.m2();
        // Not accessable as m2 not present in A class

        System.out.println(obj.a);
        // Accessable as variable is present in both classes



    }
}
