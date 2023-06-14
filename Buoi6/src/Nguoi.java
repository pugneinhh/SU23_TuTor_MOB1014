
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Phanh
 */
public class Nguoi {
//        Thuộc tính: ten, tuoi, mauDa
//-        Hàm tạo, set, get, toString(), nhap(), inThongTin()
    private String ten,mauDa;
    private int tuoi;
    //hàm tạo

    public Nguoi() {
    }

    public Nguoi(String ten, String mauDa, int tuoi) {
        this.ten = ten;
        this.mauDa = mauDa;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMauDa() {
        return mauDa;
    }

    public void setMauDa(String mauDa) {
        this.mauDa = mauDa;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "Nguoi{" + "ten=" + ten + ", mauDa=" + mauDa + ", tuoi=" + tuoi + '}';
    }
    //phương thức nhập
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời nhập tên:");
        ten=sc.nextLine();
        System.out.println("Mời nhập tuổi:");
        tuoi=Integer.parseInt(sc.nextLine());
        System.out.println("Mời nhập màu da:");
        mauDa=sc.nextLine();
    }
    //inThongTin()
    public void inThongTin(){
        System.out.println(toString());
    }
}
