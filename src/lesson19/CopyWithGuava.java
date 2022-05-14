package lesson19;
//import com.google.common.io.Files;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

public class CopyWithGuava implements CopyUtils {

    @Override
    public void copy(String from, String to) {
        File fromFile = new File(from);
        File toFile = new File(to);
        try {
            Files.copy(fromFile, toFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}