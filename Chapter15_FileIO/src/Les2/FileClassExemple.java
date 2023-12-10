package Les2;

import java.awt.*;
import java.io.*;
import java.nio.file.Path;

public class FileClassExemple {
    public static void main(String[] args) {
        Path path = Path.of("C:\\Users\\iliar\\IdeaProjects\\Java_Fundamentals2");
        //File aDir = path.toFile();
        File aDir = new File("C:\\Users\\iliar\\IdeaProjects\\Java_Fundamentals2");

        if(aDir.listFiles() != null){
            File[] files = aDir.listFiles();

            for(File f : files){
                if(f.isDirectory()){
                    System.out.println("Directory= "+f.getName());
                }
                else System.out.println("File= "+f.getName());
            }

        }

    }
}
