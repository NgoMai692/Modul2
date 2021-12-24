import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public Student creatStudent(){
        System.out.println("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi của sinh viên: ");
        int age = scanner.nextInt();
        System.out.println("Nhập điểm Toán: ");
        double mathPoint = scanner.nextDouble();
        System.out.println("Nhập điểm Lý: ");
        double physicsPoint = scanner.nextDouble();
        System.out.println("Nhập điểm Hóa: ");
        double chemistryPoint = scanner.nextDouble();
        scanner.nextLine();

        return new Student(name,age,mathPoint,physicsPoint,chemistryPoint);
    }

    public Student addStudent(Student student){
        students.add(student);
        return student;
    }

    public Student editStudentById(int id){
        Student editStudent = null;
        for (Student student:students) {
            if(student.getId() == id){
                editStudent = student;
                System.out.println("Nhập lại tên sinh viên: ");
                String name = scanner.nextLine();
                student.setName(name);
                System.out.println("Nhập lại tuổi của sinh viên: ");
                int age = scanner.nextInt();
                student.setAge(age);
                System.out.println("Nhập lại điểm Toán: ");
                double mathPoint = scanner.nextDouble();
                student.setMathPoint(mathPoint);
                System.out.println("Nhập lại điểm Lý: ");
                double physicsPoint = scanner.nextDouble();
                student.setPhysicsPoint(physicsPoint);
                System.out.println("Nhập lại điểm Hóa: ");
                double chemistryPoint = scanner.nextDouble();
                student.setChemistryPoint(chemistryPoint);
                scanner.nextLine();
            }
        }
        if(editStudent != null){
            System.out.println("Sửa thành công!");
        }else {
            System.out.println("Không tồn tại id này vui lòng nhập lại!");
        }
        return editStudent;
    }

    public Student deleteStudentById(int id){
        Student deleteStudent = null;
        for (Student student:students) {
            if(student.getId() == id){
                deleteStudent = student;
                students.remove(student);
                break;
            }
        }
        if(deleteStudent != null){
            System.out.println("Xóa thành công!");
        }else {
            System.out.println("Không tồn tại id này vui lòng nhập lại!");
        }
        return deleteStudent;
    }

    public Student searchStudentById(int id){
        Student searchStudent = null;
        for (Student student:students) {
            if(student.getId() == id){
                searchStudent = student;
                break;
            }
        }
        if(searchStudent != null){
            System.out.println("Tìm kiếm thành công!");
            System.out.println(searchStudent);
        }else {
            System.out.println("Không tồn tại id này vui lòng nhập lại!");
        }
        return searchStudent;

    }

    public ArrayList<Student> sortStudentByAvgPoint(){
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                if(st1.getAvgPoint() < st2.getAvgPoint()){
                    return -1;
                }else {
                    if(st1.getAvgPoint() ==st2.getAvgPoint()){
                        return 0;
                    }else {
                        return 1;
                    }
                }

            }
        });
        return students;
    }

    public ArrayList<Student> findStudentHasMaxPoint(){

        sortStudentByAvgPoint();
        ArrayList<Student> maxPointStudents = new  ArrayList<>();
        double maxPoint = students.get(students.size()-1).getAvgPoint();

        for (Student student:students) {
            if(student.getAvgPoint() == maxPoint){
                maxPointStudents.add(student);
            }
        }
        return maxPointStudents;
    }


}
