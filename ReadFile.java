package utils;

import java.io.File;
import java.util.Scanner;

public class ReadFile {
    public static String Read(String src) {
        File file = new File(src);
        String output = "";

        try {
            Scanner s = new Scanner(file.getAbsoluteFile());

            while (s.hasNextLine()) {
                output = output.concat(s.nextLine() + "\n");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

        return output;
    }
}
