package itshala.Method_overloading_riding;

public class main_method_overriding {

        static class Parent {
            public static void main(String[] args) {
                System.out.println("Parent main method");
            }
        }

        static class Child extends Parent {
            public static void main(String[] args) {
                System.out.println("Child Main method");
            }
        }

        public static void main(String[] args) {
            Parent.main(null);
            Child.main(null);
        }
    }

