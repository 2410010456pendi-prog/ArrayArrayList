package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiri2 {
    public static void main(String[] args) {
        
        ArrayList<String> daftarBelanja = new ArrayList<>();

        daftarBelanja.add("Minyak Goreng");
        daftarBelanja.add("Beras");
        daftarBelanja.add("Gula");
        daftarBelanja.add("Telur");

        daftarBelanja.remove(1); 

        System.out.println("Isi daftar belanja : " + daftarBelanja);
        System.out.println("Jumlah akhir item  : " + daftarBelanja.size());
        System.out.println(); 
        
        
        ArrayList<Integer> kumpulanAngka = new ArrayList<>();
        
        kumpulanAngka.add(23);
        kumpulanAngka.add(87);
        kumpulanAngka.add(45);
        kumpulanAngka.add(92);
        kumpulanAngka.add(12);

        int nilaiTerbesar = kumpulanAngka.get(0);

        for (int angka : kumpulanAngka) {
            if (angka > nilaiTerbesar) {
                nilaiTerbesar = angka; 
            }
        }

        System.out.println("Data angka     : " + kumpulanAngka);
        System.out.println("Nilai terbesar : " + nilaiTerbesar);
        System.out.println();

        ArrayList<String> daftarNama = new ArrayList<>();
        
        daftarNama.add("Andi");
        daftarNama.add("Budi");
        daftarNama.add("Anisa");
        daftarNama.add("Citra");
        daftarNama.add("Ahmad");
        daftarNama.add("Dewi");

        System.out.println("Nama yang diawali huruf 'A':");
        
        // 2. Cek setiap nama di dalam list
        for (String nama : daftarNama) {
            // Menggunakan method startsWith untuk mengecek huruf depan
            if (nama.startsWith("A")) {
                System.out.println("- " + nama);
            }
        }
    }
}