package poly.edu;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
//    while:	Nhập n. In n câu học lập trình cũng dễ thôi.
        int n=-1, i = 0;
        Scanner sc = new Scanner(System.in);
        //nhập n>0. Nếu sai thì nhập lại cho đến khi đúng.
        while (n <1) {
            System.out.print("Mời nhập số nguyên n >0:");
            n = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Số bạn vừa nhập là: " + n);
        while (i < n) {
            System.out.println("lập trình cũng dễ thôi");
            i++;
        }

    }

}
