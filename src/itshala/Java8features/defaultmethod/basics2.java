package itshala.Java8features.defaultmethod;



interface inf {

    void m1();

    default void m2(){
        System.out.println("From default");
    }
    // no need to override

}
class basicss implements inf{
    @Override
    public void m1() {

    }
}

class  basics2 implements inf {
    @Override
    public void m1() {
        System.out.println("From m1 ");
    }

    public static void main(String[] args) {
        basics2 b = new basics2();
        b.m1();
        b.m2();
    }
}