import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class StudentManager {
    public static final String PATH_NAME = "D:\\4. Outlook sync\\OneDrive\\Desktop\\Modul2\\minitestTuan4\\src\\students.csv";
    public ArrayList<Student> students = new ArrayList<>();
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
        System.out.println("Nhập tên sinh viên:");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi của sinh viên:");
        int age = scanner.nextInt();
        System.out.println("Nhập điểm môn Toán:");
        double mathPoint = scanner.nextDouble();
        System.out.println("Nhập điểm môn Vật lý:");
        double physicsPoint = scanner.nextDouble();
        System.out.println("Nhập điểm môn Hóa:");
        double chemistryPoint = scanner.nextDouble();
        scanner.nextLine();

        return new Student(name,age,mathPoint,physicsPoint,chemistryPoint);
    }

    public boolean addStudent(Student student){
        if(student!=null){
            students.add(student);
            writeFile(students,PATH_NAME);
            return true;
        }else return false;
    }

    public boolean editStudent(int id){
        int editId = -1;
        Student newStudent;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getId() == id){
                newStudent = creatStudent();
                students.remove(i);
                students.add(i,newStudent);
                writeFile(students,PATH_NAME);
                return true;
            }
        }
        return false;
    }

    public boolean deleteStudent(int id){
        int deleteId = -1;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getId() == id){
                students.remove(i);
                writeFile(students,PATH_NAME);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Student> sortStudentUpPoint(){
        students.sort((o1,o2) -> (int) (o1.getAvgPoint()-o2.getAvgPoint()));
        return students;
    }

    public ArrayList<Student> sortStudentDownPoint(){
        students.sort((o1,o2) -> (int) (o2.getAvgPoint()-o1.getAvgPoint()));
        return students;
    }

    public ArrayList<Student> searchMaxPoint(){
        ArrayList<Student> maxPointStudent = new ArrayList<>();
        double maxPoint = students.get(0).getAvgPoint();
        for (Student st: students) {
            if(st.getAvgPoint() > maxPoint){
                maxPoint = st.getAvgPoint();
            }
        }

        for (Student st: students ) {
            if (st.getAvgPoint() == maxPoint){
                maxPointStudent.add(st);
            }
        }
        return maxPointStudent;
    }

    public void writeFile(ArrayList<Student> students, String path) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            for (Student student : students) {
                bufferedWriter.write(student.getId()+","+student.getName() + "," + student.getAge() + ","
                        + student.getMathPoint() + "," + student.getPhysicsPoint() + "," + student.getChemistryPoint() +"\n");
            }
            bufferedWriter.close();
            System.out.println("Write file successfully!");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public ArrayList<Student> readFile(String path) {
        ArrayList<Student> students = new ArrayList<>();
        File file = new File(PATH_NAME);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                students.add(new Student(strings[0], Integer.parseInt(strings[1]), Double.parseDouble(strings[2]), Double.parseDouble(strings[3]), Double.parseDouble(strings[4])));
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return students;
    }

}
