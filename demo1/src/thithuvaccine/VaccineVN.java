package thithuvaccine;

public class VaccineVN extends Vaccine{
    private String quocGia;

    public VaccineVN() {
    }

    public VaccineVN(String maVC, String tenVC, float thoiGianTacDung, String ngayHetHan, String quocGia) {
        super(maVC, tenVC, thoiGianTacDung, ngayHetHan);
        this.quocGia = quocGia;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("VaccineVN{" +
                "quocGia='" + quocGia + '\'' +
                '}');
    }
}
