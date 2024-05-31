package Contoh3;

import java.util.ArrayList;
import java.util.List;

// Antarmuka untuk objek yang dapat dipinjam
interface DapatDipinjam {
    void pinjam();
    void kembalikan();
}

// Kelas dasar Barang
class Barang {
    private String nama;
    private double harga;

    public Barang(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Harga: $" + harga;
    }
}

// Kelas turunan Elektronik
class Elektronik extends Barang implements DapatDipinjam {
    private String merek;

    public Elektronik(String nama, double harga, String merek) {
        super(nama, harga);
        this.merek = merek;
    }

    public String getMerek() {
        return merek;
    }

    @Override
    public synchronized void pinjam() {
        System.out.println(getNama() + " telah dipinjam.");
    }

    @Override
    public synchronized void kembalikan() {
        System.out.println(getNama() + " telah dikembalikan.");
    }
}

// Kelas turunan Pakaian
class Pakaian extends Barang implements DapatDipinjam {
    private String ukuran;

    public Pakaian(String nama, double harga, String ukuran) {
        super(nama, harga);
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }

    @Override
    public synchronized void pinjam() {
        System.out.println(getNama() + " telah dipinjam.");
    }

    @Override
    public synchronized void kembalikan() {
        System.out.println(getNama() + " telah dikembalikan.");
    }
}

// Kelas untuk mengelola inventaris
class InventarisManager {
    private List<Barang> inventaris = new ArrayList<>();

    // Synchronize access to the inventaris list
    public synchronized void tambahBarang(Barang barang) {
        inventaris.add(barang);
    }

    // Synchronize access to the inventaris list
    public synchronized void cetakInventaris() {
        System.out.println("Inventaris:");
        for (Barang barang : inventaris) {
            System.out.println(barang);
        }
    }

    // Synchronize access to the inventaris list
    public synchronized void pinjamBarang(DapatDipinjam barang) {
        barang.pinjam();
    }

    // Synchronize access to the inventaris list
    public synchronized void kembalikanBarang(DapatDipinjam barang) {
        barang.kembalikan();
    }

    // Getter for inventaris list
    public List<Barang> getInventaris() {
        return inventaris;
    }
}

// Kelas utama sebagai contoh penggunaan
public class InventarisApp {
    public static void main(String[] args) {
        InventarisManager inventarisManager = new InventarisManager();

        // Menambahkan beberapa barang ke inventaris
        inventarisManager.tambahBarang(new Elektronik("Laptop", 800.0, "Dell"));
        inventarisManager.tambahBarang(new Pakaian("Jaket", 50.0, "L"));

        // Menampilkan inventaris
        inventarisManager.cetakInventaris();

        // Membuat thread untuk meminjam barang
        Thread pinjamThread = new Thread(() -> {
            List<Barang> inventaris = inventarisManager.getInventaris();
            DapatDipinjam barang = (DapatDipinjam) inventaris.get(0);
            inventarisManager.pinjamBarang(barang);
        });

        // Membuat thread untuk mengembalikan barang
        Thread kembalikanThread = new Thread(() -> {
            List<Barang> inventaris = inventarisManager.getInventaris();
            DapatDipinjam barang = (DapatDipinjam) inventaris.get(1);
            inventarisManager.kembalikanBarang(barang);
        });

        // Menjalankan kedua thread secara bersamaan
        pinjamThread.start();
        kembalikanThread.start();
    }
}
