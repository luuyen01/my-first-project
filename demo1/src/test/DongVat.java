package test;

public class DongVat {
    private String ten;
    private int canNang;
    private int gioiTinh;

    public DongVat() {
    }

    public DongVat(String ten, int canNang, int gioiTinh) {
        this.ten = ten;
        this.canNang = canNang;
        this.gioiTinh = gioiTinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public String tiengKeu(String ten) {
        if (ten.equalsIgnoreCase("meo")) return "meow meow";
        else if (ten.equalsIgnoreCase("vit")) return "quac quac";
        else if (ten.equalsIgnoreCase("ho")) return "gru gru";
        else if (ten.equalsIgnoreCase("cho")) return "gau gau";
        else return "khong xac dinh";
    }
    public String checkGioiTinh(int gioiTinh) {
        if (gioiTinh == 1) return "Duc";
        else return "Cai";
    }
    public void inThongTin() {
        System.out.println("DongVat{" +
                "ten='" + ten + '\'' +
                ", canNang=" + canNang +
                ", gioiTinh=" + checkGioiTinh(this.gioiTinh) +
                ", tiengKeu=" + tiengKeu(this.ten) +
                '}');
    }
}
