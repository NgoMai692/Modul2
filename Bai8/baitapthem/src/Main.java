import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tạo mảng sinh viên");
        StudentManger studentManger = new StudentManger();
        studentManger.getStudent(scanner);
        int choice = -1;
        do{

            System.out.println("Menu:");
            System.out.println("1.Hiển thị tất cả các sinh viên");
            System.out.println("2.Hiển thị sinh viên có điểm cao nhất, thấp nhất");
            System.out.println("3.Thêm một sinh viên vào mảng");
            System.out.println("4.Xóa một sinh viên trong mảng theo tên");
            System.out.println("5.Tìm kiếm tên sinh viên theo tên");
            System.out.println("6.Hiển thị tất cả sinh viên the giới tính");
            System.out.println("7.Sắp xếp các sinh viên theo điểm trung bình tăng dần");
            System.out.println("8.Sửa 1 sinh viên theo Id");
            System.out.println("0.Exit");

            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    studentManger.displayStudents(studentManger.getStudents());
                    break;
                case 2:
                    studentManger.findMaxAndMinMediumStudent(studentManger.getStudents());
                    break;
                case 3:
                    studentManger.addAStudent(scanner);
                    break;
                case 4:
                    studentManger.deleteStudentByName(scanner);
                    break;
                case 5:
                    studentManger.findStudentByName(studentManger.getStudents(),scanner);
                    break;
                case 6:
                    studentManger.displayStudentByGender(studentManger.getStudents(),scanner);
                    break;
                case 7:

                    break;
                case 8:
                    studentManger.editStudentById(studentManger.getStudents(), scanner);
            }
        }while (choice!=0);




    }
}
