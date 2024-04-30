package itshala.FileHandling;

import java.io.File;

public class _2_createfolder {

    public static void main(String[] args) {
        // Create Folder
        File folder  = new File("080124");

        // Check folder already present or not
        boolean isFolder= folder.mkdir();
        System.out.println("Folder created " + isFolder);

    }
}
