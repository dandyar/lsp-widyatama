package dandyar.github.io;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program CLI untuk mengelola record mahasiswa
 */
public class MahasiswaApp
{
    private static final ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Prosedur untuk menjalankan program
     */
    public static void main(String[] args) {
        while (true) {

            // Menu CLI
            System.out.println("===== Menu Mahasiswa =====");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Tampilkan Semua Mahasiswa");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tambahMahasiswa();
                    break;
                case 2:
                    hapusMahasiswa();
                    break;
                case 3:
                    tampilkanMahasiswa();
                    break;
                case 4:
                    System.out.println("Terima kasih! Program selesai.");
                    return; // Exit program
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }
    }

    private static void tambahMahasiswa() {
        System.out.println("===== Tambah Mahasiswa =====");

        System.out.print("NPM: ");
        String npm = scanner.nextLine();

        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Tempat Lahir: ");
        String tempatLahir = scanner.nextLine();

        System.out.print("Tanggal Lahir: ");
        String tanggalLahir = scanner.nextLine();

        System.out.print("Program Studi: ");
        String prodi = scanner.nextLine();

        Mahasiswa mahasiswa = new Mahasiswa(npm, nama, tempatLahir, tanggalLahir, prodi);
        mahasiswaList.add(mahasiswa);
        System.out.println("Mahasiswa berhasil ditambahkan!");
    }

    private static void hapusMahasiswa() {
        System.out.println("===== Hapus Mahasiswa =====");

        System.out.print("Masukkan NPM mahasiswa yang akan dihapus: ");
        String npm = scanner.nextLine();

        // Cari mahasiswa berdasarkan NPM
        boolean found = false;
        for (Mahasiswa mahasiswa : mahasiswaList) {
            if (mahasiswa.npm().equals(npm)) {
                mahasiswaList.remove(mahasiswa);
                found = true;
                System.out.println("Mahasiswa dengan NPM " + npm + " berhasil dihapus.");
                break;
            }
        }

        if (!found) {
            System.out.println("Mahasiswa dengan NPM " + npm + " tidak ditemukan.");
        }
    }


    private static void tampilkanMahasiswa() {
        System.out.println("===== Daftar Mahasiswa =====");

        if (mahasiswaList.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa.");
        } else {
            for (Mahasiswa mahasiswa : mahasiswaList) {
                System.out.println("NPM: " + mahasiswa.npm());
                System.out.println("Nama: " + mahasiswa.nama());
                System.out.println("Tempat Lahir: " + mahasiswa.tempatLahir());
                System.out.println("Tanggal Lahir: " + mahasiswa.tanggalLahir());
                System.out.println("Program Studi: " + mahasiswa.prodi());
                System.out.println("----------------------------");
            }
        }
    }
}
