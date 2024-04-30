package itshala.String_Handling;

public class equality {
    public static void main(String[] args) {

        String st1 = new String("hi");

        String st2  = "hi";

        System.out.println(st1==st2);            //false
        System.out.println(st1.equals(st2));//true


         String str1 = "abc";
         String str2 = "abc";
         String str3 = new String("abc");
         String str4 = new String("abc");
         System.out.println(str1 == str2);//true

        System.out.println(str1 == str3);//false
        System.out.println(str1 == str4);//false
        System.out.println(str3 == str4);//false

    }
}
