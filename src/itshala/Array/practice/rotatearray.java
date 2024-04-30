package itshala.Array.practice;

public class rotatearray {

    public static void main(String[] args) {


        int [] array = { 1,2,3,4,5 };

        System.out.print("Given Array: ");
        for(int temp : array){
            System.out.print(temp+" ");
        }
        System.out.println();

        int last = array[array.length-1];

        for (int index = array.length -1; index >0; index--) {
            array[index] = array[index - 1];

        }
        array[0] = last;

        System.out.print("Rotated Array: ");
        for(int temp : array){
            System.out.print(temp+" ");
        }


    }
}
