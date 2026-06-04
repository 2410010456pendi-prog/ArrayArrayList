package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    // 1. Method Tambah Mahasiswa
    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    // 2. Method Hitung Rata-Rata
    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) return 0;
        
        double total = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            total += mhs.getNilai();
        }
        return total / daftarMahasiswa.size();
    }

    // 3. Method Jumlah Lulus (memanggil method lulus() dari class Mahasiswa)
    public int jumlahLulus() {
        int count = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.lulus()) {
                count++;
            }
        }
        return count;
    }

    // 4. Method Tampilkan Semua
    public void tampilkanSemua() {
        for (Mahasiswa mhs : daftarMahasiswa) {
            System.out.println("NPM: " + mhs.getNpm() + " | Nama: " + mhs.getNama() + " | Nilai: " + mhs.getNilai());
        }
    }

    // Method tambahan untuk poin 6 (mengambil jumlah data terbaru)
    public int getJumlahData() {
        return daftarMahasiswa.size();
    }
}