package thithujavade4;

import test.QuanLyDongVat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        QLDongVat qldv = new QLDongVat();
        int chon;
        do {
            System.out.println("+----------------------MENU----------------------+");
            System.out.println("1. Them dong vat");
            System.out.println("2. Hien thi danh sach dong vat");
            System.out.println("3. Tim dong vat theo ten");
            System.out.println("4. Ke thua");
            System.out.println("5. Sap xep dong vat tang dan theo can nang");
            System.out.println("0. Thoat");
            System.out.println("+------------------------------------------------+");
            System.out.print("Moi ban chon chuc nang: ");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    qldv.nhap();
                    break;
                case 2:
                    qldv.xuat();
                    break;
                case 3:
                    qldv.timTheoTen();
                    break;
                case 4:
                    qldv.inKeThua();
                    break;
                case 5:
                    qldv.sapXepTangTheoCanNang();
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
