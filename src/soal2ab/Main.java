package soal2ab;

public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(4, 5);

        persegi.setPanjang(8);
        persegi.setLebar(10);

        System.out.println("Hasil: " + persegi.hitungLuas());
    }
}
