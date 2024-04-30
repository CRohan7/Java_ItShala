package itshala.Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListt {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        //add
        arrayList.add(1);        //add element 1 into arrayList
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        

        // addAll
        // adds one arraylist ot another arraylist

        ArrayList<Integer> ary2 = new ArrayList<Integer>();
        ary2.addAll(arrayList);       // arraylist copied into ary2


        // remove
        arrayList.remove(2);      // 2 is deleted



        //removeAll

        arrayList.removeAll(ary2);       //empty

        //removeIf

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        arrayList.removeIf(n-> (n%2==0)); //even numbers are deleted


        //clear

        arrayList.clear();    //all deleted from arrayList



        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);


        //retainAll

        //contains
        boolean bool = arrayList.contains(3);   // 3 present or not
        System.out.println(bool);          //true

        //containsAll

        //size
        int a =arrayList.size(); //5
        System.out.println(a);


        //isEmpty
        System.out.println(arrayList.isEmpty());   //false as elements are present

        //sort

        ArrayList<Integer> array3 = new ArrayList<Integer>();
        array3.add(10);
        array3.add(64);
        array3.add(155);
        array3.add(46);
        array3.add(34);

        System.out.println(array3); //[10, 64, 155, 46, 34]

        Collections.sort(array3);  //[10, 34, 46, 64, 155]
        System.out.println("Sorted: "+array3);


    }

}