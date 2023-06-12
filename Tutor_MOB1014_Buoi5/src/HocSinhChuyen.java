
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Phanh
 */
public class HocSinhChuyen extends HocSinh{
    private String monChuyen;

    public HocSinhChuyen() {
    }

    public HocSinhChuyen(String monChuyen, String maHS, String hoten, int tuoi) {
        super(maHS, hoten, tuoi);
        this.monChuyen = monChuyen;
    }

    public String getMonChuyen() {
        return monChuyen;
    }

    public void setMonChuyen(String monChuyen) {
        this.monChuyen = monChuyen;
    }
    
    //phương thức nhập
    @Override
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời nhập thông tin học sinh chuyên");
        super.nhap();
        System.out.println("Mời nhập môn chuyên:");
        monChuyen=sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString()+"," + " monChuyen=" + monChuyen + '}';
    }
    @Override
    public void inThongTin(){
        System.out.println("Thông tin học sinh chuyên là");
        System.out.println(super.toString());
        System.out.println("môn chuyên: "+monChuyen);
    }        
}
