package test;

public class ThuCung extends DongVat{
    private String maThuCung;

    public ThuCung() {
    }

    public ThuCung(String ten, int canNang, int gioiTinh, String maThuCung) {
        super(ten, canNang, gioiTinh);
        this.maThuCung = maThuCung;
    }


    public String getMaThuCung() {
        return maThuCung;
    }

    public void setMaThuCung(String maThuCung) {
        this.maThuCung = maThuCung;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("ThuCung{" +
                "maThuCung='" + maThuCung + '\'' +
                '}');
    }
}
