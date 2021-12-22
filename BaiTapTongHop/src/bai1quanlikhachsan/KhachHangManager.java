package bai1quanlikhachsan;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class KhachHangManager {
    private ArrayList<Guest> guests;
    Scanner scanner = new Scanner(System.in);

    public ArrayList<Guest> getGuests(int size) {
         return new ArrayList<Guest>(size);
    }

    public void displayAllGuest(){
        for (int i = 0; i < guests.size(); i++) {
            System.out.println(guests.get(i));
        }
    }

    public Guest creatGuestInf() {
        System.out.println("Nhập tên khách hàng: ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh của khách hàng: ");
        String birthDay = scanner.nextLine();
        System.out.println("Nhập ngày sinh của khách hàng: ");
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

        return new Guest(guest, soNgayTro, loaiPhong, giaPhong);
    }


    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public Guest deleteGuest(String name){
        boolean check = false;
        Guest deleteGuest = null;
        for (Guest kh:guests ) {
            kh.getKhachhang().getName().equals(name);
            check = true;
            deleteGuest = kh;
            guests.remove(kh);
        }

        if (check){
            System.out.println("Đã xóa thành công khách hàng!");
        }else {
            System.out.println("Không có khác hàng " + name+ " trong danh sách.");
        }
        return deleteGuest;
    }

    public Guest searchGuestAndSumPriceByCmtId(long cmtId){
        boolean check = false;
        Guest searchGuest = null;
        for (Guest kh:guests ) {
            if(kh.getKhachhang().getCmtId() == cmtId){
                check = true;
                searchGuest = kh;
            }
        }

        if (check){
            System.out.println("Sô tiền khách hàng có cmt "+cmtId + " là: "+ (searchGuest.getGiaPhong()*searchGuest.getSoNgayTro()));
        }else {
            System.out.println("Không có khác hàng có cmt " + cmtId + " trong danh sách.");
        }
        return searchGuest;
    }
}
