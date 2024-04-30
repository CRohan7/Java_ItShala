package itshala.FileHandling;

import java.io.File;
import java.io.IOException;

public class _7_createbulkfile {
    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 10; i++) {
            File file  = new File("0102/i" + i + ".txt");
            file.createNewFile();
        }

        System.out.println("10 files created");
    }
}
