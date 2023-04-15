package thithujava;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        ArrayList<MayTinh> mtList = new ArrayList<>();
        QuanLyMayTinh qlmt = new QuanLyMayTinh();
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("+--------------------------------MENU--------------------------------+");
            System.out.println("1. Nhap danh sach doi tuong");
            System.out.println("2. Xuat danh sach doi tuong");
            System.out.println("3. Tim may tinh theo ma may");
            System.out.println("4. Tim may tinh theo khoang kich thuoc");
            System.out.println("5. Tim may tinh theo khoang gia tien");
            System.out.println("6. Sap xep danh sach cac may tinh theo thuoc tinh gia tien giam dan");
            System.out.println("7. Sap xep danh sach cac may tinh theo thuoc tinh ten may tang dan");
            System.out.println("8. Xuat danh sach may tinh co kich thuoc le");
            System.out.println("9. Tim may tinh bat dau voi tu hoac chu cai theo ten");
            System.out.println("10. Xuat danh sach cac may tinh co ma may bat dau la 01");
            System.out.println("11. Xoa may tinh theo ma may");
            System.out.println("12. Ke thua");
            System.out.println("0. Thoat");
            System.out.println("+--------------------------------------------------------------------+");
            System.out.print("Moi ban chon chuc nang: ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    qlmt.nhapTT(mtList);
                    break;
                case 2:
                    qlmt.xuatTT(mtList);
                    break;
                case 3:
                    qlmt.timTheoMaMay(mtList);
                    break;
                case 4:
                    qlmt.timTheoKhoangKichThuoc(mtList);
                    break;
                case 5:
                    qlmt.timTheoKhoangGiaTien(mtList);
                    break;
                case 6:
                    qlmt.sapXepGiaTienGiam(mtList);
                    break;
                case 7:
                    qlmt.sapXepTenMayTang(mtList);
                    break;
                case 8:
                    qlmt.mtKichThuocLe(mtList);
                    break;
                case 9:
//                    qlmt.mtBatDauVoiTuTheoTen(mtList);
                    qlmt.mtChuaTen(mtList);
                    break;
                case 10:
                    qlmt.mtBatDauVoiTuMa01(mtList);
                    break;
                case 11:
                    qlmt.xoaTheoMaMay(mtList);
                    break;
                case 12:
                    qlmt.keThua();
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
