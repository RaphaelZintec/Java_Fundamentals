package Les1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterExample {
    public static void main(String[] args) {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Intec\\Downloads\\test2.txt"));
            bw.write("Writing to a file.");
            bw.write("\nHere is our file.");
            bw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
