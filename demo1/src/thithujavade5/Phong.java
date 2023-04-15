package thithujavade5;

public class Phong {
    private String ten;
    private double dienTich;
    private int trangThai;

    public Phong() {
    }

    public Phong(String ten, double dienTich, int trangThai) {
        this.ten = ten;
        this.dienTich = dienTich;
        this.trangThai = trangThai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    public String checkTrangThai(int trangThai) {
        if (this.trangThai == 1) return "Hoat dong";
        else return "Khong hoat dong";
    }
    public void inThongTin() {
        System.out.println("Phong{" +
                "ten='" + ten + '\'' +
                ", dienTich=" + dienTich +
                ", trangThai=" + checkTrangThai(this.trangThai) +
                '}');
    }
}
