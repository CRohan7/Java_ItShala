package itshala.Array;

public class SecondMin {
    public static void main(String[] args) {
        int [] array = {124,356,67,43,5,11};

        int min=222222222;
        int smin = 222222222;

        for (int index = 0; index < array.length; index++) {
            if(min>array[index]){
                smin=min;
                min=array[index];
            }else if(smin<array[index] && smin>min ) {
                smin=array[index];
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Smin :" + smin);

    }
}
