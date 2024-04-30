package itshala.Array.practice;


//Find the occurrence of an integer in the array
public class occurence {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,2, 2,2};
        int count=0;
        int cno=2;

        for (int index = 0; index < array.length; index++) {

            for (int i = 0; i < args.length; i++) {



            }
            if(cno==array[index]){
                count++;
            }
        }
        System.out.println("Element '2' occurred : "+ count+" times");
    }
}
