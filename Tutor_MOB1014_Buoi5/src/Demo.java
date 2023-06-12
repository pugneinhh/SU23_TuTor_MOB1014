
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Phanh
 */
public class Demo {
    public static void menu() {
        System.out.println("");
        System.out.println("-----------MENU-----------");
        System.out.println("|1.Nhập DSHS              |");
        System.out.println("|2.Xuất DSHS              |");
        System.out.println("|3.Tìm theo mã HS         |");
        System.out.println("|4.Fake Data              |");
        System.out.println("|5.Học sinh chuyên        |");
        System.out.println("|6.Học sinh chuyên 1      |");
        System.out.println("|0.Thoát                  |");
        System.out.println("--------------------------");
        System.out.print("Mời bạn chọn 1 mục: ");
    }
    public static void main(String[] args) {
        int chon;
        Scanner sc=new Scanner(System.in);
        QLHS ql=new QLHS();//tạo ra đối tượng QLHS để gọi được các phương thức bên đó
        while(true){
            menu();
            chon=Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("1.Nhập DSHS");
                    ql.nhapDSHS();
                    break;
                case 2:
                    System.out.println("2.Xuất DSHS");
                    ql.xuatDSHS();
                    break;
                case 3:
                    System.out.println("3.Tìm theo mã học sinh");
                    ql.timTheoMaHS();
                    break;
                case 4:
                    System.out.println("4.Fake data");
                    ql.fakeData();
                    System.out.println("Đã thêm 5 học sinh vào list");
                    break;
                case 5:
                    System.out.println("5.Học sinh chuyên");
                    ql.hocSinhChuyen();
                    break;
                case 6:
                    System.out.println("6.Học sinh chuyên 1");
                    ql.hocSinhChuyen1();
                    break;
                    
                case 0:
                    System.out.println("Bạn chọn thoát");
                    System.exit(0);
                    break;
                default:
                   System.out.println("Chức năng bạn chọn không có. Vui lòng nhập lại");
                   break;
            }
        }
    }
}
