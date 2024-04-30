package itshala.Array;

public class SecondMax {
    public static void main(String[] args) {
        int[] array = {1,2,8,4,62,6,9};

        int max = -200000000;
        int smax = -200000000;
        for (int index = 0; index < array.length; index++) {
            if(max<array[index]){
                smax = max;
                max = array[index];
            }
            else if (smax<max && smax<array[index]){
                smax = array[index];
            }
        }

        System.out.println("Max: " + max );
        System.out.println("Second Max: " + smax);



    }
}
