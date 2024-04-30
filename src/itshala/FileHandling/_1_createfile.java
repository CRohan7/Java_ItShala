package itshala.FileHandling;


import java.io.File;
import java.io.IOException;

public class _1_createfile {


    public static void main(String[] args) throws IOException {
        //Create File
        File file  = new File("abc.txt");

        //Check whether file is created with same name or not
        boolean isFile = file.createNewFile();

        System.out.println("File Created " + isFile);
    }
}
