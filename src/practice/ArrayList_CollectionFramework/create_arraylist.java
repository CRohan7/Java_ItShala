package practice.ArrayList_CollectionFramework;


import java.util.ArrayList;

// SYNTAX:
// ArrayList<Integer> al = new ArrayList<Integer>();

// SYNTAX: Adding element in Arraylist
//Arraylistname.add(Index , element );




public class create_arraylist {


    public static void main(String[] args) {

        // Building Dynamic ArrayList

        //integer type
        ArrayList<Integer> al = new ArrayList<Integer>();



        al.add(0,44);
        al.add(1 , 55);
        al.add (2 , 66);

        System.out.println(al);

        // string type
        ArrayList<String> all  = new ArrayList<String>();
        all.add("Rohan");
        all.add("Mohan");
        all.add("Sohan");

        System.out.println(all);


        ArrayList<Float> fl = new ArrayList<Float>();

        fl.add(5454.33f);
        fl.add(6.655f);

        System.out.println(fl);



    }
}
