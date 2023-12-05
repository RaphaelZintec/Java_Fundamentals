package Les1;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriterExample {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try{
            Path path = Path.of("C:\\Users\\Intec\\Downloads\\test.txt");
            Files.createDirectories(path.getParent());
            fileWriter = new FileWriter(path.toString());
            fileWriter.write("Hi");
            fileWriter.write("\nHello");
            fileWriter.write("\nBonjour");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null){
                try{
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
