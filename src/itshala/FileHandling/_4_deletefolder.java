package itshala.FileHandling;

import java.io.File;

public class _4_deletefolder {
    public static void main(String[] args) {
        File folder  =  new File("0102");

        boolean check  = folder.mkdir();
        System.out.println(check);

        // Delete Folder
        System.out.println("Deleted!" + folder.delete());
    }
}
