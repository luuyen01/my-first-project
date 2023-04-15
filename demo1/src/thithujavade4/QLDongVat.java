package thithujavade4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QLDongVat {
    ArrayList<DongVat> listDV = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void nhap() {
        do {
            DongVat dv = new DongVat();
            System.out.print("Moi ban nhap ma dong vat: ");
            dv.setMa(sc.nextLine());
            System.out.print("Moi ban nhap ten dong vat: ");
            dv.setTen(sc.nextLine());
            int gioiTinh;
            do {
                System.out.print("Moi ban nhap gioi tinh dong vat (1-Duc | 2-Cai): ");
                gioiTinh = Integer.parseInt(sc.nextLine());
                if (gioiTinh != 1 && gioiTinh != 2) {
                    System.out.println("Vui long nhap lai gioi tinh!");
                }
            } while (gioiTinh != 1 && gioiTinh != 2);
            System.out.print("Moi ban nhap can nang dong vat: ");
            dv.setCanNang(Integer.parseInt(sc.nextLine()));
            listDV.add(dv);
            System.out.print("Ban co muon nhap tiep khong (Y/N): ");
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
        System.out.print("Moi ban nhap ten dong vat can tim: ");
        String timTen = sc.nextLine();
        boolean check = false;
        System.out.println("Thong tin dong vat ban muon tim la: ");
        for (DongVat dv: listDV) {
            if (dv.getTen().equalsIgnoreCase(timTen)) {
                dv.inThongTin();
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Khong co dong vat ten " + timTen + " trong danh sach");
        }
    }
    public Meo keThua() {
        System.out.print("Moi ban nhap ma meo: ");
        String ma = sc.nextLine();
        System.out.print("Moi ban nhap ten meo: ");
        String ten = sc.nextLine();
        int gioiTinh;
        do {
            System.out.print("Moi ban nhap gioi tinh meo (1-Duc | 2-Cai): ");
            gioiTinh = Integer.parseInt(sc.nextLine());
            if (gioiTinh != 1 && gioiTinh != 2) {
                System.out.println("Vui long nhap lai gioi tinh!");
            }
        } while (gioiTinh != 1 && gioiTinh != 2);
        System.out.print("Moi ban nhap can nang meo: ");
        int canNang = Integer.parseInt(sc.nextLine());
        System.out.print("Moi ban nhap tieng keu: ");
        String tiengKeu = sc.nextLine();
        Meo meo = new Meo(ma, ten, gioiTinh, canNang, tiengKeu);
        return meo;
    }
    public void inKeThua() {
        keThua().inThongTin();
    }
    public void sapXepTangTheoCanNang() {
        Collections.sort(listDV, (o1, o2) -> Integer.compare(o1.getCanNang(), o2.getCanNang()));
        this.xuat();
    }
}
