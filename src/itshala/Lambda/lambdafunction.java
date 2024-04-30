package itshala.Lambda;

import java.util.function.Consumer;

public class lambdafunction {


    public static void main(String[] args) {

        Consumer consumer = (input)-> System.out.println(input);
        consumer.accept("Input goes here");


    }

}
