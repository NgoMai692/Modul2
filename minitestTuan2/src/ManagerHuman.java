import java.util.ArrayList;
import java.util.Scanner;

public class ManagerHuman implements Manager {
private ArrayList<Student> students ;
Scanner scanner= new Scanner(System.in);

    public ManagerHuman() {
    }

    public ManagerHuman(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public void display() {
        for (Student student: students ) {
            System.out.println(student.toString());
        }
    }

    @Override
    public void addHuman() {
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập điểm trung bình:");
        double avgPoint = scanner.nextDouble();
        students.add(0,new Student(name,age,avgPoint));
    }

    @Override
    public void findIndex() {
        scanner.nextLine();
        System.out.println("Nhập tên muốn tìm:");
        String findName = scanner.nextLine();
        boolean check = false;
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(findName)){
                check= true;
                index = i;
            }
        }
        if (check){
            System.out.println("ID của người  muốn tìm:" + index);
        }else {
            System.out.println("Không có người muốn tìm");
        }

    }

    @Override
    public void deleteHuman() {
        scanner.nextLine();
        System.out.println("Nhập ID của người  muốn xóa:");
        int deleteId = scanner.nextInt();
        students.remove(deleteId);
    }

    @Override
    public void edit() {
        scanner.nextLine();
        System.out.println("Nhập ID của người  muốn sửa:");
        int editId = scanner.nextInt();

        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập điểm trung bình:");
        double avgPoint = scanner.nextDouble();

        students.set(editId,new Student(name,age,avgPoint));

    }

    @Override
    public void sortByAvgPoint() {
//        students.sort(students.get());
    }

    @Override
    public void sumAvgPoint() {
        double sumAvgPoint = 0;
        for (Student student: students) {
            sumAvgPoint += student.getAvgPoint();
        }
        System.out.println("Tổng điểm:" + sumAvgPoint);
    }
}
