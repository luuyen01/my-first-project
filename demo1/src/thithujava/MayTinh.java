package thithujava;

public class MayTinh {
    private String maMay;
    private String tenMay;
    private int ram;
    private String hangMay;
    private int kichThuoc;
    private double giaTien;

    public MayTinh() {
    }

    public MayTinh(String maMay, String tenMay, int ram, String hangMay, int kichThuoc, double giaTien) {
        this.maMay = maMay;
        this.tenMay = tenMay;
        this.ram = ram;
        this.hangMay = hangMay;
        this.kichThuoc = kichThuoc;
        this.giaTien = giaTien;
    }

    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getTenMay() {
        return tenMay;
    }

    public void setTenMay(String tenMay) {
        this.tenMay = tenMay;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getHangMay() {
        return hangMay;
    }

    public void setHangMay(String hangMay) {
        this.hangMay = hangMay;
    }

    public int getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(int kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public void inThongTin() {
        System.out.println("MayTinh{" +
                "maMay='" + maMay + '\'' +
                ", tenMay='" + tenMay + '\'' +
                ", ram=" + ram +
                ", hangMay='" + hangMay + '\'' +
                ", kichThuoc=" + kichThuoc +
                ", giaTien=" + giaTien +
                '}');
    }
}
