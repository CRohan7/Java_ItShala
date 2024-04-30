package itshala.Array;

import java.sql.SQLOutput;

public class linearsearch {
    public static void main(String[] args) {

        // Int search
        int [] array1 = {100,20,3, 10 ,4};
        int search = 3;

        boolean flag = false;
        for (int index = 0; index < array1.length; index++) {
            if (search == array1[index]) {
                flag = true;
            }
        }
        if(flag==true){
            System.out.println("Searched");
        }else{
            System.out.println("not found");
        }

        //STRING SEARCHING

        String [] array2 = {"MH" , "GJ" , "MP", "RAJ"};
        boolean flag2=false;
        String s  = "RAJ";
        for (int i = 0; i< array2.length; i++){
            if(s.equals(array2[i])){
                flag2 = true;
            }
        }
        if(flag2==true){
            System.out.println("String Searched");
        }else{
            System.out.println("String not found");
        }

    }
}
