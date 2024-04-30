package itshala.Array;

public class SumOfArray {
    public static void main(String[] args) {

        int [] array = {10,20,15};
        int sum=0;
        for (int index = 0; index < array.length; index++) {
            sum = sum + array[index];

        }
        System.out.println("SumOfArray: " + sum);
    }
}
