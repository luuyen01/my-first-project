package thithujavade3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        QLPH qlph = new QLPH();
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("+-----------------------MENU-----------------------+");
            System.out.println("1. Nhap danh sach phong hoc");
            System.out.println("2. Xuat danh sach phong hoc");
            System.out.println("3. Xuat thong tin cac PhongHoc cua nha \"P\"");
            System.out.println("4. Cho biet nha \"P\" co bao nhieu phong hoc");
            System.out.println("5. Sap xep phong hoc theo soSV giam dan");
            System.out.println("6. Them du lieu: Them 3 phan tu vao list");
            System.out.println("7. Ke thua");
            System.out.println("0. Thoat");
            System.out.println("+--------------------------------------------------+");
            System.out.print("Moi ban chon chuc nang: ");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    qlph.nhapTT();
                    break;
                case 2:
                    qlph.xuatTT();
                    break;
                case 3:
                    qlph.xuatPhongHocNhaP();
                    break;
                case 4:
                    qlph.demPhongHocNhaP();
                    break;
                case 5:
                    qlph.sapXepTheoSoSV();
                    break;
                case 6:
                    qlph.them3PhanTu();
                    break;
                case 7:
                    qlph.keThua();
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
