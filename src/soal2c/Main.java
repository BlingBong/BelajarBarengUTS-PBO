package soal2c;

public class Main {
    public static void main(String[] args) {
        Tabung tabung = new Tabung(7, 10);

        System.out.println("Luas Lingkaran\t= " + tabung.hitungLuas());
        System.out.println("Volume Tabung\t= " + tabung.hitungVolume());
    }
}
