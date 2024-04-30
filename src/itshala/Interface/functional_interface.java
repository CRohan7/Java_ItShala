package itshala.Interface;

public class functional_interface {

    public static void main(String[] args) {


        @FunctionalInterface
        //Only one abstract method allowed in Interface
        interface iff{
            void m3();
            int a=99;
        }


        iff obj = new iff(){
            public void m3(){
                System.out.println("M3!");
            }
        };




        obj.m3();
    }
}
