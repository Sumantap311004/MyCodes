package Session08_ReferencePadaObject;

class Buku {
	String judul;
	String penulis;
	
	Buku(String judul, String penulis){
		this.judul = judul;
		this.penulis = penulis;
	}
	
	void display() {
		System.out.println("\nJudul\t: "+this.judul);
		System.out.println("Penulis\t: "+this.penulis);
	}
	
}

public class Main {

	public static void main(String[] args) {
		Buku Buku1 = new Buku("Killing Comandantore", "Haruki Murakami");
		Buku1.display();
		
		//Menampilkan Address
		String addressBuku1 = Integer.toHexString(System.identityHashCode(Buku1));
		System.out.println(addressBuku1);
		
		/*
		//Assignment Object
		Buku Buku2 = Buku1; // Variable yang nampung sama dengan Buku1
		Buku2.display();
		String addressBuku2 = Integer.toHexString(System.identityHashCode(Buku2));
		System.out.println(addressBuku2);
		*/

		//Assignment Object
		Buku Buku2 = new Buku("Killing Comandantore", "Haruki Murakami");
		Buku2.display();
		String addressBuku2 = Integer.toHexString(System.identityHashCode(Buku2));
		System.out.println(addressBuku2);
		
		//Karena buku1 dan buku2 berada pada Address atau Referensi yang sama
		Buku1.judul = "Membunuh Komandantur";
		Buku1.display();
		Buku2.display();
		
		//Kita akan memasukan object ke dalam methods
		fungsi(Buku2);
		Buku1.display();
		Buku2.display();
	}
	
	public static void fungsi(Buku dataBuku) {
		String addressDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
		System.out.println("Adrress dalam Function: "+addressDataBuku);
		dataBuku.penulis = "Haruki Mahakami";
	}

}
