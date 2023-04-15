package thithujavade3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QLPH {
    ArrayList<PhongHoc> phongList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void nhapTT() {
        do {
            PhongHoc ph = new PhongHoc();
            System.out.print("Moi ban nhap ten phong hoc: ");
            ph.setTenPhong(sc.nextLine());
            System.out.print("Moi ban nhap nha: ");
            ph.setNha(sc.nextLine());
            System.out.print("Moi ban nhap so sinh vien: ");
            ph.setSoSV(Integer.parseInt(sc.nextLine()));
            phongList.add(ph);
            System.out.print("Ban co muon nhap tiep khong (Y/N): ");
            String tiepTuc = sc.nextLine();
            if (tiepTuc.equalsIgnoreCase("N")) {
                break;
            }
        } while (true);
    }
    public void xuatTT() {
        for (PhongHoc ph: phongList) {
            ph.inThongTin();
        }
    }
    public void xuatPhongHocNhaP() {
        boolean check = false;
        System.out.println("Thong tin phong hoc cua nha \"P\" la: ");
        for (PhongHoc ph: phongList) {
            if (ph.getNha().equalsIgnoreCase("P")) {
                ph.inThongTin();
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Khong tim thay nha \"P\" trong danh sach");
        }
    }
    public void demPhongHocNhaP() {
        int count = 0;
        for (PhongHoc ph: phongList) {
            if (ph.getNha().equalsIgnoreCase("P")) {
                count++;
            }
        }
        System.out.println("So luong phong hoc cua nha \"P\" la: " + count);
    }
    public void sapXepTheoSoSV() {
        Collections.sort(phongList, (o1, o2) -> Integer.compare(o2.getSoSV(), o1.getSoSV()));
        this.xuatTT();
    }
    public void them3PhanTu() {
        for (int i = 0; i < 3; i++) {
            PhongHoc ph = new PhongHoc();
            System.out.print("Moi ban nhap ten phong hoc: ");
            ph.setTenPhong(sc.nextLine());
            System.out.print("Moi ban nhap nha: ");
            ph.setNha(sc.nextLine());
            System.out.print("Moi ban nhap so sinh vien: ");
            ph.setSoSV(Integer.parseInt(sc.nextLine()));
            phongList.add(ph);
        }
    }
    public void keThua() {
        PhongHoiTruong pht = new PhongHoiTruong("P101", "P", 30, 100);
        pht.inThongTin();
    }
}
