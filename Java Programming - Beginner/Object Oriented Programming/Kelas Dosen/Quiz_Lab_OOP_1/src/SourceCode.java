import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SourceCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> specialMenuCodes = new ArrayList<>();
        List<String> regularMenuNames = new ArrayList<>();

        int choice;
        do {
            System.out.println("Pilih operasi:");
            System.out.println("1. Menu Reguler");
            System.out.println("2. Menu Special");
            System.out.println("3. Selesai");
            System.out.print("Masukkan pilihan: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    // Masukkan kode untuk menu reguler
                    System.out.println("Masukkan data untuk menu reguler");
                    // Lakukan validasi dan simpan data menu reguler
                    // ...
                    System.out.println("Add Success");
                    break;
                case 2:
                    // Masukkan kode untuk menu special
                    System.out.println("Masukkan data untuk menu special:");
                    System.out.print("Kode Menu (Sxxx): ");
                    String specialCode = input.next();
                    System.out.print("Nama Menu (5-20 karakter): ");
                    String specialName = input.next();
                    System.out.print("Harga (10.000 - 100.000): ");
                    double specialPrice = input.nextDouble();
                    System.out.print("Diskon (10, 25, 50): ");
                    int specialDiscount = input.nextInt();

                    // Lakukan validasi untuk kode menu special
                    if (specialCode.length() == 4 && specialCode.charAt(0) == 'S' && !specialMenuCodes.contains(specialCode)) {
                        // Lakukan validasi untuk nama menu special
                        if (specialName.length() >= 5 && specialName.length() <= 20) {
                            // Lakukan validasi untuk harga dan diskon
                            if (specialPrice >= 10000 && specialPrice <= 100000 && (specialDiscount == 10 || specialDiscount == 25 || specialDiscount == 50)) {
                                specialMenuCodes.add(specialCode);
                                System.out.println("Add Success");
                            } else {
                                System.out.println("Data tidak valid. Coba lagi.");
                            }
                        } else {
                            System.out.println("Data tidak valid. Coba lagi.");
                        }
                    } else {
                        System.out.println("Data tidak valid. Coba lagi.");
                    }
                    break;
                case 3:
                    System.out.println("Selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
                    break;
            }
        } while (choice != 3);

        input.close();
    }
}
