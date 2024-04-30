package practice.LinkedList;

import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();

        //Add
        ll.add(22);
        ll.add(11);
        //Print
        System.out.println(ll);
        //Remove
        ll.remove(0);
        System.out.println(ll);
        // Update
        ll.set(0, 33);
        System.out.println(ll);

    }

}

//[22, 11]
//[11]
//[33]
