package thithujavade4;

public class DongVat {
    private String ma;
    private String ten;
    private int gioiTinh;
    private int canNang;

    public DongVat() {
    }

    public DongVat(String ma, String ten, int gioiTinh, int canNang) {
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.canNang = canNang;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    public String checkGioiTinh(int gioiTinh) {
        if (gioiTinh == 1) return "Duc";
        else return "Cai";
    }
    public void inThongTin() {
        System.out.println("DongVat{" +
                "ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                ", gioiTinh=" + checkGioiTinh(this.gioiTinh) +
                ", canNang=" + canNang +
                '}');
    }
}
