
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
    public static void menu(){
        System.out.println("");
        System.out.println("-----------MENU------------");
        System.out.println("|1.Nhập DSN                |");
        System.out.println("|2.Xuất DSN                |");
        System.out.println("|3.Tìm theo khoảng tuổi    |");
        System.out.println("|4.Sắp theo tuổi giảm dần  |");
        System.out.println("|5.Kế thừa                 |");
        System.out.println("|0.Thoát                   |");
        System.out.println("---------------------------");
        System.out.print("Mời bạn chọn chức năng: ");
    }
    public static void main(String[] args) {
        int chon;
        Scanner sc=new Scanner(System.in);
        NguoiService ns=new NguoiService();
        while (true) {            
            menu();
            chon=Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("Bạn chọn chức năng 1");
                    ns.nhapDSN();
                    break;
                case 2:
                    System.out.println("Bạn chọn chức năng 2");
                    ns.xuatDSN();
                    break;
                case 3:
                    System.out.println("Bạn chọn chức năng 3");
                    ns.timTheoKhoangTuoi();
                    break;
                case 4:
                    System.out.println("Bạn chọn chức năng 4");
                    ns.sapTheoTuoiGiamDan();
                    break;
                case 5:
                    System.out.println("Bạn chọn chức năng 5");
                    ns.keThua();
                    break;
                case 0:
                    System.out.println("Bạn chọn thoát");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chức năng bạn chọn không có. Vui lòng chọn lại.");
                    break;
            }
        }
    }
}
