package lessons.fileIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("src/lessons/fileIO/file.txt");
        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.println((char)ch);
        }
        reader.close();

        FileWriter writer = new FileWriter("src/lessons/fileIO/file.txt",true);
        writer.write("Hello World");
        System.out.println("Done");
        writer.close();

    }
}
