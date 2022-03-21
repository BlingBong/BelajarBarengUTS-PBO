package soal2c;

public class Lingkaran implements MenghitungBangun {
    private double jari, hasilLuas;

    public Lingkaran(double jari){
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }

    @Override
    public double hitungLuas() {
        hasilLuas = PHI * (jari * jari);
        return hasilLuas;
    }
}
