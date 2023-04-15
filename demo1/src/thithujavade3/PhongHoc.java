package thithujavade3;

public class PhongHoc {
    private String tenPhong;
    private String nha;
    private int soSV;

    public PhongHoc() {
    }

    public PhongHoc(String tenPhong, String nha, int soSV) {
        this.tenPhong = tenPhong;
        this.nha = nha;
        this.soSV = soSV;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getNha() {
        return nha;
    }

    public void setNha(String nha) {
        this.nha = nha;
    }

    public int getSoSV() {
        return soSV;
    }

    public void setSoSV(int soSV) {
        this.soSV = soSV;
    }

    public void inThongTin() {
        System.out.println("PhongHoc{" +
                "tenPhong='" + tenPhong + '\'' +
                ", nha='" + nha + '\'' +
                ", soSV=" + soSV +
                '}');
    }
}
