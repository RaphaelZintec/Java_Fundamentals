package Les1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReaderExample {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("C:\\Users\\Intec\\Downloads\\test.txt");
            int position;
            while((position = fileReader.read()) != -1){
                System.out.print((char) position);
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Deze bestand bestaat niet");
        } finally{
            try{
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}