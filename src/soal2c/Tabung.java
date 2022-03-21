package soal2c;

public class Tabung extends Lingkaran implements MenghitungRuang {
    private double tinggi, hasilVolume;

    public Tabung(double jari, double tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }

    // override extends
    @Override
    public double hitungLuas() {
        return (22 * super.getJari() * super.getJari()) / 7;
    }

    // override implements
    @Override
    public double hitungVolume() {
        hasilVolume = PHI * (super.getJari() * super.getJari()) * tinggi;
        return hasilVolume;
    }
}
