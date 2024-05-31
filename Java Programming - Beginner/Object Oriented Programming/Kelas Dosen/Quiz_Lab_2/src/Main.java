import java.util.Scanner;

abstract class BidangTanah {
	protected double panjang;
    protected double lebar;

    public double getPanjang() {
        return panjang;
    }
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    public double getLebar() {
        return lebar;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    public abstract double getLuas();
    public abstract double getKeliling();
}

interface Transaksi {
    double harga_per_meter_persegi = 950000;
    double getHargaJual();
}

class Properti extends BidangTanah implements Transaksi {
    public double getLuas() {
        return getPanjang() * getLebar();
    }
    public double getKeliling() {
        return 2 * (getPanjang() + getLebar());
    }
    public double getHargaJual() {
        return getLuas() * harga_per_meter_persegi;
    }
}

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	double inputPanjang = 0;
    	System.out.print("Panjang: ");
    	inputPanjang = scan.nextDouble();
    	scan.nextLine();
    	
    	double inputLebar = 0;
    	System.out.print("Lebar: ");
    	inputLebar = scan.nextDouble();
    	scan.nextLine();
    	
        Properti properti = new Properti();
        properti.setPanjang(inputPanjang);
        properti.setLebar(inputLebar);
        
        System.out.println("======================================================================================");
        System.out.println("Hasil Kalkulasi");
        System.out.println("Panjang \t\t: " + inputPanjang + " meter");
        System.out.println("Lebar \t\t\t: " + inputLebar + " meter");
        System.out.println("Luas Tanah \t\t: " + properti.getLuas() + " meter persegi");
        System.out.println("Keliling Tanah \t\t: " + properti.getKeliling() + " meter");
        System.out.println("Harga Jual Tanah \t: " + inputPanjang + " meter * " + inputLebar + " meter" + " adalah Rp " + properti.getHargaJual());
        System.out.println("======================================================================================");
        
        
    }
}
