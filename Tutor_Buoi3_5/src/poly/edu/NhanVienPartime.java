
package poly.edu;

import java.util.Scanner;


public class NhanVienPartime extends NhanVien{
    private String gioiTinh;
    //Hàm tạo
    public NhanVienPartime() {
    }

    public NhanVienPartime(String gioiTinh, String manV, String hoTen, double luong) {
        super(manV, hoTen, luong);//gọi hàm tạo có tham số của cha
        this.gioiTinh = gioiTinh;
    }
    
    //set, get, toString

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return super.toString()+  " gioiTinh=" + gioiTinh + '}';
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap(); //gọi phương thức nhập của cha để nhập manv, ten, luong
        System.out.print("Mời nhập giới tính:");
        gioiTinh= sc.nextLine();
    }

    @Override
    public void inThongTin() {
        System.out.println(toString());
    }
    
    
    
    
    
}
