package itshala.Array.Array_MultiDimensional;

import java.util.Scanner;

public class matrix_addition {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Number of Rows for Array1:");
        int norows = scan.nextInt();

        System.out.print("Enter Number of Columns for Array1:");
        int nocol = scan.nextInt();


        int[][] array = new int[norows][nocol];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print("Array1: Enter Element for Row(" + row + "),Column(" + column + "): ");
                array[row][column] = scan.nextInt();
            }
        }

            System.out.print("Enter Number of Rows for Array2:");
            int norows2 = scan.nextInt();

            System.out.print("Enter Number of Columns for Array2:");
            int nocol2 = scan.nextInt();


            int[][] array2 = new int[norows2][nocol2];
            for (int row = 0; row < array.length; row++) {
                for (int column = 0; column < array2[row].length; column++) {
                    System.out.print("Array2: Enter Element for Row(" + row + "),Column(" + column + "): ");
                    array2[row][column] = scan.nextInt();
                }
            }

            System.out.println("Array1: ");
            for (int row = 0; row < array.length; row++) {
                for (int col = 0; col < array[row].length; col++) {
                    System.out.print(array[row][col] + " ");
                }
                System.out.println();
            }

            System.out.println("Array2: ");
            for (int row = 0; row < array2.length; row++) {
                for (int col = 0; col < array2[row].length; col++) {
                    System.out.print(array2[row][col] + " ");
                }
                System.out.println();
            }



          int [][] add = new int [array.length][array[0].length];
        for (int row = 0; row < add.length; row++) {
            for (int col = 0; col < add[0].length; col++) {
                add[row][col] = array[row][col] + array2[row][col];

            }
        }

        System.out.println("Array Add: ");
        for (int row = 0; row < add.length; row++) {
            for (int col = 0; col < add[row].length; col++) {
                System.out.print(add[row][col] + " ");
            }
            System.out.println();
        }





    }
    }

