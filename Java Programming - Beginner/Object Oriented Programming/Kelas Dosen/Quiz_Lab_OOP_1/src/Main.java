import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static List<String> specialMenuCodes = new ArrayList<>();
    public static List<String> regularMenuCodes = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Family Restaurant");
        System.out.println("===================");
        System.out.println("1. Add Regular Menu");
        System.out.println("2. Add Special Menu");
        System.out.println("3. Show All Menu");
        System.out.println("4. Delete Regular Menu");
        System.out.println("5. Delete Special Menu");
        System.out.println("6. Exit");

        int choice;
        do {
            System.out.print("Choice[1-6]: ");
            choice = input.nextInt();

            if (choice == 1) {
                addRegular();
            } else if (choice == 2) {
                addSpecial();
            } else if (choice == 3) {
                show();
            } else if (choice == 4) {
                deleteRegular();
            } else if (choice == 5) {
                deleteSpecial();
            } else if (choice == 6) {
                exit();
            } else {
                System.out.println("Wrong Input Number!!!");
            }

        } while (choice != 6);
    }

    public static void addRegular() {
        System.out.println("Add Regular Menu");
        System.out.println("====================");

        String regularCode;
        String regularName;
        double regularPrice;

        do {
            System.out.print("Kode Menu (Rxxx): ");
            regularCode = input.next();
        } while (!(regularCode.length() == 4 && regularCode.charAt(0) == 'R' && !regularMenuCodes.contains(regularCode)));

        do {
            System.out.print("Nama Menu (5-20 karakter): ");
            regularName = input.next();
        } while (!(regularName.length() >= 5 && regularName.length() <= 20));

        do {
            System.out.print("Harga (10.000 - 100.000): ");
            regularPrice = input.nextDouble();
        } while (!(regularPrice >= 10000 && regularPrice <= 100000));

        regularMenuCodes.add(regularCode);
        System.out.println("Add Success");
    }

    public static void addSpecial() {
        System.out.println("Add Special Menu");
        System.out.println("====================");

        String specialCode;
        String specialName;
        double specialPrice;
        int specialDiscount;

        do {
            System.out.print("Kode Menu (Sxxx): ");
            specialCode = input.next();
        } while (!(specialCode.length() == 4 && specialCode.charAt(0) == 'S' && !specialMenuCodes.contains(specialCode)));

        do {
            System.out.print("Nama Menu (5-20 karakter): ");
            specialName = input.next();
        } while (!(specialName.length() >= 5 && specialName.length() <= 20));

        do {
            System.out.print("Harga (10.000 - 100.000): ");
            specialPrice = input.nextDouble();
        } while (!(specialPrice >= 10000 && specialPrice <= 100000));

        do {
            System.out.print("Diskon (10% | 25% | 50%): ");
            specialDiscount = input.nextInt();
        } while (!(specialDiscount == 10 || specialDiscount == 25 || specialDiscount == 50));

        specialMenuCodes.add(specialCode);
        System.out.println("Add Success");
    }

    public static void show() {
        System.out.println("Regular Menu Codes: " + regularMenuCodes);
        System.out.println("Special Menu Codes: " + specialMenuCodes);
    }

    public static void deleteRegular() {
        System.out.print("Masukkan kode menu reguler yang ingin dihapus (Rxxx): ");
        String codeToDelete = input.next();

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
    }

    public static void deleteSpecial() {
        System.out.print("Masukkan kode menu special yang ingin dihapus (Sxxx): ");
        String codeToDelete = input.next();

        if (codeToDelete.length() == 4 && codeToDelete.charAt(0) == 'S') {
            if (specialMenuCodes.contains(codeToDelete)) {
                specialMenuCodes.remove(codeToDelete);
                System.out.println("Delete Success");
            } else {
                System.out.println("Code is Wrong");
            }
        } else {
            System.out.println("Kode tidak valid. Coba lagi.");
        }
    }

    public static void exit() {
        System.out.println("");
        System.out.println("Terima kasih telah menggunakan Aplikasi Menu Kami!!!");
        System.out.println("Sampai Jumpa!!!");
    }
}
