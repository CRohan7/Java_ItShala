package practice.ArrayList_CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class crud_element {
    public static void main(String[] args) {



        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(11);
        al.add(22);
        al.add(33);
        al.add(44);
        al.add(55);
        System.out.println(al);  //[11, 22, 33, 44, 55]



        // Remove
        al.remove(0);
        System.out.println(al);  //[22, 33, 44, 55]

        // Update
        al.set(1 , 30);
        System.out.println(al);  //[22, 30, 44, 55]

        // Access
        int a = al.get(2);
        System.out.println("A: " + a);


        // Sort
        Collections.sort(al);
        System.out.println(al);  //[22, 30, 44, 55]



        // Clear Array
        al.clear();

        // Get Size
        System.out.println(al.size());

    }
}
