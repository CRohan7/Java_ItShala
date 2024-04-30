package itshala.Collections;

import java.util.ArrayList;

public class forEach {

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<Integer>();

        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

        array.forEach(System.out::println);




    }
}
