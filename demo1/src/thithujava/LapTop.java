package thithujava;

public class LapTop extends MayTinh{
    private double trongLuong;

    public LapTop() {
    }

    public LapTop(String maMay, String tenMay, int ram, String hangMay, int kichThuoc, double giaTien, double trongLuong) {
        super(maMay, tenMay, ram, hangMay, kichThuoc, giaTien);
        this.trongLuong = trongLuong;
    }

    public double getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(double trongLuong) {
        this.trongLuong = trongLuong;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("LapTop{" +
                "trongLuong=" + trongLuong +
                '}');
    }
}
