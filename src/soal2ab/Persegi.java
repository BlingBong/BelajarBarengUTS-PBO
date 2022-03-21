package soal2ab;

public class Persegi {
    private int panjang, lebar; // attribute

    public Persegi(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int hitungLuas() {
        int hasil = this.panjang * this.lebar; // variabel

        return hasil;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
}
