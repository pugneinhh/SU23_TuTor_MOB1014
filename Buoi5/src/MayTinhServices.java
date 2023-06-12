
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
public class MayTinhServices {
//    Lớp MayTinhServices: có các phương thức nhapDSMT(), xuatDSMT(). 
    ArrayList<MayTinh> listMT=new ArrayList<>();
    public void nhapDSMT(){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Mời nhập thông tin máy tính");
            MayTinh mt=new MayTinh();
            mt.nhap();
            listMT.add(mt);
            
            //hỏi xem có tiếp tục nhập nữa hay không
            System.out.println("Bạn có muốn tiếp tục nhập không (Y/N):");
            String lc=sc.nextLine();
            if(lc.equalsIgnoreCase("N")){
                break;
            }
        }
    }
    public void xuatDSMT(){
        System.out.println("Danh sách máy tính là");
        for (MayTinh mayTinh : listMT) {
            System.out.println(mayTinh.toString());
        }
    }
    public void keThua(){
//        Tạo đối tượng MayTinhCu sử dụng hàm tạo có tham số. Xuất thông tin

        MayTinhCu mtc=new MayTinhCu(12, "dell", "dell", 2000);
        
        System.out.println(mtc.toString());
        
    }
}
