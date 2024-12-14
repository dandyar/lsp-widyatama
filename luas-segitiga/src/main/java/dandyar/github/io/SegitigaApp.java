package dandyar.github.io;

import java.util.Scanner;

/**
 * Program CLI untuk menghitung luas segitiga
 */
public class SegitigaApp
{
    /**
     * Prosedur untuk menjalankan program
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membiarkan user untuk input alas
        System.out.print("Masukkan alas segitiga: ");
        double alas = scanner.nextDouble();

        // Membiarkan user untuk input tinggi
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = scanner.nextDouble();

        // Membuat objek Segitiga
        Segitiga segitiga = new Segitiga(alas, tinggi);

        // Menghitung dan menampilkan luas segitiga
        double luas = segitiga.hitungLuas();
        System.out.println("Luas segitiga dengan alas " + alas + " dan tinggi " + tinggi + " adalah: " + luas);

        // Menutup scanner sehingga user tidak dapat melakukan input kembali
        scanner.close();
    }
}
