package dandyar.github.io;

/**
 * Struktur data mahasiswa
 */
public record Mahasiswa (
        String npm,
        String nama,
        String tempatLahir,
        String tanggalLahir,
        String prodi
) {}
