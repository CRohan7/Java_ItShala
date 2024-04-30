package itshala.Enhanced_for_loop;

public class enhanced_for_loop {
    public static void main(String[] args) {
        //INT ARRAY
        int [] ary = {1,2,3,4,5};
        System.out.print("Array: ");
        for(int temp : ary){
            System.out.print(temp+" ");
        }
        System.out.println();

        //CHARACTER ARRAY
        char [] ary1 = {'a','b','c','d'};
        System.out.print("Char Array:");
        for(char st: ary1){
            System.out.print(st+" ");
        }

    }
}
