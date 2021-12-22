package bai1quanlikhachsan;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachSanManager {
    private ArrayList<KhachSan> khachSans = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public KhachSanManager() {
    }

    public void displayAllGuest() {
        for (KhachSan khachSan : khachSans) {
            System.out.println(khachSan);
        }
    }

    public KhachSan creatGuestInf() {
        System.out.println("Nhập tên khách hàng: ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh của khách hàng: ");
        String birthDay = scanner.nextLine();
        System.out.println("Nhập số chứng minh nhân dân của khách hàng: ");
        long cmtId = scanner.nextLong();
        scanner.nextLine();

        Nguoi guest = new Nguoi(name, birthDay, cmtId);
        System.out.println("Nhập số ngày khách trọ: ");
        int soNgayTro = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập loại phòng của khách hàng: ");
        String loaiPhong = scanner.nextLine();
        System.out.println("Nhập giá phòng: ");
        double giaPhong = scanner.nextDouble();
        scanner.nextLine();

        return new KhachSan(guest, soNgayTro, loaiPhong, giaPhong);
    }


    public void addGuest(KhachSan khachSan) {
        khachSans.add(khachSan);
    }

    public KhachSan deleteGuest(String name) {
        boolean check = false;
        KhachSan deleteKhachSan = null;
        for (KhachSan kh : khachSans) {
            kh.getKhachhang().getName().equals(name);
            check = true;
            deleteKhachSan = kh;
            khachSans.remove(kh);
        }

        if (check) {
            System.out.println("Đã xóa thành công khách hàng!");
        } else {
            System.out.println("Không có khác hàng " + name + " trong danh sách.");
        }
        return deleteKhachSan;
    }

    public KhachSan searchGuestAndSumPriceByCmtId(long cmtId) {
        boolean check = false;
        KhachSan searchKhachSan = null;
        for (KhachSan kh : khachSans) {
            if (kh.getKhachhang().getCmtId() == cmtId) {
                check = true;
                searchKhachSan = kh;
            }
        }

        if (check) {
            System.out.println("Sô tiền khách hàng có cmt " + cmtId + " là: " + (searchKhachSan.getGiaPhong() * searchKhachSan.getSoNgayTro()));
        } else {
            System.out.println("Không có khác hàng có cmt " + cmtId + " trong danh sách.");
        }
        return searchKhachSan;
    }


}