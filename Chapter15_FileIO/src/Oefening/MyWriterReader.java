package Oefening;

import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class MyWriterReader {
    private static Path pathMyFolder = Path.of("C:\\Users\\iliar\\IdeaProjects\\Java_Fundamentals2\\Chapter15_FileIO\\src\\Oefening\\myFolder");
    private static Path pathMessage = Path.of("C:\\Users\\iliar\\IdeaProjects\\Java_Fundamentals2\\Chapter15_FileIO\\src\\Oefening\\myFolder\\message.txt");
    private static Path pathAnimal  = Path.of("C:\\Users\\iliar\\IdeaProjects\\Java_Fundamentals2\\Chapter15_FileIO\\src\\Oefening\\myFolder\\animal.txt");
    private static Animal lievelingsdier = new Animal("Cat", false);
    private static FileWriter fileWriter = null;
    private static FileReader fileReader = null;
    private static Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;

    public static void main(String[] args)  {


        try {
            //1. create dirs/files if don't exist
            Path[] paths = {pathMyFolder, pathMessage, pathAnimal};
            createFiles(paths);

            //2. write and read file Message
            System.out.println("\nFile message.txt");
            String text = "Verschil tussen een hond en een kat:\n" +
                    "Een hond denkt: deze mensen geven me te eten, ontvlooien me, geven me een mand en aaien me, het moeten wel goden zijn.\n" +
                    "Een kat denkt: deze mensen geven me te eten, ontvlooien me, geven me een mand en aaien me, ik moet wel een god zijn.\n";
            writeAndReadFile(pathMessage.toString(), text);

            //3. write and read file Animal
            System.out.println("\nFile animal.txt");
            text = lievelingsdier.toString();
            writeAndReadFile(pathAnimal.toString(), text);

        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try{
                closeFileWriterOrReader(true);
                closeFileWriterOrReader(false);
            } catch (IOException e){
                e.printStackTrace();
            }
        }

    }

    public static void createFiles(Path[] paths) throws IOException {
        for(Path path : paths){
            if (!path.toString().contains(".txt")){
                if(!Files.exists(path)) Files.createDirectory(path);
            }
            else{
                if(!Files.exists(path)) Files.createFile(path);
            }
        }
    }

    public static void writeAndReadFile(String path, String text) throws IOException{
        fileWriter = new FileWriter(path);
        fileWriter.write(text);
        closeFileWriterOrReader(true);

        fileReader = new FileReader(path);
        int position;
        while ((position = fileReader.read()) != -1){
            System.out.print((char) position);
        }

        closeFileWriterOrReader(false);

        desktop.open(new File(path));
    }

    public static void closeFileWriterOrReader(boolean isWriter) throws IOException{
        if (fileWriter != null && isWriter) fileWriter.close();
        if (fileReader != null && !isWriter) fileReader.close();
    }

}
