package Les1;

import java.io.*;
import java.nio.file.Path;

public class BufferReaderExample {
    public static void main(String[] args) {
        try{
            BufferedReader bw = new BufferedReader(new FileReader("C:\\Users\\Intec\\Downloads\\test2.txt"));
            String str;
            while (!(str = bw.readLine()).isEmpty())
                System.out.println(str);
            bw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
