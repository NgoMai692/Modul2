import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String address;
    private double mediumScore;
    public static int ID = 1;
    private int id;


    public Student() {
    }

    public Student(String name, int age, String gender, String address, double mediumScore) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.mediumScore = mediumScore;
        this.id = ID++;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMediumScore() {
        return mediumScore;
    }

    public void setMediumScore(double mediumScore) {
        this.mediumScore = mediumScore;
    }

    public int getId() {
        return this.id;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                "id=" + this.id +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", mediumScore=" + mediumScore +
                '}';
    }
}
