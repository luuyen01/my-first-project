package dekiemtra;

public class NganhHep extends NganhHoc{
    private int soSinhVienNH;

    public NganhHep() {
    }

    public NganhHep(String ten, int maNganh, int soGiaoVien, int soSinhVien, int soSinhVienNH) {
        super(ten, maNganh, soGiaoVien, soSinhVien);
        this.soSinhVienNH = soSinhVienNH;
    }

    public int getSoSinhVienNH() {
        return soSinhVienNH;
    }

    public void setSoSinhVienNH(int soSinhVienNH) {
        this.soSinhVienNH = soSinhVienNH;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("NganhHep{" +
                "soSinhVienNH=" + soSinhVienNH +
                '}');
    }
}
