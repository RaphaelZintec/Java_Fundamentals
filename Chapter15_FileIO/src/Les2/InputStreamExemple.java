package Les2;

import java.awt.*;
import java.io.*;

public class InputStreamExemple {
    public static void main(String[] args) {
        String source = "C:\\Users\\iliar\\IdeaProjects\\Java_Fundamentals2\\test.txt";
        String destination = "C:\\Users\\iliar\\IdeaProjects\\Java_Fundamentals2\\test2.txt";

        try(InputStream inputStream = new FileInputStream(source);
            OutputStream outputStream = new FileOutputStream(destination)){

            byte[] buffer = new byte[1024];
            int byteRead;

            while ((byteRead = inputStream.read(buffer))!=-1)
                outputStream.write(buffer, 0, byteRead);

            System.out.println("File copy done");

            Desktop desktop = Desktop.getDesktop();
            desktop.open(new File(destination));

        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
