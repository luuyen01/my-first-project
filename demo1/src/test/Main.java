package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        QuanLyDongVat qldv = new QuanLyDongVat();
        int option;
        do {
            System.out.println("+---------------------MENU---------------------+");
            System.out.println("1. Nhap danh sach doi tuong");
            System.out.println("2. Xuat danh sach doi tuong");
            System.out.println("3. Tim theo ten");
            System.out.println("4. Tim theo khoang can nang");
            System.out.println("5. Ke thua");
            System.out.println("0. Thoat");
            System.out.println("+----------------------------------------------+");
            System.out.print("Moi ban chon chuc nang: ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
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
                    qldv.timTheoKhoangCanNang();
                    break;
                case 5:
                    qldv.inKeThua();
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trinh!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chuc nang ban chon khong co trong chuong trinh. Vui long chon lai!");
            }
        } while (option != 0);
    }
}
