package dandyar.github.io;


/**
 * Struktur bangun datar segitiga. Kelas ini tidak memiliki fungsi setter karena,
 * alas dan tinggi segitiga bersifat Immutable.
 */
public class Segitiga extends BangunDatar {

    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Implementasi hitungLuas dari BangunDatar
    @Override
    public double hitungLuas() {
        return (alas * tinggi) / 2;
    }

    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

}
