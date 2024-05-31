import java.util.Scanner;

abstract class Bidang {
    abstract double getLuas();
    abstract double getKeliling();
}

class SegiEmpat extends Bidang {
    private double panjang;
    private double lebar;

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getLebar() {
        return lebar;
    }

    
    public double getDiagonal() {
        return Math.sqrt(Math.pow(panjang, 2) + Math.pow(lebar, 2));
    }

    @Override
    double getLuas() {
        return panjang * lebar;
    }

    @Override
    double getKeliling() {
        return 2 * (panjang + lebar);
    }
}

class Lingkaran extends Bidang {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    double getLuas() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double getKeliling() {
        return 2 * Math.PI * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bidang bidang = null;
        int choice = 0;
        
        do {
	        System.out.println("Bentuk bidang:");
	        System.out.println("1. Segi Empat");
	        System.out.println("2. Lingkaran");
	        System.out.println("3. Exit");
	        System.out.print("Pilih bentuk bidang: ");
	        choice = scanner.nextInt();

	        if (choice == 1) {
	            SegiEmpat segiEmpat = new SegiEmpat();
	            System.out.print("Masukkan panjang segi empat: ");
	            double panjang = scanner.nextDouble();
	            System.out.print("Masukkan lebar segi empat: ");
	            double lebar = scanner.nextDouble();
	            segiEmpat.setPanjang(panjang);
	            segiEmpat.setLebar(lebar);
	            bidang = segiEmpat;
	        } else if (choice == 2){
	            Lingkaran lingkaran = new Lingkaran();
	            System.out.print("Masukkan radius lingkaran: ");
	            double radius = scanner.nextDouble();
	            lingkaran.setRadius(radius);
	            bidang = lingkaran;
	            System.out.println("Diameter \t: " + lingkaran.getDiameter());
	        }
	        System.out.println();
	        System.out.println("==============================================");
	        System.out.println("Hasil Perhitungan");
	        System.out.println("Luas \t\t: " + bidang.getLuas());
	        System.out.println("Keliling \t: " + bidang.getKeliling());
	        System.out.println("==============================================");
	        System.out.println("");
        } while (choice !=3);
       
        System.out.println("Thank You!!!");
        System.out.println("See You Later!!!");
        scanner.close();
    }
}
