package thithujavade2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuanLySach {
    ArrayList<Sach> listSach = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void nhapTT() {
        do {
            Sach sach = new Sach();
            System.out.print("Moi ban nhap ma sach: ");
            sach.setMaSach(sc.nextLine());
            System.out.print("Moi ban nhap ten sach: ");
            sach.setTenSach(sc.nextLine());
            System.out.print("Moi ban nhap nam xuat ban: ");
            sach.setNamXuatBan(Integer.parseInt(sc.nextLine()));
            listSach.add(sach);
            System.out.print("Ban co muon nhap tiep khong (Y/N): ");
            String tieptuc = sc.nextLine();
            if (tieptuc.equalsIgnoreCase("N")) {
                break;
            }
        } while (true);
    }
    public void xuatTT() {
        for (Sach s: listSach) {
            s.xuat();
        }
    }
    public void xuatSachTheoKhoangNamXuatBan() {
        System.out.print("Moi ban nhap nam min: ");
        int namMin = Integer.parseInt(sc.nextLine());
        System.out.print("Moi ban nhap nam max: ");
        int namMax = Integer.parseInt(sc.nextLine());
        boolean check = false;
        for (Sach s: listSach) {
            if (s.getNamXuatBan() >= namMin && s.getNamXuatBan() <= namMax) {
                s.xuat();
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Khong co sach trong khoang nam tu " + namMin + " den " + namMax);
        }
    }
    public void timSachTheoKiTu() {
        boolean check = false;
        for (Sach s: listSach) {
            if (s.getTenSach().startsWith("Lap trinh")) {
                s.xuat();
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Khong co sach co ki tu dau tien la: \"Lap trinh\"");
        }
    }
    public void capNhatSachTheoMa() {
        System.out.print("Moi ban nhap ma sach muon cap nhat: ");
        String ma = sc.nextLine();
        boolean check = false;
        int index = 0;
        for (Sach s: listSach) {
            if (s.getMaSach().equalsIgnoreCase(ma)) {
                check = true;
                System.out.println("Cap nhat thong tin Sach (Nhan enter neu muon giu lai thong tin cu): ");
                System.out.print("Ma sach " + s.getMaSach() + ": ");
                String maMoi = sc.nextLine();
                if (!maMoi.equalsIgnoreCase("")) {
                    System.out.println("Cap nhat ma sach moi: " + maMoi);
                    s.setMaSach(maMoi);
                }
                System.out.print("Ten sach " + s.getTenSach() + ": ");
                String tenMoi = sc.nextLine();
                if (!tenMoi.equalsIgnoreCase("")) {
                    System.out.println("Cap nhat ten sach moi: " + tenMoi);
                    s.setTenSach(tenMoi);
                }
                System.out.print("Nam xuat ban sach " + s.getTenSach() + ": ");
                String namMoi = sc.nextLine();
                if (!namMoi.equalsIgnoreCase("")) {
                    System.out.println("Cap nhat nam xuat ban sach moi: " + namMoi);
                    s.setNamXuatBan(Integer.parseInt(namMoi));
                }
                listSach.set(index, s);
            } else {
                index++;
            }
        }
        if (check == false) {
            System.out.println("Khong tim thay sach co ma " + ma);
        }
    }
    public void sapXepSachTheoTen() {
        Collections.sort(listSach, (o1,o2) -> o1.getTenSach().compareTo(o2.getTenSach()));
        this.xuatTT();
    }
    public void xoaSachTheoMa() {
        System.out.print("Moi ban nhap ma Sach can xoa: ");
        String maXoa = sc.nextLine();
        boolean check = false;
        for (Sach s: listSach) {
            if (s.getMaSach().equalsIgnoreCase(maXoa)) {
                listSach.remove(maXoa);
                check = true;
            }
        }
        if (!check) {
            System.out.println("Khong co ma sach " + maXoa);
        }
    }
    public void keThua() {
        MuonTra muonTra = new MuonTra("005", "song dong em dem", 2001, "ph30953", 2, 30000);
        muonTra.xuat();
    }
    public void sachXuatBanTruocNamNhap() {
        System.out.print("Moi ban nhap nam xuat ban: ");
        int nam = Integer.parseInt(sc.nextLine());
        boolean check = false;
        for (Sach s: listSach) {
            if (s.getNamXuatBan() < nam) {
                s.xuat();
                check = true;
            }
        }
        if (!check) {
            System.out.println("Khong co sach xuat ban truoc nam " + nam);
        }
    }
}
