package thithujavade4;

public class Meo extends DongVat{
    private String tiengKeu;

    public Meo() {
    }

    public Meo(String ma, String ten, int gioiTinh, int canNang, String tiengKeu) {
        super(ma, ten, gioiTinh, canNang);
        this.tiengKeu = tiengKeu;
    }

    public String getTiengKeu() {
        return tiengKeu;
    }

    public void setTiengKeu(String tiengKeu) {
        this.tiengKeu = tiengKeu;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Meo{" +
                "tiengKeu='" + tiengKeu + '\'' +
                '}');
    }
}
