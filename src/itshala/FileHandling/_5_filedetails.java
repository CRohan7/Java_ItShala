package itshala.FileHandling;
import java.io.File;
import java.io.IOException;

public class _5_filedetails {
    public static void main(String[] args) throws IOException {
        File file = new File("abcd.txt");
        System.out.println("File created " + file.createNewFile());
        System.out.println("path "+file.getAbsolutePath());
        System.out.println("Length of File "+file.length());
        System.out.println("Is it file "+file.isFile());
        System.out.println("Is it folder "+file.isDirectory());
    }
}