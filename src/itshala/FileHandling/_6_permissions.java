package itshala.FileHandling;


import java.io.File;
import java.io.IOException;

public class _6_permissions {
    public static void main(String[] args) throws IOException {
        File file = new File("abcde.txt");

        //set the permission
        file.setWritable(false);
        System.out.println("Permission set to readable");
        file.delete();
    }
}