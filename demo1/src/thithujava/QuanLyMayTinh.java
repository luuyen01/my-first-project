package thithujava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyMayTinh {
//    ArrayList<MayTinh> mtList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void nhapTT(ArrayList<MayTinh> mtList) {
        do {
            MayTinh mt = new MayTinh();
            System.out.print("Moi ban nhap ma may: ");
            mt.setMaMay(sc.nextLine());
            System.out.print("Moi ban nhap ten may: ");
            mt.setTenMay(sc.nextLine());
            System.out.print("Moi ban nhap dung luong ram: ");
            mt.setRam(Integer.parseInt(sc.nextLine()));
            System.out.print("Moi ban nhap hang may: ");
            mt.setHangMay(sc.nextLine());
            System.out.print("Moi ban nhap kich thuoc: ");
            mt.setKichThuoc(Integer.parseInt(sc.nextLine()));
            System.out.print("Moi ban nhap gia tien: ");
            mt.setGiaTien(Double.parseDouble(sc.nextLine()));
            mtList.add(mt);
            System.out.print("Ban co muon nhap tiep khong (Y/N): ");
            String tieptuc = sc.nextLine();
            if (tieptuc.equalsIgnoreCase("N")) {
                break;
            }
        } while (true);
    }
    public void xuatTT(ArrayList<MayTinh> mtList) {
        for (MayTinh mt : mtList) {
            mt.inThongTin();
        }
    }
    public void timTheoMaMay(ArrayList<MayTinh> mtList) {
        System.out.print("Moi ban nhap ma may ban muon tim: ");
        String ma = sc.nextLine();
        boolean check = false;
        System.out.println("May tinh ban can tim la: ");
        for (MayTinh mt : mtList) {
            if (mt.getMaMay().equalsIgnoreCase(ma)) {
                mt.inThongTin();
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Khong co may tinh ma " + ma);
        }
    }
    public void timTheoKhoangKichThuoc(ArrayList<MayTinh> mtList) {
        System.out.print("Moi ban nhap kich thuoc min: ");
        int minKT = Integer.parseInt(sc.nextLine());
        System.out.print("Moi ban nhap kich thuoc max: ");
        int maxKT = Integer.parseInt(sc.nextLine());
        boolean check = false;
        System.out.println("May tinh ban can tim la: ");
        for (MayTinh mt : mtList) {
            if (mt.getKichThuoc() >= minKT && mt.getKichThuoc() <= maxKT) {
                mt.inThongTin();
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Khong co may tinh kich thuoc trong khoang " + minKT + " den " + maxKT);
        }
    }
    public void timTheoKhoangGiaTien(ArrayList<MayTinh> mtList) {
        System.out.print("Moi ban nhap gia tien min: ");
        double minGia = Double.parseDouble(sc.nextLine());
        System.out.print("Moi ban nhap gia tien max: ");
        double maxGia = Double.parseDouble(sc.nextLine());
        boolean check = false;
        System.out.println("May tinh ban can tim la: ");
        for (MayTinh mt : mtList) {
            if (mt.getGiaTien() >= minGia && mt.getGiaTien() <= maxGia) {
                mt.inThongTin();
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Khong co may tinh gia tien trong khoang " + minGia + " den " + maxGia);
        }
    }
    public void sapXepGiaTienGiam(ArrayList<MayTinh> mtList) {
//        Comparator<MayTinh> comp = new Comparator<MayTinh>() {
//            @Override
//            public int compare(MayTinh o1, MayTinh o2) {
//                return Double.compare(o1.getGiaTien(), o2.getGiaTien());
//            }
//        };
//        Collections.sort(mtList, comp);
        Collections.sort(mtList, (o1, o2) -> Double.compare(o2.getGiaTien(), o1.getGiaTien()));
        this.xuatTT(mtList);
    }
    public void sapXepTenMayTang(ArrayList<MayTinh> mtList) {
        Collections.sort(mtList, (arg0, arg1) -> arg0.getTenMay().compareTo(arg1.getTenMay()));
        this.xuatTT(mtList);
    }
    public void mtKichThuocLe(ArrayList<MayTinh> mtList) {
        boolean check = false;
        System.out.println("May tinh co kich thuoc le la: ");
        for (MayTinh mt : mtList) {
            if (mt.getKichThuoc() % 2 != 0) {
                mt.inThongTin();
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Khong co may tinh co kich thuoc le");
        }
    }
    public void mtBatDauVoiTuTheoTen(ArrayList<MayTinh> mtList) {
        boolean check = false;
        System.out.println("May tinh co bat dau voi chu mac la: ");
        for (MayTinh mt : mtList) {
            if (mt.getTenMay().startsWith("mac")) {
                mt.inThongTin();
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Khong co may tinh bat dau voi chu mac");
        }
    }
    public void mtChuaTen(ArrayList<MayTinh> mtList) {
        boolean check = false;
        System.out.println("Moi ban nhap ten: ");
        String ten = sc.nextLine();
        for (MayTinh mt : mtList) {
            if (mt.getTenMay().contains(ten)) {
                mt.inThongTin();
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Khong co may tinh chua chu " + ten);
        }
    }
    public void mtBatDauVoiTuMa01(ArrayList<MayTinh> mtList) {
        boolean check = false;
        System.out.println("May tinh co bat dau voi ma 01 la: ");
        for (MayTinh mt : mtList) {
            if (mt.getMaMay().startsWith("01")) {
                mt.inThongTin();
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Khong co may tinh bat dau voi ma 01");
        }
    }
    public void xoaTheoMaMay(ArrayList<MayTinh> mtList) {
        System.out.print("Moi ban nhap ma may ban muon xoa: ");
        String ma = sc.nextLine();
        boolean check = false;
        System.out.println("May tinh ban can xoa la: ");
        for (MayTinh mt : mtList) {
            if (mt.getMaMay().equalsIgnoreCase(ma)) {
                mtList.remove(mt);
                System.out.println("Ban da xoa thanh cong may tinh co ma " + ma);
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("Khong co may tinh ma " + ma);
        }
    }
    public void keThua() {
        LapTop lap = new LapTop("001", "dell", 8, "dell", 13, 30000, 20);
        lap.inThongTin();
    }
}
