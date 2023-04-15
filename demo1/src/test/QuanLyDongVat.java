package test;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyDongVat {
    ArrayList<DongVat> listDV = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void nhap() {
        do {
            DongVat dv = new DongVat();
            System.out.print("Moi ban nhap ten dong vat: ");
            dv.setTen(sc.nextLine());
            System.out.print("Moi ban nhap can nang dong vat: ");
            dv.setCanNang(Integer.parseInt(sc.nextLine()));
            int gioiTinh;
            do {
                System.out.print("Moi ban nhap gioi tinh dong vat (1-Duc | 2-Cai): ");
                gioiTinh = Integer.parseInt(sc.nextLine());
                if (gioiTinh != 1 && gioiTinh != 2) {
                    System.out.println("Vui long nhap gioi tinh lai!");
                }
            } while (gioiTinh != 1 && gioiTinh != 2);
            listDV.add(dv);
            System.out.print("Ban co muon nhap lai khong (Y/N): ");
            String tiepTuc = sc.nextLine();
            if (tiepTuc.equalsIgnoreCase("N")) {
                break;
            }
        } while (true);
    }
    public void xuat() {
        for (DongVat dv: listDV) {
            dv.inThongTin();
        }
    }
    public void timTheoTen() {
        System.out.print("Moi ban nhap ten dong vat muon tim: ");
        String ten = sc.nextLine();
        boolean check = false;
        System.out.println("Thong tin dong vat ban muon tim la: ");
        for (DongVat dv: listDV) {
            if (dv.getTen().equalsIgnoreCase(ten)) {
                dv.inThongTin();
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Khong co dong vat ten: " + ten);
        }
    }
    public void timTheoKhoangCanNang() {
        System.out.print("Moi ban nhap can nang min: ");
        int canNangMin = Integer.parseInt(sc.nextLine());
        System.out.print("Moi ban nhap can nang max: ");
        int canNangMax = Integer.parseInt(sc.nextLine());
        boolean check = false;
        System.out.println("Thong tin dong vat ban muon tim la: ");
        for (DongVat dv: listDV) {
            if (dv.getCanNang() >= canNangMin && dv.getCanNang() <= canNangMax) {
                dv.inThongTin();
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Khong co dong vat trong khoang can nang tu " + canNangMin + " den " + canNangMax);
        }
    }
    public ThuCung keThua() {
        ThuCung thuCung = new ThuCung("Cho", 20, 1, "Cho01");
        return thuCung;
    }
    public void inKeThua() {
        keThua().inThongTin();
    }

}
