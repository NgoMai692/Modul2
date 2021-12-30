import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        int choice = -1;

        do{
            System.out.println("---------MENU----------");
            System.out.println("1.Thêm một sinh viên");
            System.out.println("2.Sửa một sinh viên");
            System.out.println("3.Xóa một sinh viên");
            System.out.println("4.In ra danh sách sắp xếp điểm trung bình tăng dần");
            System.out.println("5.In ra danh sách sắp xếp điểm trung bình giảm dần");
            System.out.println("6.Tìm sinh viên có điểm cao nhất");
            System.out.println("7.Ghi file CSV");
            System.out.println("8.Đọc file CSV");
            System.out.println("0.Exit");
            System.out.println("Nhập lựa chọn");
            System.out.println("------------------------------------------------");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    Student student = studentManager.creatStudent();
                    if(studentManager.addStudent(student)){
                        System.out.println("Thêm sinh viên thành công");
                    }else {
                        System.out.println("Không thêm được");
                    }
                    break;
                case 2:
                    System.out.println("Nhập id sinh viên muốn sửa:");
                    int editId = scanner.nextInt();
                    if(studentManager.editStudent(editId)){
                        System.out.println("Sửa thành công");
                    }else {
                        System.out.println("Không có sinh viên có Id" + editId);
                    }
                    break;
                case 3:
                    System.out.println("Nhập id sinh viên muốn xóa:");
                    int deleteId = scanner.nextInt();
                    if(studentManager.deleteStudent(deleteId)){
                        System.out.println("Xóa thành công");
                    }else {
                        System.out.println("Không có sinh viên có Id" + deleteId);
                    }
                    break;
                case 4:
                    System.out.println("Danh sách sinh viên có điểm tăng dần:");
                    System.out.println(studentManager.sortStudentUpPoint());
                    break;
                case 5:
                    System.out.println("Danh sách sinh viên có điểm giảm dần:");
                    System.out.println(studentManager.sortStudentDownPoint());
                    break;
                case 6:
                    System.out.println("Danh sách sinh vien có điểm cao nhất");
                    System.out.println(studentManager.searchMaxPoint());
                    break;
                case 7:
                    studentManager.writeFile(studentManager.getStudents(),studentManager.PATH_NAME);
                    break;
                case 8:
                    ArrayList<Student> students = studentManager.readFile(studentManager.PATH_NAME);
                    students.forEach(System.out::println);
                    break;


            }
        }while (choice!=0);
    }
}
