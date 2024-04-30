package itshala.ExceptionHandling;

public class finally2 {
    public static void main(String[] args) {
        int i;
        try{
             i =10;
        }catch(Exception e){
            i = 15;
        }finally {
            i =20;

        }
        System.out.println(i);  //20
    }
}
