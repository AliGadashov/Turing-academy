package lessons.serialization;

import java.io.Serializable;

public class Student implements Serializable {

    private long id;
    private String name;
    private String surname;
    private transient int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Student() {
    }

    public Student(long id, int age, String name, String surname) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return  "Student-> " + '\n' +
                "Name: " + name + '\n' +
                "Surname: " + surname + "\n" +
                "Age: " + age;
    }
}
