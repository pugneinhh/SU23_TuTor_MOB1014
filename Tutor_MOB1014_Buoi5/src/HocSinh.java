
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Phanh
 */
public class HocSinh {
//          Thuộc tính: maHS, hoten, tuoi
//-        Hàm tạo, set, get, toString(), nhap(), inThongTin()
    
    //khai báo thuộc tính
    private String maHS,hoten;
    private int tuoi;
    
    //hàm tạo

    public HocSinh() {
    }

    public HocSinh(String maHS, String hoten, int tuoi) {
        this.maHS = maHS;
        this.hoten = hoten;
        this.tuoi = tuoi;
    }
    
    //phương thức get, set

    public String getMaHS() {
        return maHS;
    }

    public void setMaHS(String maHS) {
        this.maHS = maHS;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    //toString()

    @Override
    public String toString() {
        return "HocSinh{" + "maHS=" + maHS + ", hoten=" + hoten + ", tuoi=" + tuoi + '}';
    }
    
    //phương thức nhap()
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời nhập mã học sinh:");
        maHS=sc.nextLine();
        System.out.println("Mời nhập họ tên:");
        hoten=sc.nextLine();
        System.out.println("Mời nhập tuổi:");
        tuoi=Integer.parseInt(sc.nextLine());
    }
    //phương thức inThongTin()
    public void inThongTin(){
        System.out.println(toString());
    }
}
