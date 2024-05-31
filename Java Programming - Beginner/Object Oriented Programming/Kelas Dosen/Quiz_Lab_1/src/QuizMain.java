import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 	Nama Lengkap : Louis Oktovianus
 	NIM	: 2602078884
 	Jurusan : Computer Science
 	Kelas : LP01
 */

class Menu {
    private String code;
    private String name;
    private double price;

    public Menu(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Kode: " + code + " | Nama: " + name + " | Harga: " + price;
    }
}

class SpecialMenu extends Menu {
    private int discount;

    public SpecialMenu(String code, String name, double price, int discount) {
        super(code, name, price);
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Kode: " + getCode() + " | Nama: " + getName() + " | Harga: " + getPrice() + " | Diskon: " + discount + "%";
    }
}

public class QuizMain {
    public static Scanner input = new Scanner(System.in);
    public static List<Menu> specialMenus = new ArrayList<>();
    public static List<Menu> regularMenus = new ArrayList<>();

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
        } while (!(regularCode.length() == 4 && regularCode.charAt(0) == 'R' && !containsMenuCode(regularCode)));

        do {
            System.out.print("Nama Menu (5-20 karakter): ");
            regularName = input.next();
        } while (!(regularName.length() >= 5 && regularName.length() <= 20));

        do {
            System.out.print("Harga (10.000 - 100.000): ");
            regularPrice = input.nextDouble();
        } while (!(regularPrice >= 10000 && regularPrice <= 100000));

        regularMenus.add(new Menu(regularCode, regularName, regularPrice));
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
            specialCode = input.nextLine();
        } while (!(specialCode.length() == 4 && specialCode.charAt(0) == 'S' && !containsMenuCode(specialCode)));

        do {
            System.out.print("Nama Menu (5-20 karakter): ");
            specialName = input.nextLine();
            
        } while (!(specialName.length() >= 5 && specialName.length() <= 20));

        do {
            System.out.print("Harga (10.000 - 100.000): ");
            specialPrice = input.nextDouble();
        } while (!(specialPrice >= 10000 && specialPrice <= 100000));

        do {
            System.out.print("Diskon (10% | 25% | 50%): ");
            specialDiscount = input.nextInt();
        } while (!(specialDiscount == 10 || specialDiscount == 25 || specialDiscount == 50));

        specialMenus.add(new SpecialMenu(specialCode, specialName, specialPrice, specialDiscount));
        System.out.println("Add Success");
    }

    public static void show() {
        System.out.println("Regular Menus:");
        for (int i = 0; i < regularMenus.size(); i++) {
            System.out.println("Menu " + (i + 1) + ": " + regularMenus.get(i));
        }

        System.out.println("Special Menus:");
        for (int i = 0; i < specialMenus.size(); i++) {
            System.out.println("Menu " + (i + 1) + ": " + specialMenus.get(i));
        }
    }

    public static void deleteRegular() {
        System.out.print("Masukkan kode menu reguler yang ingin dihapus (Rxxx): ");
        String codeToDelete = input.next();

        if (codeToDelete.length() == 4 && codeToDelete.charAt(0) == 'R' && containsMenuCode(codeToDelete)) {
            for (int i = 0; i < regularMenus.size(); i++) {
                if (regularMenus.get(i).getCode().equals(codeToDelete)) {
                    regularMenus.remove(i);
                    System.out.println("Delete Success");
                    return;
                }
            }
        }
        System.out.println("Code is Wrong");
    }

    public static void deleteSpecial() {
        System.out.print("Masukkan kode menu special yang ingin dihapus (Sxxx): ");
        String codeToDelete = input.next();

        if (codeToDelete.length() == 4 && codeToDelete.charAt(0) == 'S' && containsMenuCode(codeToDelete)) {
            for (int i = 0; i < specialMenus.size(); i++) {
                if (specialMenus.get(i).getCode().equals(codeToDelete)) {
                    specialMenus.remove(i);
                    System.out.println("Delete Success");
                    return;
                }
            }
        }
        System.out.println("Code is Wrong");
    }

    public static void exit() {
        System.out.println("");
        System.out.println("Terima kasih telah menggunakan Aplikasi Menu Kami!!!");
        System.out.println("Sampai Jumpa!!!");
    }

    public static boolean containsMenuCode(String code) {
        for (Menu menu : regularMenus) {
            if (menu.getCode().equals(code)) {
                return true;
            }
        }
        for (Menu menu : specialMenus) {
            if (menu.getCode().equals(code)) {
                return true;
            }
        }
        return false;
    }
}
