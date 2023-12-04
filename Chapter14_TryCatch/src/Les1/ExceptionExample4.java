package Les1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionExample4 {
    public static void main(String[] args) {
        String a = "C:\\Users\\Intec\\Downloads\\javacodes.docx";

        try {
            FileInputStream file = new FileInputStream(a);
            System.out.println("file exists");
        } catch (Exception e){
            System.out.println(e);
            System.out.println("file doesn't exist");
        } finally {
            System.out.println("final code");
        }

    }
}
