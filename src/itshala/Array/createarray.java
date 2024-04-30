package itshala.Array;

public class createarray {

    public static void main(String[] args) {

        //Array with defined size and elements

        //int type array
        int [] a = {1,2,3};

        int [] b = {};

        //String type
        String[] c = {"MH" , "RAJ"};


        // Array with only defined size
        int[] array = new int[5];  //size = 5

        //Array with zero size
        int[] array2 = new int[0];  //size = 0

        //Array with Negative size //CTE
        int[] array3 = new int[-55];  //size = -7  //NegativeArraySizeException


    }
}
