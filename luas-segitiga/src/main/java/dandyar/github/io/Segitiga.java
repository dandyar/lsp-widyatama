package dandyar.github.io;

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
