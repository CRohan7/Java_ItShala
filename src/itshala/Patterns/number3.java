package itshala.Patterns;

//5
//5 4
//5 4 3
//5 4 3 2
//5 4 3 2 1

public class number3 {

    public static void main(String[] args)
    {

        int row = 5,k=5;
        for(int i=0; i<row; i++){
            k=5;
            for(int j=0;j<=i;j++){
                System.out.print(k-- +" ");
            }
            System.out.println();

        }

    }
}
