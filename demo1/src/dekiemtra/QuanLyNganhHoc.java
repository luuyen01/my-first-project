package dekiemtra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuanLyNganhHoc {
    ArrayList<NganhHoc> listNganh = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void nhap() {
        do {
            NganhHoc nh = new NganhHoc();
            System.out.print("Moi ban nhap ten nganh: ");
            nh.setTen(sc.nextLine());
            System.out.print("Moi ban nhap ma nganh: ");
            nh.setMaNganh(Integer.parseInt(sc.nextLine()));
            System.out.print("Moi ban nhap so giao vien: ");
            nh.setSoGiaoVien(Integer.parseInt(sc.nextLine()));
            System.out.print("Moi ban nhap so sinh vien: ");
            nh.setSoSinhVien(Integer.parseInt(sc.nextLine()));
            listNganh.add(nh);
            System.out.print("Ban co muon nhap tiep khong (Y/N): ");
            String tiepTuc = sc.nextLine();
            if (tiepTuc.equalsIgnoreCase("N")) {
                break;
            }
        } while (true);
    }
    public void xuat() {
        for (NganhHoc nh: listNganh) {
            nh.inThongTin();
        }
    }
    public void timTheoMa() {
        System.out.print("Moi ban nhap ma nganh hoc can tim: ");
        int ma = Integer.parseInt(sc.nextLine());
        boolean check = false;
        System.out.println("Thong tin nganh hoc ban can tim la: ");
        for (NganhHoc nh: listNganh) {
            if (nh.getMaNganh() == ma) {
                nh.inThongTin();
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Khong co ma nganh " + ma + " trong danh sach");
        }
    }
    public void sapXepTheoSoGiaoVien() {
        Collections.sort(listNganh, (o1, o2) -> Integer.compare(o1.getSoGiaoVien(), o2.getSoGiaoVien()));
        this.xuat();
    }
    public void timTheoKhoangSinhVien() {
        System.out.print("Moi ban nhap so sinh vien min: ");
        int min = Integer.parseInt(sc.nextLine());
        System.out.print("Moi ban nhap so sinh vien max: ");
        int max = Integer.parseInt(sc.nextLine());
        boolean check = false;
        System.out.println("Thong tin nganh hoc ban can tim la: ");
        for (NganhHoc nh: listNganh) {
            if (nh.getSoSinhVien() >= min && nh.getSoSinhVien() <= max) {
                nh.inThongTin();
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Khong co nganh hoc co so luong sinh vien trong khoang " + min + " den " + max);
        }
    }
    public void timTheoTenNganh() {
        System.out.print("Moi ban nhap ten hoac ki tu bat dau theo ten nganh: ");
        String ten = sc.nextLine();
        boolean check = false;
        for (NganhHoc nh: listNganh) {
            if (nh.getTen().trim().startsWith(ten)) {
                nh.inThongTin();
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Khong tim thay thong tin cua nganh co ten bat dau voi " + ten);
        }
    }
    public NganhHep keThua() {
        NganhHep nganhHep = new NganhHep("Cong nghe thong tin", 1, 10, 300, 150);
        return nganhHep;
    }
    public void inKeThua() {
        keThua().inThongTin();
    }
}
