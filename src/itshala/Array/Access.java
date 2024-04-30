package itshala.Array;

public class Access {
    public static void main(String[] args) {


        int [] array = {1,2,3,4};

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        //System.out.println(array[4]);  //CTE  //ArrayIndexOutOfBoundsException

        //Access through loop

        System.out.println("Through loop: ");
        for (int index = 0; index <array.length ; index++) {
            System.out.print(array[index] + " ");
        }
        System.out.println();
        //Enhanced For loop
        System.out.println("Enhanced for loop:");
        for (int temp: array){
            System.out.print(temp + " ");
        }
    }
}
