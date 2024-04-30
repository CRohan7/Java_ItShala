package itshala.Inheritance;

public class demo1 {


    public static void main(String[] args) {

        class A{
            void m1(){
                System.out.println("From m1");
            }
        }

        class B extends A{

            void m2(){
                System.out.println("From m2");
            }

        }

        class C extends B{


            void m3(){
                System.out.println("From m3");
            }
        }

        C c = new C();

        c.m1();
        c.m2();
        c.m3();



    }
}
