package Bagian1.Array;

public class LatihanMandiri {
    public static void main(String[] args) {
        
        // =================================================================
        // SOAL 1: Mencari Suhu Tertinggi dan Terendah (TANPA IMPORT)
        // =================================================================
        System.out.println("--- SOAL 1: ANALISIS SUHU ---");
        
        double[] suhuHarian = {32.5, 28.0, 35.2, 26.5, 30.1, 33.8};

        // Set nilai awal dari elemen pertama array
        double suhuTertinggi = suhuHarian[0];
        double suhuTerendah = suhuHarian[0];

        // Cari manual menggunakan perulangan
        for (int i = 1; i < suhuHarian.length; i++) {
            if (suhuHarian[i] > suhuTertinggi) {
                suhuTertinggi = suhuHarian[i];
            }
            if (suhuHarian[i] < suhuTerendah) {
                suhuTerendah = suhuHarian[i];
            }
        }

        System.out.println("Suhu Terendah : " + suhuTerendah + "°C");
        System.out.println("Suhu Tertinggi: " + suhuTertinggi + "°C");
        System.out.println(); 
        
        
        // =================================================================
        // SOAL 2: Memfilter Nama Hari (> 5 Huruf)
        // =================================================================
        System.out.println("--- SOAL 2: FILTER NAMA HARI ---");
        
        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Minggu"};

        System.out.println("Hari yang memiliki lebih dari 5 huruf:");

        for (String hari : namaHari) {
            if (hari.length() > 5) {
                System.out.println("- " + hari);
            }
        } 
        System.out.println();
        
        
        // =================================================================
        // SOAL 3: Menghitung Banyak Angka Genap
        // =================================================================
        System.out.println("--- SOAL 3: HITUNG ANGKA GENAP ---");
        
        int[] angka = {4, 8, 15, 16, 23, 42};
        int jumlahGenap = 0;

        for (int nomor : angka) {
            if (nomor % 2 == 0) {
                jumlahGenap++; 
            }
        } 
        
        System.out.println("Banyak angka genap di dalamnya: " + jumlahGenap);
    }
}