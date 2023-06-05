
package poly.edu;

import java.util.Scanner;

public class Bai4 {

    
    public static void main(String[] args) {
      //do… while: Nhập điểm thỏa mãn 0-10. Nếu sai thì nhập lại cho đúng.
       float diem;
        Scanner sc = new Scanner(System.in);
        do {            
            System.out.print("Mời bạn nhập điểm:");
            diem = Float.parseFloat(sc.nextLine());
            if (diem >=0 && diem <=10) {
                break;
            }
            System.out.println("Điểm bạn nhập sai rồi, vui lòng nhập lại điểm 0-10");
        }while (true);
        
        System.out.println("Điểm vừa nhập là:" + diem);
    }
    
}
