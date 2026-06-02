package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan();

        // 2. Pembuatan objek buku baru dengan menyertakan tahunTerbit
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));
        perpus.tambahBuku(new Buku("Anak Semua Bangsa", "Pramoedya", 1981)); // Tambahan untuk tes cariPenulis

        perpus.tampilkanKoleksi();
        System.out.println();

        // Uji coba proses peminjaman
        perpus.pinjamBuku("Bumi Manusia");
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
        System.out.println();

        // 1. Uji coba method kembalikanBuku
        perpus.kembalikanBuku("Bumi Manusia");
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
        System.out.println();

        // 3. Uji coba method cariPenulis
        perpus.cariPenulis("Pramoedya");
    }
}