package itshala.AnonymousClass;


public class anon_class {


    public static void main(String[] args) {



        interface msg{
            void m1(int a);
        }

        // Anonymous Class
        msg obj1 = new msg(){
            @Override
            public void m1(int a){
                System.out.println();
            }
        };



        //Anonymous class


        // This call can extend
        // 1.Concrete
        // 2.Abstract
        // 3.Interface



        abstract class A{

            int a=10;


            void m1(int a){};

        }


        A a = new A(){
            @Override
            void m1(int a){
                System.out.println("From m1: "+ a);
            }
        };

        System.out.println(a.a);
        a.m1(545);




        interface aa {

            int a=1;

            void an();

        }

        aa obj  = new aa(){
            @Override
            public void an(){
                System.out.println("Rohan Chavan");
            }
        };

        obj.an();
}
}
