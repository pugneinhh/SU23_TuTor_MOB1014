package poly.edu;

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
//        3.	Bài 3: Nhập họ tên, tuổi.
//-	Xuất: họ tên, tuổi, trạng thái. 
//-	Trong đó trạng thái như sau:
//	Nếu tuổi <15: Trẻ em.
//	Nếu tuổi từ 15 đến dưới 18: Vị thành Niên
//	Nếu tuổi từ 18-60: Tuổi lao động.
//	Còn lại: Tuổi già
        String hoTen;
        int tuoi;
        Scanner sc = new Scanner(System.in);
        //Nhập từ bàn phím
        System.out.print("Mời nhập họ Tên: ");
        hoTen = sc.nextLine();
        System.out.print("Mời nhập họ tuổi: ");
        //đọc vào 1 chuỗi, => chuyển chuỗi sang số nguyên
        tuoi = Integer.parseInt(sc.nextLine());

        //xuất ra:
        System.out.println("\nThông tin vừa nhập là:");
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);

        //in xếp loại:
        if (tuoi <15) {
            System.out.println("Trẻ em");
        } else if (tuoi<18){
            System.out.println("Vị thành Niên");
        }else if (tuoi<=60){
            System.out.println("Tuổi lao động");
        }else{
            System.out.println("Tuổi già");
        }
    }

}
