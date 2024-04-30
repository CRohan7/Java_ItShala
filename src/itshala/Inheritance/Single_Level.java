package itshala.Inheritance;
// SINGLE LEVEL INHERITANCE


class A{
    int a = 100;
    void sound(){
        System.out.println("Hi From A");
    }
}
class B extends A{
    int b = a+1;
    void meth(){
        System.out.println("From B");
    }
}


class Single_Level {

    public static void main(String[] args) {

        B obj = new B();

        System.out.println("B: "+ obj.b);
        obj.meth();
        obj.sound();

    }
}
















