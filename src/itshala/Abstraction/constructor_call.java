package itshala.Abstraction;


abstract class p{
    p(){
        System.out.println("From p");
    }
}


class constructor_call extends p{
    constructor_call (){
        System.out.println("From child");
    }


    public static void main(String[] args) {

        constructor_call obj = new constructor_call();





    }



}





