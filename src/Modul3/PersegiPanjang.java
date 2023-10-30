package Modul3;

public class PersegiPanjang {
    private double panjang;
    private double lebar;

    /**
     * Konstruktor untuk membuat objek Modul3.PersegiPanjang dengan panjang dan lebar tertentu.
     *
     * @param panjang Panjang dari persegi panjang.
     * @param lebar   Lebar dari persegi panjang.
     */
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    /**
     * Menghitung luas persegi panjang.
     *
     * @return Luas persegi panjang.
     */
    public double hitungLuas() {
        return panjang * lebar;
    }

    /**
     * Metode utama untuk menguji kelas Modul3.PersegiPanjang.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam contoh ini).
     */
    public static void main(String[] args) {
        double panjangPersegiPanjang = 5.0;
        double lebarPersegiPanjang = 2.5;
        PersegiPanjang persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);

        System.out.println("Panjang Persegi Panjang: " + panjangPersegiPanjang);
        System.out.println("Lebar Persegi Panjang: " + lebarPersegiPanjang);
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas());
    }
}