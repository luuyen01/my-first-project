package dekiemtra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        QuanLyNganhHoc qlnh = new QuanLyNganhHoc();
        int chon;
        do {
            System.out.println("+----------------------MENU----------------------+");
            System.out.println("1. Nhap danh sach doi tuong");
            System.out.println("2. Xuat danh sach doi tuong");
            System.out.println("3. Tim nganh hoc theo ma");
            System.out.println("4. Sap xep danh sach nganh hoc theo so giao vien");
            System.out.println("5. Tim nganh hoc theo khoang sinh vien");
            System.out.println("6. Tim theo ten hoac ki tu bat dau theo ten nganh");
            System.out.println("7. Ke thua");
            System.out.println("0. Thoat");
            System.out.println("+------------------------------------------------+");
            System.out.print("Moi ban chon chuc nang: ");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    qlnh.nhap();
                    break;
                case 2:
                    qlnh.xuat();
                    break;
                case 3:
                    qlnh.timTheoMa();
                    break;
                case 4:
                    qlnh.sapXepTheoSoGiaoVien();
                    break;
                case 5:
                    qlnh.timTheoKhoangSinhVien();
                    break;
                case 6:
                    qlnh.timTheoTenNganh();
                    break;
                case 7:
                    qlnh.inKeThua();
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trinh!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chuc nang ban chon khong co trong chuong trinh. Vui long chon lai!");
            }
        } while (chon != 0);
    }
}
