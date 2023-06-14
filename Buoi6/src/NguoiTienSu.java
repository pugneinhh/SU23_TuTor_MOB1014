
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Phanh
 */
public class NguoiTienSu extends Nguoi {
//    Có thêm thuộc tính soThich.
//-        Hàm tạo, set, get, toString(), nhap()
    private String soThich;

    public NguoiTienSu() {
    }

    public NguoiTienSu(String soThich, String ten, String mauDa, int tuoi) {
        super(ten, mauDa, tuoi);
        this.soThich = soThich;
    }

    public String getSoThich() {
        return soThich;
    }

    public void setSoThich(String soThich) {
        this.soThich = soThich;
    }

    @Override
    public String toString() {
        return super.toString()+ "NguoiTienSu{" + "soThich=" + soThich + '}';
    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        super.nhap();
        System.out.println("Mời nhập sở thích");
        soThich=sc.nextLine();
    }
}
