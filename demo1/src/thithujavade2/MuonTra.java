package thithujavade2;

public class MuonTra extends Sach{
    private String maDocGia;
    private int soLuong;
    private double cuocPhi;

    public MuonTra() {
    }

    public MuonTra(String maSach, String tenSach, int namXuatBan, String maDocGia, int soLuong, double cuocPhi) {
        super(maSach, tenSach, namXuatBan);
        this.maDocGia = maDocGia;
        this.soLuong = soLuong;
        this.cuocPhi = cuocPhi;
    }
    public double getTien() {
        return cuocPhi * soLuong;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("MuonTra{" +
                "maDocGia='" + maDocGia + '\'' +
                ", soLuong=" + soLuong +
                ", cuocPhi=" + cuocPhi +
                '}');
    }
}
