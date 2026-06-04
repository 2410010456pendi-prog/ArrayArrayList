// Nama = Pendi Susilo
// NPM  = 2410010456

package tugas;

public class MainTugas {
    public static void main(String[] args) {
        
        // Menyimpan daftar nama mata kuliah dalam Array String (ukuran tetap)
        String[] mataKuliah = {"Pemrograman Berorientasi Objek", "Basis Data", "Struktur Data"};
        
        System.out.println("=== DAFTAR MATA KULIAH ===");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }
        System.out.println();

        //  Membuat objek KelasKuliah
        KelasKuliah kelasA = new KelasKuliah();

        //  Menambah minimal 5 objek Mahasiswa
        //  MEMASUKKAN DATA MAHASISWA AWAL 
        kelasA.tambahMahasiswa(new Mahasiswa("Ibnu", "230001", 85.5));
        kelasA.tambahMahasiswa(new Mahasiswa("Siti", "230002", 45.0));
        kelasA.tambahMahasiswa(new Mahasiswa("Pepen", "230003", 72.0));
        kelasA.tambahMahasiswa(new Mahasiswa("Rani", "230004", 58.5));
        kelasA.tambahMahasiswa(new Mahasiswa("Andi", "230005", 90.0));
        
        // Menampilkan data mahasiswa yang telah dimasukkan
        System.out.println("\n=== DATA MAHASISWA SEKARANG ===");
        kelasA.tampilkanSemua();

        //  Menampilkan rata-rata nilai dan jumlah mahasiswa yang lulus
        System.out.println("\n=== ANALISIS KELAS ===");
        System.out.printf("Rata-rata Nilai Kelas   : %.2f\n", kelasA.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus  : " + kelasA.jumlahLulus());

        //  Menambahkan satu objek Mahasiswa baru ke dalam koleksi
        System.out.println("\n=== MENAMBAHKAN MAHASISWA BARU ===");
        kelasA.tambahMahasiswa(new Mahasiswa("Dewi", "230006", 65.0));

        //  Menampilkan kembali jumlah data terbaru
        System.out.println("\nJumlah total data mahasiswa terbaru: " + kelasA.getJumlahData() + " orang.");
        
        // 7. Menampilkan kembali semua data (termasuk mahasiswa yang baru ditambah)
        System.out.println("\n=== DATA MAHASISWA TERBARU (SETELAH UPDATE) ===");
        kelasA.tampilkanSemua();
        
    }
}
