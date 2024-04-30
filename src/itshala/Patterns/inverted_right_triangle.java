package itshala.Patterns;

//* * * * *
//* * * *
//* * *
//* *
//*

public class inverted_right_triangle {
    public static void main(String[] args) {

        int rows = 5;
        for (int i=0 ; i<6 ; i++) {
            for (int j = rows - i;j>0 ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


