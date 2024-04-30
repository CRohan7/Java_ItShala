package itshala.Array.ObjectArray;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class basics {
    public static void main(String[] args) {

        Object[] ary =new Object[3];

        ary[0] = 7;            //integer
        ary[1] = "C.Ronaldo";  //string
        ary[2] = true;         //boolean


        System.out.print("array : ");
        for(Object temp: ary){
            System.out.print(temp + " ");
        }


    }
}
