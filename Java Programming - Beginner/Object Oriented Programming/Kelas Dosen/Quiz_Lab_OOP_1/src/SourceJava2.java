import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SourceJava2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> regularMenuCodes = new ArrayList<>();
        
        // Simulasikan beberapa kode menu reguler yang sudah ada
        regularMenuCodes.add("R001");
        regularMenuCodes.add("R002");
        regularMenuCodes.add("R003");

        int choice;
        do {
            System.out.println("Pilih operasi:");
            System.out.println("1. Tampilkan Menu Reguler");
            System.out.println("2. Tambah Menu Reguler");
            System.out.println("3. Hapus Menu Reguler");
            System.out.println("4. Selesai");
            System.out.print("Masukkan pilihan: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    // Tampilkan menu reguler yang sudah ada
                    System.out.println("Menu Reguler yang Tersedia:");
                    for (String code : regularMenuCodes) {
                        System.out.println(code);
                    }
                    break;
                case 2:
                    // Masukkan kode untuk menu reguler
                    System.out.println("Masukkan data untuk menu reguler");
                    // Lakukan validasi dan simpan data menu reguler
                    // ...
                    System.out.println("Add Success");
                    break;
                case 3:
                    // Hapus menu reguler
                    System.out.print("Masukkan kode menu reguler yang ingin dihapus (Rxxx): ");
                    String codeToDelete = input.next();

                    // Lakukan validasi kode menu reguler
                    if (codeToDelete.length() == 4 && codeToDelete.charAt(0) == 'R') {
                        if (regularMenuCodes.contains(codeToDelete)) {
                            regularMenuCodes.remove(codeToDelete);
                            System.out.println("Delete Success");
                        } else {
                            System.out.println("Code is Wrong");
                        }
                    } else {
                        System.out.println("Kode tidak valid. Coba lagi.");
                    }
                    break;
                case 4:
                    System.out.println("Selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
                    break;
            }
        } while (choice != 4);

        input.close();
    }
}
