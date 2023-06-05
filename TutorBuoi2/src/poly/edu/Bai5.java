
package poly.edu;

import java.util.Scanner;


public class Bai5 {

    
    public static void main(String[] args) {
        //do… while: Nhập điểm thỏa mãn 0-10. Nếu sai thì nhập lại cho đúng.
       float diem;
        Scanner sc = new Scanner(System.in);
        do {            
            System.out.print("Mời bạn nhập điểm:");
            diem = Float.parseFloat(sc.nextLine());            
        }while (diem <0 || diem>10 );
        
        System.out.println("Điểm vừa nhập là:" + diem);
    }
    
}
