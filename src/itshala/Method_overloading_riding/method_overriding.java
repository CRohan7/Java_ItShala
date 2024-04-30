package itshala.Method_overloading_riding;

public class method_overriding {


    public static void main(String[] args) {



        class father{

            static void m1(){
                System.out.println("From father m1");
            }
        }

        class Child extends father{

            public static void m1(){
                System.out.println("From child: " );
            }


        }
        Child child = new Child();

        child.m1();

    }


}
