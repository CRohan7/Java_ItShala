package itshala.Array.Array_MultiDimensional;

public class accessing_matrix {
    public static void main(String[] args) {
        int [][] ary = {
                {11,22,33},
                {44,55,11,44},
                {77,88,99,12,13,43}
        };

        for (int row = 0; row < ary.length; row++) {
            for (int col = 0; col < ary[row].length; col++) {
                System.out.print(ary[row][col]+ " ");
            }
            System.out.println();
        }
    }
}
