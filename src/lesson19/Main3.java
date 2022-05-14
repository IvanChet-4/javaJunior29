package lesson19;

import java.io.File;
import java.io.FileFilter;

public class Main3 {
    public static void main(String[] args) {
        File startDir = new File("C:\\Users\\MTSUser\\Downloads");
//        if (startDir.exists()){
//            startDir.mkdirs();
//        }

        File[] files = startDir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.getName().endsWith(".txt") || pathname.getName().endsWith(". txt")) {
                return false;
                }
                return true;
            }
        });
        for (File f:files){
            System.out.println(f.getName());
        }

    }
}
