package fileIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("src/fileIO/file.txt");
        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.println((char)ch);
        }
        reader.close();

        FileWriter writer = new FileWriter("src/fileIO/file.txt");
        writer.write("Hello World");
        System.out.println("Done");
        writer.close();

    }
}
