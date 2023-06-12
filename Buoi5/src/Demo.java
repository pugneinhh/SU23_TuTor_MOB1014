
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
        System.out.println("---------MENU-------");
        System.out.println("|1.Nhập DSMT        |");
        System.out.println("|2.Xuất DSMT        |");
        System.out.println("|3.Kế thừa          |");
        System.out.println("|0.Thoát            |");
        System.out.println("--------------------");
        System.out.print("Mời bạn chọn chức năng: ");
    }
    public static void main(String[] args) {
        int chon;
        Scanner sc=new Scanner(System.in);
        MayTinhServices mts=new MayTinhServices();
        while(true){
            menu();
            chon=Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("1.Nhập DSMT");
                    mts.nhapDSMT();
                    break;
                case 2:
                    System.out.println("2.Xuất DSMT");
                    mts.xuatDSMT();
                    break;
                case 3:
                    System.out.println("3.Kế thừa");
                    mts.keThua();
                    break;
                case 0:
                    System.out.println("Bạn chọn thoát");
                    System.exit(0);
                    break;
                default:
                     System.out.println("Chức năng bạn chọn không có. Vui lòng chọn lại");
                     break;
            }
        }
    }
}
