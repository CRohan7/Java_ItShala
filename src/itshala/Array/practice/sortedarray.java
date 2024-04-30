package itshala.Array.practice;

//Print Sorted Array
//Move all the negative elements to one side of the array


import java.util.Arrays;


public class sortedarray {
    public static void main(String[] args) {
        int[] array = {100,150,75,250,50};

        Arrays.sort(array);


        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }


        // Hence Minimum and Maximum can be found out esily

        System.out.println("Min: " + array[0]);
        System.out.println("Max: " + array[array.length-1]);
    }
}
