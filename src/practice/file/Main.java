package practice.file;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
        binaryWrite();
    }

    public static void createFile() {
        try {
            File file = new File("Newfile.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.getMessage();
        }
    }

    public static void deleteFile() {
        File file = new File("/home/gadashov/IdeaProjects/Turing-academy/Newfile.txt");

        if (file.delete()) {
            System.out.println("File deleted successfully");
        } else {
            System.out.println("Failed to delete the file");
        }
    }

    public static void checkingFileProperties() {
        File file = new File("Newfile.txt");
        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Parent file: " + file.getParentFile());
            System.out.println("Total space:" + file.getTotalSpace());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writeable: " + file.canWrite());
            System.out.println("Length: " + file.length());
        } else {
            System.out.println("File does not exist");
        }
    }

    public static void writeToFile() throws IOException {
        FileWriter writer = new FileWriter("src/lessons/fileIO/file.txt", true);
        writer.write("Hello World");
        System.out.println("Done");
        writer.close();
    }

    public static void readingFromFile() throws IOException {
        FileReader reader = new FileReader("src/lessons/fileIO/file.txt");
        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.println((char) ch);
        }
        reader.close();
    }

    public static void writeViaBufferedWrite() {

        try {

            FileWriter file = new FileWriter("file.txt");

            BufferedWriter bufferedWriter = new BufferedWriter(file);

            bufferedWriter.write("Hello New World");

            bufferedWriter.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

    }

    public static void readViaBufferedRead() {

        try {

            FileReader file = new FileReader("file.txt");
            BufferedReader bufferedReader = new BufferedReader(file);
            String s = bufferedReader.readLine();
            System.out.println(s);
            bufferedReader.close();

        } catch (Exception e) {
            e.getStackTrace();
        }


    }

    public static void binaryWrite() {

        File file = new File("file.txt");
        byte[] data = "ABCD".getBytes(StandardCharsets.UTF_8);

        try (FileOutputStream fos = new FileOutputStream(file))
        {
            fos.write(data);
            System.out.println("Successfully written data to the file");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void binaryRead() {

        File file = new File("file.txt");
        byte[] data = "ABCD".getBytes(StandardCharsets.UTF_8);




    }

    public static void searchWordInFile() {
    }

    public static void mergeFiles() {
    }

}
