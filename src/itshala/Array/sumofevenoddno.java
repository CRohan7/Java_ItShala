package itshala.Array;

public class sumofevenoddno {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        int esum =0;
        int osum=0;
        for (int index = 0; index < array.length; index++) {
            if(array[index]%2==0){
                esum = esum + array[index];
            }else{
                osum = osum+ array[index];
            }
        }
        System.out.println("EvenNoSum: "+ esum);
        System.out.println("OddNoSum: " + osum);
    }
}
