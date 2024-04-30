package itshala.String_Handling;

import com.sun.tools.javac.Main;

public class lowercase {

    static void print(char[] array){

        for( char temp : array){
            System.out.print(temp);
        }
        System.out.println();


    };


    static void lower(char[] array){

        for(int index =0 ; index<array.length ; index++){

            if( array[index]>='A' && array[index]<='Z' ){
                array[index] = (char) (array[index ] + 32);
            }

        }


    };




    public static void main(String[] args) {
        // Array
        char[] array = {'A','B','C','D'};

        print(array);
        lower(array);
        print(array);












    }
}
