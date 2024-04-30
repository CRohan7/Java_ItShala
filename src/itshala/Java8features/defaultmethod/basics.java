package itshala.Java8features.defaultmethod;

interface i {

    void m1();

    default void m2(){
        System.out.println("From default");
    }
    // no need to override

    }

    class  basics implements i {
        @Override
        public void m1() {
            System.out.println("From m1 ");
        }

        public static void main(String[] args) {
            basics b = new basics();
            b.m1();
            b.m2();
        }
}
