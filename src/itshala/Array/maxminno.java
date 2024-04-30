package itshala.Array;

public class maxminno {
    public static void main(String[] args) {
        int [] array = {10,200,30, 4 ,89};



        //MAX NUMBER
        int max = -20000000;  // Set max no as least


        for (int index =0 ; index <array.length;index++){
            if(max<array[index]){
                max= array[index];
            }
        }
        System.out.println("max: " + max);


        // MIN NUMBER
        int min = 400000000;


        for (int index = 0; index < array.length; index++) {
            if(min>array[index]){
                min = array[index];
            }
        }
        System.out.println("Min :" + min );

    }
}
