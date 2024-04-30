package itshala.Patterns;

//1
//2 2
//3 3 3
//4 4 4 4
//5 5 5 5 5
//6 6 6 6 6 6
//7 7 7 7 7 7 7
//8 8 8 8 8 8 8 8
//9 9 9 9 9 9 9 9 9


public class number1 {
    public static void main(String[] args) {


        int row=9;

        int k=1;

        for(int i = 0; i<row;i++){
            for (int j = 0;j<=i;j++){
                System.out.print( k +" ");
            }
            k++;
            System.out.println();
        }



    }
}

