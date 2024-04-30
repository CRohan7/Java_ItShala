package itshala.Array.Array_MultiDimensional;

import java.util.Scanner;

public class user_input_array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Number of Rows:");
        int norows = scan.nextInt();

        System.out.print("Enter Number of Columns:");
        int nocol = scan.nextInt();


        int[][] array = new int[norows][nocol];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print("Enter Element for Row("+row+"),Column("+ column+"): ");
                array[row][column] = scan.nextInt();
            }
        }

        System.out.println("Array:");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + "  ");
            }
            System.out.println();
        }
    }
}