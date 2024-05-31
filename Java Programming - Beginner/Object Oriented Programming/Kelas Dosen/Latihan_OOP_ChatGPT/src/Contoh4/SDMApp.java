package Contoh4;

import java.util.ArrayList;
import java.util.List;

// Antarmuka untuk objek yang dapat melakukan pekerjaan
interface Pekerjaan {
    void kerjakan();
}

// Kelas dasar Karyawan
class Karyawan {
    private String nama;
    private String jabatan;

    public Karyawan(String nama, String jabatan) {
        this.nama = nama;
        this.jabatan = jabatan;
    }

    public String getNama() {
        return nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Jabatan: " + jabatan;
    }
}

// Kelas turunan Manajer yang dapat melakukan pekerjaan
class Manajer extends Karyawan implements Pekerjaan {
    public Manajer(String nama) {
        super(nama, "Manajer");
    }

    @Override
    public void kerjakan() {
        System.out.println(getNama() + " sedang mengelola proyek.");
    }
}

// Kelas turunan Programmer yang dapat melakukan pekerjaan
class Programmer extends Karyawan implements Pekerjaan {
    public Programmer(String nama) {
        super(nama, "Programmer");
    }

    @Override
    public void kerjakan() {
        System.out.println(getNama() + " sedang menulis kode program.");
    }
}

// Kelas untuk mengelola SDM
class SDMManager {
    private List<Karyawan> daftarKaryawan = new ArrayList<>();

    public void tambahKaryawan(Karyawan karyawan) {
        daftarKaryawan.add(karyawan);
    }

    public void cetakDaftarKaryawan() {
        System.out.println("Daftar Karyawan:");
        for (Karyawan karyawan : daftarKaryawan) {
            System.out.println(karyawan);
        }
    }

    public List<Karyawan> getDaftarKaryawan() {
        return daftarKaryawan;
    }

    public void lakukanPekerjaan(Karyawan karyawan) {
        if (karyawan instanceof Pekerjaan) {
            Pekerjaan pekerjaan = (Pekerjaan) karyawan;
            pekerjaan.kerjakan();
        } else {
            System.out.println("Karyawan ini tidak dapat melakukan pekerjaan.");
        }
    }
}

// Kelas utama sebagai contoh penggunaan
public class SDMApp {
    public static void main(String[] args) {
        SDMManager sdmManager = new SDMManager();

        // Menambahkan beberapa karyawan ke SDM
        sdmManager.tambahKaryawan(new Manajer("Alice"));
        sdmManager.tambahKaryawan(new Programmer("Bob"));

        // Menampilkan daftar karyawan
        sdmManager.cetakDaftarKaryawan();

        // Membuat thread untuk melakukan pekerjaan manajer
        Thread manajerThread = new Thread(() -> {
            List<Karyawan> daftarKaryawan = sdmManager.getDaftarKaryawan();
            Karyawan karyawan = daftarKaryawan.get(0);
            sdmManager.lakukanPekerjaan(karyawan);
        });

        // Membuat thread untuk melakukan pekerjaan programmer
        Thread programmerThread = new Thread(() -> {
            List<Karyawan> daftarKaryawan = sdmManager.getDaftarKaryawan();
            Karyawan karyawan = daftarKaryawan.get(1);
            sdmManager.lakukanPekerjaan(karyawan);
        });

        // Menjalankan kedua thread secara bersamaan
        manajerThread.start();
        programmerThread.start();
    }
}
