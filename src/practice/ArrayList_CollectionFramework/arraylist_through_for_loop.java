package practice.ArrayList_CollectionFramework;
import java.util.ArrayList;


public class arraylist_through_for_loop {

    public static void main(String[] args) {
        ArrayList al = new ArrayList<Integer>();


        al.add( 0 , 10);
        al.add(1,20);
        al.add(2,30);
        al.add(3 , 40);


        System.out.println(al);

        System.out.println("Size of Al : "  + al.size());


        for(int i = 0; i< al.size() ; i++){

            System.out.println("ArrayList al: " + al.get(i));

        }

    }
}
