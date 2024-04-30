package itshala.Interface;



interface father{

    // Variables are by default public static final

    // Methods are public abstract

    // Inner classes are public static

    int a = 10;
}

interface child{
    int a = 100;
}


public interface intro extends father, child{
    public static void main(String[] args) {
        System.out.println(father.a);
        System.out.println(child.a);
    }
}

