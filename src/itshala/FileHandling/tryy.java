package itshala.FileHandling;

import java.io.File;
import java.io.IOException;

public class tryy {
    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 10; i++) {
            File file = new File("02012024/i" + i + ".txt");
            file.createNewFile();
        }
        System.out.println("1000 files created");
    }
}