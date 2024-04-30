
// How are you Doing!
// little disappointed, Fine btw......................1020...11/12
// numb unaffected ...................................1000...12/12
// unaffected, going on and on........................0943...13/12
// nothing new, all normal just little fresh..........1030...14/12
// All good..going on and on..........................1040...15/12
// Nothing new........................................1020...18/12
// Cold outside, feeling little lost, focused.........0940...20/12
// Vibrant heart, Unstable Mind.......................0940...22/12
// All back to normal, day looks to be shorter........1030...26/12
// Feeling free as holiday today for preparation......1020...27/12
// Little lost but not satisfied today................1015...28/12
// Long break at Phaltan..............................1016...05/01
// This week seems to long ...........................1002...10/01
// Trying to be focused on exam, missing shubya.......1010...11/01
// Back after long time. Feeling that some
// good is about to happen............................1100...22/01
// Balanced. Back to Normal life..Hoping for good.....0952...23/01
// Balanced. Normally Excited. CDAC Result today......1037...25/01
// Normal. All settled................................1050...30/01
// Soo calm and composed...Time is near...............1002...07/02
// Free as a bird...normal day........................1050...13/02












import java.util.Collections;
import java.util.ArrayList;

import java.util.function.Consumer;

public class cr{




    interface NumberProcessor{
        String process(String msg);

        ;
    }



    static class crr implements NumberProcessor{

        @Override
        public String process(String msg){
            System.out.println("FRom crr");
            return msg;
        }
    }


    public static void main(String[] args){


        crr obj = new crr();
        String temp = obj.process("hieeeeeeeeeeee");
        System.out.println(temp);



        Consumer consumer = (input)-> System.out.println(input);
        consumer.accept("Input entered");





    }
}

















