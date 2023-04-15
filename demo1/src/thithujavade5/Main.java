package thithujavade5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        QuanLyPhong qlp = new QuanLyPhong();
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("+-------------------------MENU-------------------------+");
            System.out.println("1. Nhap danh sach doi tuong");
            System.out.println("2. Xuat danh sach doi tuong");
            System.out.println("3. Xuat danh sach phong theo trang thai");
            System.out.println("4. Xuat danh sach phong dang hoat dong theo khoang dien tich");
            System.out.println("5. Ke thua");
            System.out.println("0. Thoat");
            System.out.println("+------------------------------------------------------+");
            System.out.print("Moi ban chon chuc nang: ");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    qlp.nhap();
                    break;
                case 2:
                    qlp.xuat();
                    break;
                case 3:
                    qlp.xuatTheoTrangThai();
                    break;
                case 4:
                    qlp.xuatTheoKhoangDienTichDangHD();
                    break;
                case 5:
                    qlp.inKeThua();
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trinh!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chuc nang ban chon khong co trong chuong trinh. Vui long nhap lai!");
            }
        } while (chon != 0);
    }
}
