package itshala.Abstraction;

public class demo2{
    public static void main(String[] args) {
        abstract class A{
            int a=1;
        }

        abstract class B extends A{
            int a=12;
        }

        class C extends B{
            int a=123;
        }


        A obj1 = new C();
        System.out.println(obj1.a); //1


        B obj2  = new C();
        System.out.println(obj2.a);  //12

        C obj3 = new C();
        System.out.println(obj3.a);  //123


    }
}
