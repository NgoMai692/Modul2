package baitap.baitapthem;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        CandyManager candyManager = new CandyManager();

        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.println("Menu:");
            System.out.println("1.Hiển thị tất cả kẹo trong list");
            System.out.println("2.Thêm một viên kẹo vào list");
            System.out.println("3.Xóa một viên kẹo theo ID");
            System.out.println("4.Sửa một viên kẹo theo ID");
            System.out.println("5.Hiển thị viên kẹo theo ID");
            System.out.println("6.Xóa tất cả các kẹo có màu được nhập từ bàn phím");
            System.out.println("7.Hiển thị tất cả các viên kẹo có màu sác nhập từ bàn phím");
            System.out.println("8.Tìm viên kẹo có giá cao nhất");
            System.out.println("9.Tìm giá thành kẹo và hiển thị theo tên - giá thành");
            System.out.println("0.Exit");
            System.out.println("Nhập lựa chọn");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    candyManager.displayCandy();
                    break;
                case 2:
                    candyManager.addCandy(new Candy());
                    break;
                case 3:
                    System.out.println("Nhâp id muốn xóa");
                    int id = scanner.nextInt();
                    candyManager.deleteCandyById(id);
                    break;
                case 4:
                    System.out.println("Nhâp id muốn sửa");
                    int editId = scanner.nextInt();
                    candyManager.editCandy(scanner,editId);
                    break;
                case 5:
                    System.out.println("Nhâp id muốn hiển thị");
                    int displayId = scanner.nextInt();
                    candyManager.deleteCandyById(displayId);
                    break;
                case 6:
                    System.out.println("Nhâp màu muốn xóa");
                    String color = scanner.nextLine();
                    candyManager.displayCandyByColor(color);
                    break;
                case 7:

                    break;
                case 8:
                    break;
                case 9:
            }

        } while (choice != 0);


    }


}
