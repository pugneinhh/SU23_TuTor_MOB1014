package poly.edu;

import java.util.Scanner;

public class NhanVien {

    //Khai báo các thuộc tính <=> Khai báo biến
    private String manV, hoTen;
    private double luong;

    //Hàm tạo
    public NhanVien() {
    }

    public NhanVien(String manV, String hoTen, double luong) {
        this.manV = manV;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    //Các phương thức,set, get
    public String getManV() {
        return manV;
    }

    public void setManV(String manV) {
        this.manV = manV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "manV=" + manV + ", hoTen=" + hoTen + ", luong=" + luong + '}';
    }

    //Khai báo các phương thức <=> Khai báo hàm
    public void nhap() {//Nhập thông tin cho các thuộc tính
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập manv:");
        manV = sc.nextLine();
        System.out.print("Mời nhập họ tên:");
        hoTen = sc.nextLine();
        System.out.print("Mời nhập lương:");
        luong = Double.parseDouble(sc.nextLine());
    }
    public void inThongTin(){
        System.out.println(toString());
    }
}
