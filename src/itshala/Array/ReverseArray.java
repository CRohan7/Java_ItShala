package itshala.Array;

public class ReverseArray {
    public static void main(String[] args) {


        int [] array  = {1,2,3,4,5,6,7};
        int temp=0;

        for (int left=0 ,  right = array.length -1; left<right ; left ++, right--){
            temp = array[left];
            array[left] = array[right];
            array[right]= temp;
        }

        for (int index = 0; index < array.length; index++){
            {
                System.out.print(array[index] + " ");
            }
        }
    }
}
