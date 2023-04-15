package thithujavade2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        QuanLySach qls = new QuanLySach();
        int option;
        do {
            System.out.println("+---------------------------------MENU---------------------------------+");
            System.out.println("1. Nhap danh sach sach");
            System.out.println("2. Xuat danh sach sach theo khoang nam nhap vao");
            System.out.println("3. Tim cac sach co ky tu dau tien cua ten sach la \"Lap trinh\"");
            System.out.println("4. Cap nhat lai sach theo ma nhap vao");
            System.out.println("5. Sap xep sach theo ten");
            System.out.println("6. Xoa sach theo ma nhap vao");
            System.out.println("7. Ke thua");
            System.out.println("8. Dua ra sach xuat ban truoc nam duoc nhap vao");
            System.out.println("9. Thoat");
            System.out.println("+----------------------------------------------------------------------+");
            System.out.print("Moi ban chon chuc nang: ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    qls.nhapTT();
                    qls.xuatTT();
                    break;
                case 2:
                    qls.xuatSachTheoKhoangNamXuatBan();
                    break;
                case 3:
                    qls.timSachTheoKiTu();
                    break;
                case 4:
                    qls.capNhatSachTheoMa();
                    qls.xuatTT();
                    break;
                case 5:
                    qls.sapXepSachTheoTen();
                    break;
                case 6:
                    qls.xoaSachTheoMa();
                    qls.xuatTT();
                    break;
                case 7:
                    qls.keThua();
                    break;
                case 8:
                    qls.sachXuatBanTruocNamNhap();
                    break;
                case 9:
                    System.out.println("Ket thuc chuong trinh!");
                    System.exit(8);
                    break;
                default:
                    System.out.println("Chuc nang ban chon khong co trong chuong trinh. Vui long chon lai!");
            }
        } while (option != 9);
    }
}
