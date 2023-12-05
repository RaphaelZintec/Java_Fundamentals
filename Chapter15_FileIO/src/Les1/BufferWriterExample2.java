package Les1;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterExample2 {
    public static void main(String[] args) throws IOException {
        String[] names = {"Jhon", "Leen", "Emy"};
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Intec\\Downloads\\test2.txt"));
            bw.write("Writing to a file.");
            bw.write("\nHere is our file..\n");
            for(String e : names)
                bw.write("\n"+e);
            bw.close();

        }catch(IOException e){
            e.printStackTrace();
        }

        Desktop desktop = Desktop.getDesktop();
        desktop.open(new File("C:\\Users\\Intec\\Downloads\\test2.txt"));
    }
}
