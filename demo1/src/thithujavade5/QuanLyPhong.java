package thithujavade5;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyPhong {
    ArrayList<Phong> listPhong = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void nhap() {
        do {
            Phong p = new Phong();
            System.out.print("Moi ban nhap ten phong: ");
            p.setTen(sc.nextLine());
            System.out.print("Moi ban nhap dien tich phong: ");
            p.setDienTich(Integer.parseInt(sc.nextLine()));
            int trangThai;
            do {
                System.out.print("Moi ban nhap trang thai phong (1-hoatdong | 2-khong hoat dong): ");
                trangThai = Integer.parseInt(sc.nextLine());
                if (trangThai != 1 && trangThai != 2) {
                    System.out.println("Vui long nhap lai!");
                }
                p.setTrangThai(trangThai);
            } while (trangThai != 1 && trangThai != 2);
            listPhong.add(p);
            System.out.print("Ban co muon nhap tiep khong (Y/N): ");
            String tiepTuc = sc.nextLine();
            if (tiepTuc.equalsIgnoreCase("N")) {
                break;
            }
        } while (true);
    }
    public void xuat() {
        for (Phong p: listPhong) {
            p.inThongTin();
        }
    }
    public void xuatTheoTrangThai() {
        int trangThai;
        do {
            System.out.print("Moi ban nhap trang thai phong can tim (1-hoatdong | 2-khong hoat dong): ");
            trangThai = Integer.parseInt(sc.nextLine());
            if (trangThai != 1 && trangThai != 2) {
                System.out.println("Vui long nhap lai!");
            }
        } while (trangThai != 1 && trangThai != 2);
        System.out.println("Thong tin phong theo trang thai ban can tim la: ");
        for (Phong p: listPhong) {
            if (p.getTrangThai() == trangThai) {
                p.inThongTin();
            }
        }
    }
    public void xuatTheoKhoangDienTichDangHD() {
        System.out.print("Moi ban nhap vao dien tich min: ");
        int dtMin = Integer.parseInt(sc.nextLine());
        System.out.print("Moi ban nhap vao dien tich max: ");
        int dtMax = Integer.parseInt(sc.nextLine());
        boolean check = false;
        System.out.println("Danh sach phong dang hoat dong theo khoang dien tich la: ");
        for (Phong p: listPhong) {
            if (p.getDienTich() >= dtMin && p.getDienTich() <= dtMax && p.getTrangThai() == 1) {
                p.inThongTin();
                check = true;
            }
        }
        if (check == false ) {
            System.out.println("Khong tim thay phong dang hoat dong trong khoang dien tich tu " + dtMin + " den " + dtMax);
        }
    }
    public PhongHoc keThua() {
        PhongHoc ph = new PhongHoc("Phong tu hoc", 150, 1, 2);
        return ph;
    }
    public void inKeThua() {
        keThua().inThongTin();
    }
}
