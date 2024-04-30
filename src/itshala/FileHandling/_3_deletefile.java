package itshala.FileHandling;

import java.io.File;
import java.io.IOException;

public class _3_deletefile {

    public static void main(String[] args) throws IOException{
        // Create File
        File file1  = new File("xyz.txt");
        boolean checkf = file1.createNewFile();

        // Delete File
        System.out.println("File deleted! " + file1.delete());
    }
}
