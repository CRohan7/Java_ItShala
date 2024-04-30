package itshala.Finall;


// As basic says that final variables cannot be reassigned.
// But we have a method where final variables can be initialized
// firstly and then assigned value using parameterised constructor.


public class constructor {


    public static void main(String[] args) {
        class A{

            private final int i;


            private final String name;

            A(int i, String name) {
                this.i = i;
                this.name= name;
            }
        }

        A obj = new A(100 , "Rohan");

        System.out.println(  "I : " + obj.i);
        System.out.println("Name : " + obj.name);

        // obj.i = 45;   CTE as final variable cannot be reassigned

    }
}
