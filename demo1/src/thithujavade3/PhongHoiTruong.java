package thithujavade3;

public class PhongHoiTruong extends PhongHoc{
    private int dienTich;

    public PhongHoiTruong() {
    }

    public PhongHoiTruong(String tenPhong, String nha, int soSV, int dienTich) {
        super(tenPhong, nha, soSV);
        this.dienTich = dienTich;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("PhongHoiTruong{" +
                "dienTich=" + dienTich +
                '}');
    }
}
