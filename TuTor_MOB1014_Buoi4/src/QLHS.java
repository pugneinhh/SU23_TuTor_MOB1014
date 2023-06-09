
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Phanh
 */
public class QLHS {
//    ArrayList< HocSinh >
//-        NhapDSHS()
//-        XuatDSHS()
//-        TimTheomaHS()
    //ArrayList<HocSinh> 
    ArrayList<HocSinh> listHS=new ArrayList<>();
    //fake data
    public void fakeData(){
        listHS.add(new HocSinh("H1","Nguyen An", 20));
        listHS.add(new HocSinh("H2","Nguyen Thi C", 10));
        listHS.add(new HocSinh("H2","Nguyen Thi A", 10));
        listHS.add(new HocSinh("H4","Nguyen Quang Teo", 13));
        listHS.add(new HocSinh("H5","Nguyen Thi No", 14));
        
    }
    //nhapDSHS()
    public void nhapDSHS(){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Mời nhập thông tin cho học sinh");
            HocSinh hs=new HocSinh();
            hs.nhap();
            listHS.add(hs);//thêm học sinh vừa nhập vào list
            
            //hỏi xem có tiếp tục nhập nữa hay không?
            System.out.print("Bạn có muốn tiếp tục nhập không (Y/N): ");
            String traLoi=sc.nextLine();
            if(traLoi.equalsIgnoreCase("N")){//equalsIgnoreCase là so sánh không phân biệt hoa thường
                break;//khi người dùng nhập n/N thì sẽ dừng việc nhập lại (thoát khỏi vòng lặp)
            }
        }
    }
    
    //xuatDSHS()
    public void xuatDSHS(){
        System.out.println("Danh sách học sinh là");
        for (HocSinh hs : listHS) {//duyệt list 
            hs.inThongTin();//=> xuất ra danh sách học sinh
        }
    }
    //timTheoMaHS()
    public void timTheoMaHS(){
        Scanner sc=new Scanner(System.in);
        String ma;
        System.out.println("Mời nhập mã học sinh:");
        ma=sc.nextLine();
        System.out.printf("Học sinh có mã %s là: ",ma);
        for (HocSinh hocSinh : listHS) {//duyệt mảng kiểm tra xem có mã học sinh nào trùng không
            if(hocSinh.getMaHS().equalsIgnoreCase(ma.trim())){//.trim(): cắt khoảng trắng
                hocSinh.inThongTin();
            }
        }
    }
}
