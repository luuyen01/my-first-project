package dekiemtra;

public class NganhHoc {
    private String ten;
    private int maNganh;
    private int soGiaoVien;
    private int soSinhVien;

    public NganhHoc() {
    }

    public NganhHoc(String ten, int maNganh, int soGiaoVien, int soSinhVien) {
        this.ten = ten;
        this.maNganh = maNganh;
        this.soGiaoVien = soGiaoVien;
        this.soSinhVien = soSinhVien;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getMaNganh() {
        return maNganh;
    }

    public void setMaNganh(int maNganh) {
        this.maNganh = maNganh;
    }

    public int getSoGiaoVien() {
        return soGiaoVien;
    }

    public void setSoGiaoVien(int soGiaoVien) {
        this.soGiaoVien = soGiaoVien;
    }

    public int getSoSinhVien() {
        return soSinhVien;
    }

    public void setSoSinhVien(int soSinhVien) {
        this.soSinhVien = soSinhVien;
    }

    public void inThongTin() {
        System.out.println("NganhHoc{" +
                "ten='" + ten + '\'' +
                ", maNganh=" + maNganh +
                ", soGiaoVien=" + soGiaoVien +
                ", soSinhVien=" + soSinhVien +
                '}');
    }
}
