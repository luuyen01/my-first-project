package thithuvaccine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QLVC {
    ArrayList<Vaccine> vcList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void nhapTT() {
        do {
            Vaccine vc = new Vaccine();
            System.out.print("Moi ban nhap ma vaccine: ");
            vc.setMaVC(sc.nextLine());
            System.out.print("Moi ban nhap ten vaccine: ");
            vc.setTenVC(sc.nextLine());
            System.out.print("Moi ban nhap thoi gian tac dung: ");
            vc.setThoiGianTacDung(Float.parseFloat(sc.nextLine()));
            System.out.print("Moi ban nhap ngay het han: ");
            vc.setNgayHetHan(sc.nextLine());
            vcList.add(vc);
            System.out.print("Ban co muon nhap tiep khong (Y/N): ");
            String tieptuc = sc.nextLine();
            if (tieptuc.equalsIgnoreCase("N")) {
                break;
            }
        } while (true);
    }
    public void xuatTT() {
        for (Vaccine vc: vcList) {
            vc.inThongTin();
        }
    }
    public void danhSachThoiGianTacDungVC() {
        System.out.println("Danh sach cac vaccine co thoi gian tac dung >= 6 thang la: ");
        boolean check = false;
        for (Vaccine vc: vcList) {
            if (vc.getThoiGianTacDung() >= 6) {
                vc.inThongTin();
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Khong co vaccine co thoi gian tac dung >= 6 thang");
        }
    }
    public ArrayList<Vaccine> danhSachThoiGianTacDungVaccine() {
//        System.out.println("Danh sach cac vaccine co thoi gian tac dung >= 6 thang la: ");
//        boolean check = false;
        ArrayList<Vaccine> multiVaccine = new ArrayList<>();
        for (Vaccine vc: vcList) {
            if (vc.getThoiGianTacDung() >= 6) {
                multiVaccine.add(vc);
//                check = true;
            }
        }
//        if (check == false) {
//            System.out.println("Khong co vaccine co thoi gian tac dung >= 6 thang");
//        }
        return multiVaccine;
    }
    public void xuatds(QLVC qlvc) {
        ArrayList<Vaccine> listvc = qlvc.danhSachThoiGianTacDungVaccine();
        for (Vaccine vcmulti: listvc) {
            vcmulti.inThongTin();
        }
    }
    public void sapXepGiamDanThoiGianTacDung() {
        Collections.sort(vcList, (o1,o2) -> Float.compare(o2.getThoiGianTacDung(), o1.getThoiGianTacDung()));
        this.xuatTT();
    }
    public void keThua() {
        VaccineVN vcvn = new VaccineVN();
        vcvn.setMaVC("VCVN01");
        vcvn.setTenVC("Vaccine Viet Nam");
        vcvn.setThoiGianTacDung(7);
        vcvn.setNgayHetHan("30/2/2025");
        vcvn.setQuocGia("Viet Nam");
        vcvn.inThongTin();
    }
}
