
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Phanh
 */
public class MayTinh {
//    Lớp MayTinh: có các thuộc tính: ten, hang, donGia. 
//Hàm tạo, set, get, toString(), nhap().
    private String ten,hang;
    private double donGia;
    //hàm tạo

    public MayTinh() {
    }

    public MayTinh(String ten, String hang, double donGia) {
        this.ten = ten;
        this.hang = hang;
        this.donGia = donGia;
    }
    //phương thức get,set

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    //phương thức nhập
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Mời nhập tên máy tính:");
        ten=sc.nextLine();
        System.out.println("Mời nhập hãng:");
        hang=sc.nextLine();
        System.out.println("Mời nhập đơn giá:");
        donGia=Double.parseDouble(sc.nextLine());
    }
    //toString()

    @Override
    public String toString() {
        return "MayTinh{" + "ten=" + ten + ", hang=" + hang + ", donGia=" + donGia + '}';
    }
    
}
