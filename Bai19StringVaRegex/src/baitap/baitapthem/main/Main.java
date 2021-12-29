package baitap.baitapthem.main;

import baitap.baitapthem.manager.StudentManager;
import baitap.baitapthem.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        int choice = -1;
        do{
            System.out.println("Menu:");
            System.out.println("1.Thêm một sinh viên");
            System.out.println("2.Xóa một sinh viên theo tên");
            System.out.println("3.Sửa một sinh viên theo tên");
            System.out.println("4.Hiển thị tất cả sinh viên");
            System.out.println("5.Hiển thị tất cả sinh viên có điểm trung bình lớn hơn 7.5");
            System.out.println("6.Hiển thị tất cả sinh viên theo cú pháp");
            System.out.println("7.Dọc ghi ra file CSV hoặc Text");
            System.out.println("0.Exit");

            System.out.println("Nhập lựa chọn");

            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    Student student = studentManager.creatStudent();
                    studentManager.addStudent(student);
                    break;
                case 2:
                    System.out.println("Nhập tên sinh viên muốn xóa:");
                    String deleteName = scanner.nextLine();
                    System.out.println(studentManager.deleteStudentByName(deleteName));
                    break;
                case 3:
                    System.out.println("Nhập tên sinh viên muốn sửa:");
                    String editName = scanner.nextLine();
                    System.out.println(studentManager.editStudentByName(editName));
                    break;
                case 4:
                    studentManager.displayAllStudent();
                    break;
                case 5:
                    studentManager.displayStudentHasAvgPointMoreThan7();
                    break;
                case 6:
                    studentManager.displayWithRate();
                    break;
                case 7:
                    writeToFile("student.txt",studentManager.getStudents());
                    List<Student> studentDataFromFile = readDataFromFile("student.txt");
                    for (Student st: studentDataFromFile) {
                        System.out.println(st);
                    }
                    break;
            }

        }while (choice!=0);
    }

    public static void writeToFile(String path, List<Student> students){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return students;
    }
}
