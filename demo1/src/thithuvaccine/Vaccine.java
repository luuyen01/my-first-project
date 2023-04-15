package thithuvaccine;

public class Vaccine {
    private String maVC;
    private String tenVC;
    private float thoiGianTacDung;
    private String ngayHetHan;

    public Vaccine() {
    }

    public Vaccine(String maVC, String tenVC, float thoiGianTacDung, String ngayHetHan) {
        this.maVC = maVC;
        this.tenVC = tenVC;
        this.thoiGianTacDung = thoiGianTacDung;
        this.ngayHetHan = ngayHetHan;
    }

    public String getMaVC() {
        return maVC;
    }

    public void setMaVC(String maVC) {
        this.maVC = maVC;
    }

    public String getTenVC() {
        return tenVC;
    }

    public void setTenVC(String tenVC) {
        this.tenVC = tenVC;
    }

    public float getThoiGianTacDung() {
        return thoiGianTacDung;
    }

    public void setThoiGianTacDung(float thoiGianTacDung) {
        this.thoiGianTacDung = thoiGianTacDung;
    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    @Override
    public String toString() {
        return "Vaccine{" +
                "maVC='" + maVC + '\'' +
                ", tenVC='" + tenVC + '\'' +
                ", thoiGianTacDung=" + thoiGianTacDung +
                ", ngayHetHan='" + ngayHetHan + '\'' +
                '}';
    }

    public void inThongTin() {
        System.out.println("Vaccine{" +
                "maVC='" + maVC + '\'' +
                ", tenVC='" + tenVC + '\'' +
                ", thoiGianTacDung=" + thoiGianTacDung +
                ", ngayHetHan='" + ngayHetHan + '\'' +
                '}');
    }
}
