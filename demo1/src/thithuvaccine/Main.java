package thithuvaccine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        QLVC qlvc = new QLVC();
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("+---------------------------MENU---------------------------+");
            System.out.println("1. Nhap danh sach doi tuong");
            System.out.println("2. Xuat danh sach doi tuong");
            System.out.println("3. Xuat danh sach cac VC (ThoiGianTacDung >= 6 thang)");
            System.out.println("4. Sap xep gian dan theo thoi gian tac dung");
            System.out.println("5. Ke thua");
            System.out.println("0. Thoat");
            System.out.println("+----------------------------------------------------------+");
            System.out.print("Moi ban chon chuc nang: ");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    qlvc.nhapTT();
                    break;
                case 2:
                    qlvc.xuatTT();
                    break;
                case 3:
//                    qlvc.danhSachThoiGianTacDungVC();
//                    qlvc.sapXepGiamDanThoiGianTacDung();
                    qlvc.xuatds(qlvc);
                    break;
                case 4:
                    qlvc.sapXepGiamDanThoiGianTacDung();
                    break;
                case 5:
                    qlvc.keThua();
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trinh!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chuc nang ban chon khong co trong menu. Vui long chon lai!");
            }
        } while (chon != 0);
    }
}
