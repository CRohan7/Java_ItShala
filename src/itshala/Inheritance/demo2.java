package itshala.Inheritance;

public class demo2 {
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

        B obj = new B();
        obj.m1();
        obj.m2();
        //obj.m3();  Not accessable


    }
}
