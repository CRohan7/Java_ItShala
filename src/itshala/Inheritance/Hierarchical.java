package itshala.Inheritance;

class Father{
    int a=100;
}

class Son1 extends Father{
    int b = a+20;
}

class Son2 extends Father{
    int c = a+30;

}

public class Hierarchical {
    public static void main(String[] args) {
        Son1 obj1 = new Son1();
        Son2 obj2= new Son2();

        System.out.println(obj1.b);
        System.out.println(obj2.c);

    }

}
