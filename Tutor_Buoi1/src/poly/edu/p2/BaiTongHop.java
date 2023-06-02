package poly.edu.p2;

import java.util.Scanner;

public class BaiTongHop {
    
    public static void main(String[] args) {
        int chon;
        Scanner sc = new Scanner(System.in);
        while (true) {            
            menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("|1. if...else                     |");
                    //lát sẽ phục vụ món 1
                    break;
                case 2:
                    System.out.println("|2. nhiều if                      |");
                    //lát sẽ phục vụ món 2
                    break;
                case 0:
                    System.out.println("|0. Thoát                         |");
                    System.exit(0); //lệnh thoát
                    break;
                default:
                    System.out.println("Mục bạn chọn không có, vui lòng chọn lại");
                    break;
            }
        }
        
    }
    
    public static void menu() {
        System.out.println("\n-----------------------------------");
        System.out.println("|1. if...else                     |");
        System.out.println("|2. nhiều if                      |");
        System.out.println("|0. Thoát                         |");
        System.out.println("-----------------------------------");
        System.out.print("Mời bạn chọn 1 mục:");
    }
    
}
