package itshala.Method_overloading_riding;

public class constructor_overloading {


        constructor_overloading() {
            System.out.println("zero param con");
        }

        constructor_overloading(int i) {
            System.out.println("parameterized cons");
        }

        public static void main(String[] args) {
            constructor_overloading demo2 = new constructor_overloading();
            constructor_overloading demo3 = new constructor_overloading(10);
        }
    }

