package bai1quanlikhachsan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KhachHangManager khachHangManager = new KhachHangManager() ;
        int choice = -1;

        do{
            System.out.println("Menu:");
            System.out.println("1.Thêm khách hàng");
            System.out.println("2.Hiển thị tất cả khách");
            System.out.println("3.Tính tiền trọ tìm bằng CMT");
            System.out.println("4.Xóa khách hàng bằng tên");
            System.out.println("0.Exit");
            System.out.println("Nhập lựa chọn");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    khachHangManager.addGuest(khachHangManager.creatGuestInf());
                    break;
                case 2:
                    khachHangManager.displayAllGuest();
                    break;
                case 3:
                    System.out.println("Nhập số CMT của khách hàng muốn thanh toán:");
                    long cmtId = scanner.nextLong();
                    khachHangManager.searchGuestAndSumPriceByCmtId(cmtId);
                    break;
                case 4:
                    System.out.println("Nhập tên khách hàng muốn xóa:");
                    String name = scanner.nextLine();
                    khachHangManager.deleteGuest(name);

            }


        }while (choice !=0);

    }
}
