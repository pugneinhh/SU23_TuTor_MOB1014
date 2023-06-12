package poly.edu;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        int chon;
        Scanner sc = new Scanner(System.in);
        QLNV ql = new QLNV(); //tạo đối tượng QLNV
        while (true) {
            menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("|1.  Nhập DSNV    |");
                    ql.NhapDSNV();
                    break;
                case 2:
                    System.out.println("|2. Xuất DSNV |");
                    ql.xuatDSNV();
                    break;
                case 3:
                    System.out.println("|3. Tìm theo khoảng lương     |");
                    ql.timTheoKhoangLuong();
                    break;
                case 4:
                    System.out.println("|4. NVPart có tham số      |");
                    NhanVienPartime nv = new NhanVienPartime("Nam", "NV99", "Lê Minh Đăng", 5000);
                    nv.inThongTin();
                    break;
                case 5:
                    System.out.println("|5. NVPart không  tham số      |");
                    NhanVienPartime nv1 = new NhanVienPartime();
                    nv1.nhap();
                    nv1.inThongTin();
                    break;
                case 11:
                    System.out.println("fake Data");
                    ql.fakeData();
                    System.out.println("Đã thêm 5 phần tử vào list");
                    break;
                case 0:
                    System.out.println("Bạn chọn thoát");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Mục bạn chọn không có, vui lòng chọn lại");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("-------------------------------");
        System.out.println("|1. Nhập DSNV                 |");
        System.out.println("|2. Xuất DSNV                 |");
        System.out.println("|3. Tìm theo khoảng lương     |");
        System.out.println("|4. NVPart có tham số         |");
        System.out.println("|5. NVPart không tham số      |");
        System.out.println("|11. fake Data                |");
        System.out.println("|0. Thoát                     |");
        System.out.println("-------------------------------");
        System.out.print("Mời bạn chọn 1 mục: ");
    }

}
