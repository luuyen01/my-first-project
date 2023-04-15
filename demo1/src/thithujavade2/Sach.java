package thithujavade2;

public class Sach {
    private String maSach;
    private String tenSach;
    private int namXuatBan;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, int namXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.namXuatBan = namXuatBan;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public void xuat() {
        System.out.println("Sach{" +
                "maSach='" + maSach + '\'' +
                ", tenSach='" + tenSach + '\'' +
                ", namXuatBan=" + namXuatBan +
                '}');
    }
}
