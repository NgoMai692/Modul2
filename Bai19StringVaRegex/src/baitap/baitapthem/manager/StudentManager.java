package baitap.baitapthem.manager;

import baitap.baitapthem.model.Student;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager implements Serializable {
    private  ArrayList <Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public StudentManager() {
    }

    public ArrayList<Student> getStudents() {
        return students;
    }


    public StudentManager(ArrayList<Student> students) {
        this.students = students;
    }

    public Student creatStudent(){
        System.out.println("Nhập tên sinh của viên:");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi sinh của viên:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập giới tính của sinh viên:");
        String gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ của sinh viên:");
        String address = scanner.nextLine();
        System.out.println("Nhập điểm trung bình của sinh viên:");
        double avgPoint = scanner.nextDouble();
        scanner.nextLine();

        return new Student(name,age,gender,address,avgPoint);
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public Student deleteStudentByName(String name){
        boolean check = false;
        Student deleteStudent = null;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getName().equals(name)){
                check = true;
                deleteStudent  = students.get(i);
                break;
            }
        }
        if(check){
            students.remove(deleteStudent);
            System.out.println("Xóa thành công!");
        }else {
            System.out.println("Không có tên Sinh viên này trong danh sách");
        }
        return deleteStudent;
    }

    public Student editStudentByName(String name){
        Student editStudent = null;
        int editIndex = -1;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getName().equals(name)){
                editStudent  = students.get(i);
                editIndex = i;
                break;
            }
        }
        if(editIndex!=-1){
            students.remove(editIndex);
            System.out.println("Nhập lại thông tin sinh viên");
            Student newStudent = creatStudent();
            students.add(editIndex,newStudent);

            System.out.println("Sửa thành công!");
        }else {
            System.out.println("Không có tên Sinh viên này trong danh sách");
        }
        return new Student();
    }

    public void displayAllStudent(){
        for (Student st:students) {
            System.out.println(st);
        }
    }

    public void displayStudentHasAvgPointMoreThan7(){
        for (Student st:students) {
            if(st.getAvgPoint() >7.5){
                System.out.println(st);
            }
        }
    }

    public void displayWithRate() {
        String rate ="";
        for (Student st : students) {
            if (st.getAvgPoint() < 4.5) {
                rate ="Yếu";
            }else if (st.getAvgPoint() < 6){
                rate ="Trung Bình";
            }else if(st.getAvgPoint() < 8){
                rate ="Khá";
            }else rate = "Giỏi";

            System.out.println(st.getName()+"-" +st.getAvgPoint() +"-" +rate);
        }
    }



}
