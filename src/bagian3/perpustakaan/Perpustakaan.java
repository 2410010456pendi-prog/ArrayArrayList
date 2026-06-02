package bagian3.perpustakaan;

import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<Buku> koleksi = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        koleksi.add(buku);
    }

    public void tampilkanKoleksi() {
        System.out.println("== Koleksi Perpustakaan ==");
        for (int i = 0; i < koleksi.size(); i++) {
            Buku b = koleksi.get(i);
            System.out.println((i + 1) + ". " + b.info());
        }
    }

    public void pinjamBuku(String judul) {
        for (Buku b : koleksi) {
            if (b.getJudul().equals(judul)) {
                if (b.isDipinjam()) {
                    System.out.println(judul + " sedang dipinjam.");
                } else {
                    b.setDipinjam(true);
                    System.out.println(judul + " berhasil dipinjam.");
                }
                return;
            }
        }
        System.out.println("Buku " + judul + " tidak ditemukan.");
    }

    // 1. Method untuk mengembalikan buku
    public void kembalikanBuku(String judul) {
        for (Buku b : koleksi) {
            if (b.getJudul().equals(judul)) {
                if (!b.isDipinjam()) {
                    System.out.println("Buku " + judul + " sebenarnya tidak sedang dipinjam.");
                } else {
                    b.setDipinjam(false);
                    System.out.println("Buku " + judul + " berhasil dikembalikan.");
                }
                return;
            }
        }
        System.out.println("Buku " + judul + " tidak ditemukan.");
    }

    // 3. Method untuk mencari buku berdasarkan penulis
    public void cariPenulis(String penulis) {
        System.out.println("== Buku Karya: " + penulis + " ==");
        boolean ditemukan = false;
        for (Buku b : koleksi) {
            if (b.getPenulis().equalsIgnoreCase(penulis)) {
                System.out.println("- " + b.info());
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada koleksi buku dari penulis ini.");
        }
    }

    public int jumlahTersedia() {
        int jumlah = 0;
        for (Buku b : koleksi) {
            if (!b.isDipinjam()) {
                jumlah++;
            }
        }
        return jumlah;
    }
}