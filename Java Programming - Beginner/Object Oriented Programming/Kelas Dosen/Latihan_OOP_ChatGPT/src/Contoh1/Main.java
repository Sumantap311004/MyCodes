package Contoh1;

//Interface Soundable
interface Soundable {
 void makeSound();
}

//Kelas dasar Hewan
class Hewan {
 private String nama;

 public Hewan(String nama) {
     this.nama = nama;
 }

 public String getNama() {
     return nama;
 }
}

//Kelas turunan Kucing
class Kucing extends Hewan implements Soundable {
 public Kucing(String nama) {
     super(nama);
 }

 @Override
 public void makeSound() {
     System.out.println(getNama() + " menghasilkan suara: Meow!");
 }
}

//Kelas turunan Anjing
class Anjing extends Hewan implements Soundable {
 public Anjing(String nama) {
     super(nama);
 }

 @Override
 public void makeSound() {
     System.out.println(getNama() + " menghasilkan suara: Woof!");
 }
}

//Kelas utama sebagai contoh penggunaan
public class Main {
 public static void main(String[] args) {
     Kucing kucing = new Kucing("Kitty");
     Anjing anjing = new Anjing("Doggy");

     // Demonstrasi Polymorphism dan Interface
     Soundable hewan1 = kucing;
     Soundable hewan2 = anjing;

     hewan1.makeSound();
     hewan2.makeSound();

     // Demonstrasi Multi-Threading
     Thread thread1 = new Thread(() -> {
         for (int i = 0; i < 5; i++) {
             System.out.println(kucing.getNama() + " berjalan ke depan");
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
     });

     Thread thread2 = new Thread(() -> {
         for (int i = 0; i < 5; i++) {
             System.out.println(anjing.getNama() + " berjalan ke depan");
             try {
                 Thread.sleep(800);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
     });

     thread1.start();
     thread2.start();
 }
}

