import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        int choice = -1;
        do{
            System.out.println("Menu:");
            System.out.println("1.Thêm 1 sinh viên");
            System.out.println("2.Sửa thông tin của sinh viên theo mã Id");
            System.out.println("3.Xóa sinh viên theo mã Id");
            System.out.println("4.Tìm kiếm sinh viên theo mã Id");
            System.out.println("5.In ra danh sách sinh viên được sắp xếp theo điểm trung bình");
            System.out.println("6.Tìm sinh viên có điểm cao nhất");
            System.out.println("0.Exit");
            System.out.println("Nhập lựa chọn: ");

            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    Student newStudent = studentManager.creatStudent();
                    studentManager.addStudent(newStudent);
                    break;
                case 2:
                    System.out.println("Nhập mã Id của sinh viên muốn sửa:");
                    int editId = scanner.nextInt();
                    scanner.nextLine();
                    studentManager.editStudentById(editId);
                    break;
                case 3:
                    System.out.println("Nhập mã Id của sinh viên muốn xóa:");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    studentManager.deleteStudentById(deleteId);
                    break;
                case 4:
                    System.out.println("Nhập mã Id của sinh viên muốn tìm:");
                    int searchId = scanner.nextInt();
                    scanner.nextLine();
                    studentManager.searchStudentById(searchId);
                    break;
                case 5:
                    System.out.println(studentManager.sortStudentByAvgPoint());
                    break;
                case 6:
                    System.out.println(studentManager.findStudentHasMaxPoint());
                    break;
            }

        }while (choice !=0);
    }

}
