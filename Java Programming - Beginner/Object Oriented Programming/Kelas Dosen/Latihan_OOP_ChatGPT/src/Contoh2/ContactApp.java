package Contoh2;

import java.util.ArrayList;
import java.util.List;

// Interface untuk objek yang dapat dicari
interface Searchable {
    boolean search(String keyword);
}

// Kelas dasar untuk kontak
class Contact implements Searchable {
    private String nama;
    private String nomorTelepon;

    public Contact(String nama, String nomorTelepon) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
    }

    public String getNama() {
        return nama;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    @Override
    public boolean search(String keyword) {
        return nama.toLowerCase().contains(keyword.toLowerCase()) || nomorTelepon.contains(keyword);
    }
}

// Kelas untuk mengelola daftar kontak
class ContactManager {
    private List<Contact> daftarKontak = new ArrayList<>();

    public void tambahKontak(Contact kontak) {
        daftarKontak.add(kontak);
    }

    public void hapusKontak(Contact kontak) {
        daftarKontak.remove(kontak);
    }

    public void cetakDaftarKontak() {
        for (Contact kontak : daftarKontak) {
            System.out.println("Nama: " + kontak.getNama() + ", Nomor Telepon: " + kontak.getNomorTelepon());
        }
    }

    public void cariKontak(String keyword) {
        for (Contact kontak : daftarKontak) {
            if (kontak.search(keyword)) {
                System.out.println("Kontak ditemukan:");
                System.out.println("Nama: " + kontak.getNama() + ", Nomor Telepon: " + kontak.getNomorTelepon());
                return; // Hentikan pencarian setelah menemukan kontak pertama
            }
        }
        System.out.println("Kontak tidak ditemukan.");
    }
}

// Kelas utama sebagai contoh penggunaan
public class ContactApp {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();

        // Menambahkan beberapa kontak
        contactManager.tambahKontak(new Contact("John Doe", "123456789"));
        contactManager.tambahKontak(new Contact("Jane Smith", "987654321"));

        // Menampilkan daftar kontak
        System.out.println("Daftar Kontak:");
        contactManager.cetakDaftarKontak();

        // Membuat thread untuk mencari kontak
        Thread searchThread = new Thread(() -> {
            String keyword = "John";
            System.out.println("Mencari kontak dengan kata kunci: " + keyword);
            contactManager.cariKontak(keyword);
        });

        // Membuat thread untuk menambah kontak
        Thread addContactThread = new Thread(() -> {
            Contact newContact = new Contact("Bob Johnson", "555888999");
            System.out.println("Menambahkan kontak baru:");
            System.out.println("Nama: " + newContact.getNama() + ", Nomor Telepon: " + newContact.getNomorTelepon());
            contactManager.tambahKontak(newContact);
        });

        // Menjalankan kedua thread secara bersamaan
        searchThread.start();
        addContactThread.start();
    }
}

