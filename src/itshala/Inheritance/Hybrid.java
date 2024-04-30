package itshala.Inheritance;



class a1{
    int a =100;
}

interface b1{
    int bb=10;
}
interface b2{
    int bbb= 20;
}

class C  implements b1, b2{
    int c = 200;
}

class D extends C{
    int d = c+bb+bbb ;
}

public class Hybrid {
    public static void main(String[] args) {
        D obj = new D();
        System.out.println(obj.d);
    }
}
