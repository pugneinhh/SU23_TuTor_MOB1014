
package poly.edu;


public class Bai1 {

   
    public static void main(String[] args) {
//       1.	Bài 1: Vòng lặp for:
//-	 In các số 1->10.
        System.out.print("Các số từ 1 đến 10 là:");
        for (int i = 1; i <=10; i++) {
            System.out.print(i+"\t");
        }
//-	In các số từ 1 đến 10. Không in số 5.
        System.out.print("\n\nCác số từ 1 đến 10, bỏ qua số 5 là:");
        for (int i = 1; i <=10; i++) {
            if(i==5) continue;
            System.out.print(i+"\t");
        }
        
//-	In các số chẵn 1->10
        System.out.print("\n\nCác số chẵn từ 1-> 10 là:");
        for (int i = 1; i <=10; i++) {
            if (i% 2 ==0) { //% chia lấy dư
                System.out.print(i+"\t");
            }            
        }
        System.out.print("\n\nCác số chẵn từ 1-> 10 là:");
        for (int i = 2; i <=10; i+=2) {            
               System.out.print(i+"\t");                        
        }
        
//-	In các số lẻ 1->10

    }
    
}
