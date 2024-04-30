package itshala.Array.JaggedArray;

public class basics {
    public static void main(String[] args) {

        //when column size is not fixed then array is jagged array


        int[][] array = {
                {1, 2, 3, 4},
                {2, 3,},
                {0},
                {6, 6, 6, 6, 6, 6}
        };

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
    }

    }
