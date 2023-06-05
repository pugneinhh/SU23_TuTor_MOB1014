
package poly.edu;

import java.util.Scanner;


public class Demo {

   
    public static void main(String[] args) {
        int chon;
        Scanner sc = new Scanner(System.in);
        while (true) {            
            menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon){
                case 1:
                    System.out.println("|1.                               |");
                    //lát phục vụ sau
                    break;
                case 2:
                    System.out.println("|2.                               |");
                    //lát phục vụ sau
                    break;
                case 0:
                    System.out.println("Bạn chọn Thoát");
                    System.exit(0); //lệnh thoát
                    break;
                default:
                    System.out.println("Mục bạn chọn không có, vui lòng chọn lại");                    
                    break;
            }
        }
    }
    public static void menu(){
        System.out.println("-----------------------------------");
        System.out.println("|1.                               |");
        System.out.println("|2.                               |");
        System.out.println("|0. Thoát                         |");
        System.out.println("-----------------------------------");
        System.out.print("Mời bạn chọn 1 mục:");
    }
    
}
