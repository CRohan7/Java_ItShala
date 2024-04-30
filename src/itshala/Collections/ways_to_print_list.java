package itshala.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.function.Consumer;


public class ways_to_print_list {

    public static void main(String[] args) {

        ArrayList array = new ArrayList<Integer>();

        array.add(1);
        array.add(3);
        array.add(2);
        array.add(4);
        array.add(5);

        Collections.sort(array);



        // Method1 : Using toString
        System.out.println(array.toString());

        System.out.println();


        // Method2: for loop
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i)+" ");
        }

        System.out.println();

        // Method3: enhanced for loop: foreach
        for (Object temp:array
             ) {
            System.out.println(temp);
        }

        System.out.println();

        // Method4: Java8 feature: default method
        Consumer<Integer> consumer = (number)-> System.out.println(number);
        array.forEach(consumer);

        System.out.println();


        // Method5: Iterator

        Iterator<Integer> iterator = array.listIterator();
















    }

}


