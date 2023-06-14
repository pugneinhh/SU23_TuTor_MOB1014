
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Phanh
 */
public class NguoiService {
//      ArrayList< Nguoi>

    ArrayList<Nguoi> lstNguoi = new ArrayList<>();
//       NhapDSN()

    public void nhapDSN() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập thông tin người:");
        while (true) {
            Nguoi n = new Nguoi();
            n.nhap();
            lstNguoi.add(n);

            System.out.print("Bạn có muốn nhập tiếp hay không(Y/N): ");
            String tl = sc.nextLine();
            if (tl.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
//-        XuatDSN()
    public void xuatDSN(){
        System.out.println("Danhsachsh người:");
        for (Nguoi nguoi : lstNguoi) {
            nguoi.inThongTin();
        }
    }
    
//-        TimTheokhoangTuoi()
    public void timTheoKhoangTuoi(){
        Scanner sc=new Scanner(System.in);
        int check=0;
        System.out.println("Mời nhập khoảng tuổi thấp nhất:");
        int min=Integer.parseInt(sc.nextLine());
        System.out.println("Mời nhập khoảng tuổi lớn nhất:");
        int max=Integer.parseInt(sc.nextLine());
        for (Nguoi nguoi : lstNguoi) {
            if(min<=nguoi.getTuoi() && nguoi.getTuoi() <=max){
                System.out.println(""+nguoi.toString());
                check=1;
            }
        }
        if(check==0){
            System.out.println("Không tìm thấy người có tuổi trong khoảng cần tìm");
        }
    }
//-        SapTheoTuoiGiamDan()
    public void sapTheoTuoiGiamDan(){
        Comparator<Nguoi> comp=new Comparator<Nguoi>() {
            @Override
            public int compare(Nguoi o1, Nguoi o2) {
               return Integer.compare(o2.getTuoi(), o1.getTuoi());
            }
        };
        Collections.sort(lstNguoi,comp);
        this.xuatDSN();
    }
    public void keThua(){
        NguoiTienSu nts=new NguoiTienSu("hát", "Nam", "Trang", 20);
        System.out.println(nts.toString());
    }
}
