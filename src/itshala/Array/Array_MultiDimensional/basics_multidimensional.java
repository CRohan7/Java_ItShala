package itshala.Array.Array_MultiDimensional;

public class basics_multidimensional {
    public static void main(String[] args) {


        // CREATE 2D ARRAY
        int [][] ary = {
                {1,2,3,4}, {10,20}};
        // {1,2,3,4} -> This array element is stored at index = 0
        // {10,20} -> This array element is stored at index = 1

        // In {1,2,3,4} array -> 1 is stored at index = 0, 2 at index = 1...and so on....
        // Hence, in integer array 'ary' ->  1is stored at index=[0][0]

        // SIZE OF ARRAY
        System.out.println( "Array Length: "+ary.length ); //2


        // SIZE of ARRAY ELEMENTS

        System.out.println( "First Element Size: "+ ary[0].length);
        System.out.println( "Second Element Size: "+ ary[1].length);

        // PRINTING ELEMENTS

        System.out.println("ary[0][1]:"+ ary[0][0]);
        System.out.println("ary[0][1]:"+ ary[0][1]);
        System.out.println("ary[0][1]:"+ ary[0][2]);
        System.out.println("ary[1][0]:"+ ary[1][0]);
        System.out.println("ary[1][1]:"+ ary[1][1]);


        // USING LOOP
        System.out.print("Using Loop -> ");
        for (int row = 0; row < ary.length; row++) {
            for (int column = 0; column< ary[row].length; column++) {
                System.out.print(ary[row][column] + " ");
            }

        }





    }
}
