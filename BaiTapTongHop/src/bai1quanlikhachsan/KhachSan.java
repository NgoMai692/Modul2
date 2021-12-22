package bai1quanlikhachsan;

public class KhachSan extends Nguoi {
    private Nguoi khachhang;
    private int soNgayTro;
    private String loaiPhong;
    private double giaPhong;

    public KhachSan() {
    }

    public KhachSan(Nguoi khachhang, int soNgayTro, String loaiPhong, double giaPhong) {
        this.khachhang = khachhang;
        this.soNgayTro = soNgayTro;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
    }

    public Nguoi getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(Nguoi khachhang) {
        this.khachhang = khachhang;
    }

    public int getSoNgayTro() {
        return soNgayTro;
    }

    public void setSoNgayTro(int soNgayTro) {
        this.soNgayTro = soNgayTro;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public double getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(double giaPhong) {
        this.giaPhong = giaPhong;
    }

    @Override
    public String toString() {
        return "KhachSan{" +
                "khachhang=" + khachhang.getName() +
                ", ngay sinh=" + khachhang.getBirthday() +
                ", so CMT=" + khachhang.getCmtId() +
                ", soNgayTro=" + soNgayTro +
                ", loaiPhong='" + loaiPhong + '\'' +
                ", giaPhong=" + giaPhong +
                '}';
    }
}
