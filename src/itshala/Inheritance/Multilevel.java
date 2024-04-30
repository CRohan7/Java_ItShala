package itshala.Inheritance;


class Aa{
    int a=100;
}


class Bb extends Aa{

    int b = a+10;
}


class Cc extends Bb{

    int c = b+1;

}


public class Multilevel {
    public static void main(String[] args) {
        Cc obj = new Cc();
        System.out.println(obj.c);

    }

}
