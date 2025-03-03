package lessons.serialization;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filename = "student.txt";
        Student student = new Student();
        student.setId(1);
        student.setAge(20);
        student.setName("John");
        student.setSurname("Smith");

        try {
            SerializationUtil.serialize(student,filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Student studentNew = null;

        try {
            studentNew = (Student) SerializationUtil.deserialize(filename);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Student object is: " + "\n" + student);
        System.out.println("----------------------------");
        System.out.println("New student object is: " + "\n" + studentNew);

    }
}
