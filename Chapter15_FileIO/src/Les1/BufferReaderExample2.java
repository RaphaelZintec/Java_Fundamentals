package Les1;

import java.awt.*;
import java.io.*;

public class BufferReaderExample2 {
    public static void main(String[] args) throws IOException {
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Intec\\Downloads\\test2.txt"));
            String line;
            while ((line= br.readLine())!=null)
                System.out.println(line);
            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
