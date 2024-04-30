package itshala.Inheritance;


interface One{
    int a=10;
}

interface Two{
    int b = 20;
}

class Three implements One, Two{

    int c = a+b;

}



public class Multiple {

    public static void main(String[] args) {
        Three obj = new Three();
        System.out.println(obj.c);
    }
}
