package poly.edu;

import java.util.ArrayList;
import java.util.Scanner;

public class QLNV {
//    -	ArrayList<NhanVien>

    ArrayList<NhanVien> lstNhavien = new ArrayList<>();

//-	NhapDSNV()
    public void NhapDSNV() {//Nhập DS cho nhân viên. Hỏi tiếp tục
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Mời nhập thông tin cho NV");
            NhanVien nv = new NhanVien(); //tạo đói tượng NhanVien
            nv.nhap(); //gọi phương thức nhap() để nhập thông tin cho nhân viên
            lstNhavien.add(nv);//Thêm nhân viên vào list
            
            //Hỏi tiếp tục
            System.out.print("Bạn có muốn tiếp tục không(Y/N):");
            String traLoi= sc.nextLine();
            if (traLoi.equalsIgnoreCase("N")) {//equalsIgnoreCase: so sanh không phân biệt hoa/thường
                break; //dừng, thoát khỏi vòng lặp
            }
        }
    }
//-	XuatDSNV()
    public void xuatDSNV(){ //Duyệt list => Xuất DSNV
        System.out.println("DSNV là:");
        for (NhanVien nv : lstNhavien) {
            nv.inThongTin();
           // System.out.println(nv);
        }
    }
//-	TimTheoKhoangLuong()
    public void timTheoKhoangLuong(){
        Scanner sc = new Scanner(System.in);
        double min, max;
        System.out.print("Mời nhập min:");
        min= Double.parseDouble(sc.nextLine());
        System.out.print("Mời nhập max:");
        max= Double.parseDouble(sc.nextLine());
        
        System.out.println("DSNV có lương từ min đến max là: ");
        for (NhanVien nv : lstNhavien) {
            if (nv.getLuong() >= min && nv.getLuong() <=max) {
                nv.inThongTin();
            }
        }
    }
}
