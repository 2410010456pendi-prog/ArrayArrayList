package tugas;

public class Mahasiswa {
    private String nama;
    private String npm;
    private double nilai;

    // Constructor
    public Mahasiswa(String nama, String npm, double nilai) {
        this.nama = nama;
        this.npm = npm;
        this.nilai = nilai;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter untuk npm
    public String getNpm() {
        return npm;
    }

    // Getter untuk nilai
    public double getNilai() {
        return nilai;
    }

    // Method untuk mengecek kelulusan
    public boolean lulus() {
        return this.nilai >= 60.0;
    }
}