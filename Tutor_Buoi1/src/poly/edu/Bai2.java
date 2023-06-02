package poly.edu;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
//        Nhập họ tên, điểm. 
//-	Xuất: Họ tên, điểm, xếp loại. Trong đó: Nếu điểm >=5: 
//Xếp loại Đạt, Còn lại: Trượt
        String hoTen;
        double diem;

        //Nhập họ tên, điểm từ bàn phím
        Scanner sc = new Scanner(System.in); //tạo đối tượng Scanner
        System.out.print("Mời nhập họ tên:");
        hoTen = sc.nextLine(); //đọc vào 1 chuỗi
        System.out.print("Mời nhập điểm:");
        //đọc vào 1 chuỗi, chuyển chuỗi thành số thực
        diem = Double.parseDouble(sc.nextLine());

        //Xuất ra.
        System.out.println("\nThông tin bạn vừa nhập là:");
        System.out.println("Họ tên: " + hoTen);
        System.out.printf("Họ tên: %s \n", hoTen);
        System.out.println("Điểm: " + diem);
        System.out.printf("Điểm: %.2f\n", diem);

        //in xếp loại
        if (diem >= 5) {
            System.out.println("Xếp loại Đạt");
        } else {
            System.out.println("Xếp loại Trượt");
        }
        //format code: alt + shift + f

    }

}
