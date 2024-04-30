package itshala.Abstraction;

public class abstraction_basics {
    public static void main(String[] args) {

        abstract class parent {
            // variable
            static int  a =10;
            int b =12;

            //methods
            static void m1(){
                System.out.println("From static method m1");
            }

            void m2(){
                System.out.println("From instance method m2");
            }

            //block
            static {
                System.out.println("From Static block");
            }

            {
                System.out.println("From Instance Block");
            }

            //constructor
            parent() {
                System.out.println("From parent constructor");
            }

            //inner classes

            abstract class b{
                static int b =  50;
                }
            abstract void m3();

        }




            class child extends parent{

                @Override
                void m3() {
                    System.out.println("From abstract method m3");
                }
            }

            child obj = new child();

        System.out.println( "Static variable "+ parent.a);  //static variable
        System.out.println("Instance variable "+obj.b);    // instance variable

        parent.m1();
        obj.m2();
        obj.m3();






        }


    }

