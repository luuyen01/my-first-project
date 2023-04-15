package thithujavade5;

public class PhongHoc extends Phong{
    private int loaiPhong;

    public PhongHoc() {
    }

    public PhongHoc(String ten, double dienTich, int trangThai, int loaiPhong) {
        super(ten, dienTich, trangThai);
        this.loaiPhong = loaiPhong;
    }

    public int getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(int loaiPhong) {
        this.loaiPhong = loaiPhong;
    }
    public String checkLoaiPhong(int loaiPhong) {
        if (loaiPhong == 1) return "Phong Lab";
        else return "Phong Hoc";
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("PhongHoc{" +
                "loaiPhong=" + checkLoaiPhong(this.loaiPhong) +
                '}');
    }
}
