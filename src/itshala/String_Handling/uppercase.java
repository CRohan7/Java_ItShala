package itshala.String_Handling;

import java.util.Scanner;

public class uppercase {


    static void print(char[] array){

        for (char temp : array) {
            System.out.print(temp );
        }
        System.out.println();

    };
    static void upper(char[] array){

         for (int index = 0; index < array.length; index++) {
             if (array[index] >= 'a' && array[index]<='z') {
                 array[index] = (char)  (array[index] -32);
             }

         }

     };

    public static void main(String[] args){



        char[] array = { 'a','b','c','d' };


        print(array);
        upper(array);
        print(array);







    }
}
