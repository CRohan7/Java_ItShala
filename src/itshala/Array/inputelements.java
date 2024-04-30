package itshala.Array;

import java.util.Scanner;

public class inputelements {
    public static void main(String[] args) {
        int [] array = new int[4];

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Elements: ");
        for (int i=0;i<array.length;i++){
            int a = scan.nextInt();
            array[i] = a;
        }
        System.out.print("Array : ");
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
    }
}
